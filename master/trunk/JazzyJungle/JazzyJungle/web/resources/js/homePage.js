//
//$(document).ready(function() {
//
//    //loop through each paragraph element and show the inner html
//        $('#mainContent p').each(function(){
//            alert($(this).html());
//        });
//
    //CHANGE THE FONT WEIGHT OF THE NAVIGATION LINKS.
        var links = $('.topNavigation ol li');
        links.css('font-weight','normal');
//
//        //GET THE VALUE OF A GIVEN INPUT
//        var inputs = $(':input');
//        alert($(inputs[1]).val());
//
//    //GET EACH INPUT FIELD AND CHANGE THE BACKGROUND COLOR TO RED
//        $(':input').each(function() {
//            var element = $(this);
//            element.css('background-color','red')
//        });
//
//    //FIND PARAGRAPHS WHICH START OIN....
//        if($('p[value^="jlkjkljlk"]')){
//            alert("it matches");
//        }
//
//    //SET THE ODD TABLE ROW ELEMENTS
//        $('tr:odd').css('background-color', 'yellow');
//
//    //EACH USING INDEX AND ELEMENT, CAN JUST USE THIS THOUGH
//    //ALSO CHANGING THE TITLE OF THE DIV USING RAW DIV
//        var html = "";
//        $('div.topNavigation').each(function(index, element){
//           html += "<br />" + "index: " + index +  "   Element: " + $(element).text();
//            this.title = "Some title";
//            $(this).attr('title','Some Title 2');
//        });
//
//        var output = $('#outputDiv');
//        output.html(html);
//
//    //SETTING MULTIPLE DOM PROPERTIES
//        $('#mainFrame #contentHolder  #mainContent p').attr(
//            {
////               title:'',
////               style:'font-size:14pt;background-color:yellow;color:blue'
//            });
//
//    //CHAINING JQUERY FUNCTIONS
////        ).css('background-color','blue')
////            .css('color','white');
//
//
//    //MODIFYING ATTRIBUTES USING JSON OBJECTS
//        $('img').attr({
//           firstName:'John',
//           lastName:'Does',
//                Address:{
//                    Street: '123 Anywhere Street',
//                    City: 'Cardiff',
//                    State: 'South Glamorgan'
//                }
//        });
//
//    //APPENDING TO NODES
//    $('.appendParagraph').prepend('<h4>This Value has been prepended</h4>');
//    $('.appendParagraph').append('<h4>This Value has been appended</h4>');
//
//    //REMOVING NODES
//    $('.appendParagraph').remove();
//
//    //MULTIPLE STYLE MODIFYING CAN ALSO BE USED AFTER ATTR()
//    $('.testDiv').css({
////            'background-color':'cyan',
//            'width':'145px'
//        }
//    )
//
//    //CHECKING IF XXXX HAS A CERTAIN CLASS
//     if($('div').hasClass('.testDiv')){
//         alert("We have the class")
//     }
//
//    $('.testDiv').addClass('highlight');
//
//
//    $('.testDiv').toggle('.highlight');
//
//    $('.testDiv').toggle('.highlight');
//
////    wireEvents();
//
//    //WE CAN ALSO ADD AND REMOVE AND TOGGLE CLASS
////    function wireEvents(){
////        //ON CLICK
////        $('#eventPicture').click(function(){
////            alert("picture has been clicked");
////            $('#eventPicture')
////        });
////        //ON SELECT CHANGE
////        $('#stateSelect').change(function(){
////            alert($(this).val());
////        });
////        //MOUSE ENTER
////        $('#contentParagraph').mouseenter(function(e){
//////            alert("mouse has entered");
////            $(this).toggleClass("highlight");
////            $(this).css('cursor','pointer');
////            $(this).text('X IS :' + e.pageX + "  Y IS : " + e.pageY);
////        })
////        //MOUSE LEAVE
////        .mouseleave(function(){
////            $(this).toggleClass("highlight");
////        })
//
//        //USE ON AND OFF TO ATTACH AND DETATCH EVENTS
//        $('p').on('mouseup', function (e){
//            $(this).toggleClass("highlight");
//            $(this).css('cursor', 'pointer');
//
//        if(e.type == 'mouseup'){
//            $(this).text('X IS :' + e.pageX + "  Y IS : " + e.pageY);
//        }
//        });
//
//        //TURN EVENTS OFF
////        $('contentParagraph').off('mouseup');
//
//    //HOVER EVENTS
//        $('tr').hover(
//            function(){
//                $(this).toggleClass('over');
//            }
//        );
//
//});