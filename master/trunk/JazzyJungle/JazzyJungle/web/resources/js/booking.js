


$(document).ready(function(){
   $('#bookingForm').submit(function(){

       var ajax = $.ajax({
           url: 'booking/update/validate',
           type: 'POST',
           dataType: 'json',
           data: getData('verifySubmission'),
          success: function(data){
              console.log(data);
            if(data.isValid){
                 $('#displayName').html('Your name is ' + data.adultName);
                 $('#displayName').slideDown(500);
            }
            else{
               alert('please enter a valid username');
            }
          }
       });
       return false;
   });



    jQuery(function($) {
            $("#datepicker").datepicker();
     });

    $(function(){
        $('#childSlider').slider({
            max: 30,
            min: 10,
            value: 10,
            slide: function(e,ui) {
                $('#childSliderValue').html(ui.value);
            },

            change: function(e,ui){
                var ajax = $.ajax({
                    url: 'booking/update/validate',
                    type: 'POST',
                    dataType: 'json',
                    data: getData("cost"),
                    success: function(data){
                        console.log(data);
                        printContent(data);
                    }
                });
                return false;
            }
        });
        });

    $(function(){
        $('#adultSlider').slider({
            max: 25,
            min: 4,
            value: 4,
            slide: function(e,ui) {
                $('#adultSliderValue').html(ui.value);
            }
        });
    });

    $(function(){
        $('#adultPlatterDipSlider').slider({
            max: 10,
            min: 0,
            value: 0,
            slide: function(e,ui) {
                $('#adultPlatterDipSliderValue').html(ui.value);
            },

            change: function(e,ui){
                var ajax = $.ajax({
                    url: 'booking/update/validate',
                    type: 'POST',
                    dataType: 'json',
                    data: getData("cost"),
                    success: function(data){
                        console.log(data);
                        printContent(data);
                    }
                });
                return false;
            }
        });
    });

    $(function(){
        $('#adultPlatterSandwichSlider').slider({
            max: 10,
            min: 0,
            value: 0,
            slide: function(e,ui) {
                $('#adultPlatterSandwichSliderValue').html(ui.value);
            },

            change: function(e,ui){
                var ajax = $.ajax({
                    url: 'booking/update/validate',
                    type: 'POST',
                    dataType: 'json',
                    data: getData("cost"),
                    success: function(data){
                        console.log(data);
                        printContent(data);
                    }
                });
                return false;
            }
        });
    });

    $(function(){
        $('#partyBags').change(function(e,ui){
                var ajax = $.ajax({
                    url: 'booking/update/validate',
                    type: 'POST',
                    dataType: 'json',
                    data: getData("cost"),
                    success: function(data){
                        console.log(data);
                        printContent(data);
                    }
                });
                return false;
        });
    });

    $(function(){
        $('#jazzyRequired').change(function(e,ui){
            var ajax = $.ajax({
                url: 'booking/update/validate',
                type: 'POST',
                dataType: 'json',
                data: getData("cost"),
                success: function(data){
                    console.log(data);
                    printContent(data);
                }
            });
            return false;
        });
    });

    $(function(){
        $('#childAgeSlider').slider({
            max: 10,
            min: 1,
            value: 1,
            slide: function(e,ui) {
                $('#childAgeSliderValue').html(ui.value);
            }
        });
    });

    function getData(requestType){
    var data = $('#bookingForm').serializeArray();
        if(requestType === 'cost'){data.push({name: 'requestType', value:("calculateCost")});}
        else{data.push(data.push({name: 'requestType', value:("verifySubmission")}));}

        data.push({name: 'numberOfChildren', value: $("#childSliderValue").html()});
        data.push({name: 'numberOfAdults', value: $("#adultSliderValue").html()});
        data.push({name: 'dipPlatters', value: $("#adultPlatterDipSliderValue").html()});
        data.push({name: 'sandwichPlatters', value: $("#adultPlatterSandwichSliderValue").html()});
        data.push({name: 'childAge', value: $("#childAgeSliderValue").html()});
    return data;
    }

    function printContent(data){
        $('#rightContent').html('<h1>Booking Summary</h1> <br>' +
            '<div id="summaryContainer">'+
            '<table id="bookingSummary" border="3>" ' +
                '<tr>' +
                    '<td class="formLeft"> Number Of Children:</td>' +
                    '<td class="formRight">'+data.numberOfChildren+'</td>' +
                '</tr>' +
                '<tr>' +
                    '<td class="formLeft">Package Chosen:</td>' +
                    '<td class="formRight">'+data.packageChosen+'</td>' +
                '</tr>' +
                '<tr>' +
                    '<td class="formLeft">Number Of Adult Sandwich Platters :</td>' +
                    '<td class="formRight">'+data.numberOfSandwichPlatters+'</td>' +
                '</tr>' +
                '<tr>' +
                    '<td class="formLeft">Number Of Adult Dips Platters:</td>' +
                    '<td class="formRight">'+data.numberOfDipsPlatters+'</td>' +
                '</tr>' +
                '<tr>' +
                    '<td class="formLeft">Jazzy to present cake:</td>' +
                    '<td class="formRight">'+data.jazzySelected+'</td>' +
                '</tr>' +
                '<tr>' +
                    '<td class="formLeft">Party Bags:</td>' +
                    '<td class="formRight">'+data.partyBagsSelected+'</td>' +
                '</tr>' +
            '</table>' +
            '</div>'+

            '<h1>Cost</h1>' +
            '<div id="costContainer">'+
                '<table id="costSummary" border="3>" ' +
                    '<tr>' +
                         '<td class=""> Amount</td>' +
                         '<td class=""> Item</td>' +
                         '<td class=""> Cost</td>' +
                         '<td class=""> Total</td>' +
                    '</tr>' +
                    '<tr>' +
                         '<td class="">'+data.numberOfChildren+'</td>' +
                         '<td class="">children @</td>' +
                         '<td class="">£'+data.packageCost+'</td>'+
                         '<td class="">£'+data.costOfChildren+'</td>'+
                    '</tr>' +
                    '<tr>' +
                        '<td class="">'+(+data.numberOfDipsPlatters + +data.numberOfSandwichPlatters)+'</td>' +
                        '<td class="">adult platters @</td>' +
                        '<td class="">£'+(+data.costOfDipsPlatters + +data.costOfSandwichPlatters)+'</td>'+
                        '<td class="">£'+(+data.costOfDipsPlatters + +data.costOfSandwichPlatters + +data.costOfChildren)+'</td>'+
                    '</tr>' +
                '</table>'
        );

        if(data.jazzySelected === 'Yes Please'){
            $('#costSummary tr:last').after(
                '<tr>' +
                '<td class="">1</td>' +
                '<td class="">Jazzy The Tiger @</td>' +
                '<td class="">£'+data.jazzyRequired+'</td>'+
                '<td class="">£'+(+data.costOfDipsPlatters + +data.costOfSandwichPlatters + +data.costOfChildren + +10.00)+'</td>'+
                '</tr>' +
                '');
         }

        if(data.partyBagsSelected === 'Yes Please'){
            $('#costSummary tr:last').after(
                '<tr>' +
                    '<td class="">'+data.numberOfChildren+'</td>' +
                    '<td class="">Party Bags @</td>' +
                    '<td class="">£'+(+data.numberOfChildren * 1.50)+'</td>'+
                    '<td class="">£'+(+data.costOfDipsPlatters + +data.costOfSandwichPlatters + +data.costOfChildren + +10.00 + (+data.numberOfChildren * 1.50))+'</td>'+
                    '</tr>' +
                    '');
        }


        $('#rightContent').append(
            '<br />'+
            '<h1>Total = £' + data.totalCost+ '<h1><br />'
        )
    }
});






