//
//$(document).ready(function() {
//
//    //loop through each paragraph element and show the inner html
//        $('#mainContent p').each(function(){
//            alert($(this).html());
//        });
//
    //CHANGE THE FONT WEIGHT OF THE NAVIGATION LINKS.

$(function(){
  $(".anchorThumb").click(function(e){
      e.preventDefault();
      $("a.anchorThumb").removeClass("selected");
      $("a.anchorThumb").children().css("opacity","1.0");
      $(this).children().css("opacity","0.5");
      $(this).children().addClass("selected");

      var imagePreview = $(this).attr("href")

      $("#rightContent").html('<div id="previewImage">' +
                              '<a href="'+imagePreview+'" data-lightbox="'+imagePreview+'">' +
                              '<img src='+imagePreview+'>  </a>' +
                              '</div>' +
                              '<br /><br /><br />' +
                               'Click the image for a larger version');

  });
})

