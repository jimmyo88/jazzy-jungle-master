package booking;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import home.Presenter;
import home.PresenterFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 24/11/13
 * Time: 20:49
 * To change this template use File | Settings | File Templates.
 */
public class FormValidator extends HttpServlet
{
    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            if(request.getParameter("requestType").equals("calculateCost")){
                map = getCostMap(request);
                getCostReturnObject(map);
                write(response, map);
            }else{
                map = getParameterMap(request);
                write(response,map);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            out.close();
        }
    }

    private Map<String, Object> getCostReturnObject(Map<String, Object> map) {
        Integer numberOfChildren = Integer.parseInt(map.get("numberOfChildren").toString());
        Integer dipPlatters      = Integer.parseInt(map.get("dipPlatters").toString());
        Integer sandwichPlatters = Integer.parseInt(map.get("sandwichPlatters").toString());
        Boolean jazzyRequired    = Boolean.parseBoolean(map.get("jazzyRequired").toString());
        Boolean partyBags        = Boolean.parseBoolean(map.get("partyBags").toString());

        Map<String, Object> costMap = new HashMap<String, Object>();

        map.put("jazzyRequired", String.valueOf(jazzyRequired));
        map.put("jazzySelected", (jazzyRequired == true)?"Yes Please":"No thanks");
        map.put("partyBags", String.valueOf(partyBags));
        map.put("partyBagsSelected", (partyBags == true)?"Yes Please":"No thanks");
        map.put("costOfChildren", String.valueOf(getCostOfChildren(numberOfChildren)));
        map.put("numberOfChildren", String.valueOf(numberOfChildren));
        map.put("costOfSandwichPlatters", String.valueOf(sandwichPlatters * 5.00));
        map.put("numberOfSandwichPlatters", String.valueOf(sandwichPlatters));
        map.put("costOfDipsPlatters", String.valueOf(dipPlatters * 5.00));
        map.put("numberOfDipsPlatters", String.valueOf(dipPlatters));
        map.put("packageChosen", getPackageType(Double.parseDouble(getPackageCost(numberOfChildren))));
        map.put("packageCost", getPackageCost(numberOfChildren));
        map.put("totalCost", calculateTotalCost(numberOfChildren, jazzyRequired, partyBags, (dipPlatters + sandwichPlatters)));

        if (partyBags == true){map.put("partyBags", String.valueOf(numberOfChildren * 1.50));}
        else{ map.put("partyBags","0.00");}

        if (jazzyRequired == true){map.put("jazzyRequired", "10.00");}
        else{map.put("jazzyRequired","0.00"); }

        return costMap;
        }

    private double getCostOfChildren(double numberOfChildren){
        double cost;
        if(numberOfChildren <=15) return numberOfChildren * 8.00;
        if(numberOfChildren >=16 && numberOfChildren <=20) return numberOfChildren * 7.50;
        if(numberOfChildren >=21) return numberOfChildren * 7.00;
        return 0.00;
    }

    private String getPackageCost(double numberOfChildren){
        double cost;
        if(numberOfChildren <=15) return "8.00";
        if(numberOfChildren >=16 && numberOfChildren <=20) return "7.50";
        if(numberOfChildren >=21) return  "7.00";
        return "0.00";
    }

    private String getPackageType(double cost){
        if(cost == 8.00) return "Large: 10 - 15 children ";
        if(cost == 7.50) return "Medium 16 - 20 children ";
        if(cost == 7.00) return "Large  21 - 30 children ";
        return null;
    }

    public double calculateTotalCost(double numberOfChildren, Boolean jazzyRequired, Boolean partyBags, double platters){
        double totalCost= 0;
        if(partyBags){totalCost = numberOfChildren * 1.5;}
        totalCost = totalCost + getCostOfChildren(numberOfChildren);
        if(jazzyRequired){totalCost = totalCost + 10.00;}
        totalCost += platters * 5;

        return totalCost;
    }

    private Map<String,Object> getParameterMap(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();

        Enumeration parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String requestName = (String)parameterNames.nextElement();
            String comment = request.getParameter(requestName);
            if(requestName.equals("additionalComments") && comment.equals(""))comment="none";
            map.put(requestName,comment);
        }

        return map;
    }

    private Map<String,Object> getCostMap(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("numberOfChildren",request.getParameter("numberOfChildren"));
        map.put("dipPlatters",request.getParameter("dipPlatters"));
        map.put("sandwichPlatters",request.getParameter("sandwichPlatters"));
        map.put("jazzyRequired",request.getParameter("jazzyRequired"));
        map.put("partyBags",request.getParameter("partyBags"));

        return map;
    }

    private void write(HttpServletResponse response, Map<String, Object> map) throws IOException{
        response.setContentType("json");
        response.setCharacterEncoding("UTF-8");
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(map);
         response.getWriter().print(json);
            }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}