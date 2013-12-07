$constantAssets/docType()$
$gallery/galleryHeader()$

<body xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html">
<!--[if lt IE 7]>
<p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.2.min.js"><\/script>')</script>
<script src="/resources/js/plugins.js"></script>

<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->

<div id="wrapper">
    <div id="headerwrap">
        <div id="header">
        </div>
    </div>
$constantAssets/topNavigation()$
$constantAssets/facebookColumn()$
    <div id="contentwrap">
        <div id="leftContent">
           <div id="scroller">
               <h1>Gallery</h1>
               <div class="images">
                $image:{
                <div class="anchorThumbContainerImage">
                <a href="/resources/images/thumbnails/$it.path$" class="anchorThumb"><img src="/resources/images/thumbnails/$it.path$" width="$it.width$" height="$it.height$"/></a>
                </div>
                }$
            </div>
           </div>
        </div>

        <div id="rightContent">
            <div id="previewImage">
                <a href="/resources/images/jazzy03.gif" data-lightbox="jazzy03">
                    <img src="/resources/images/jazzy02.gif" class="rightContentImage">
                </a>
            </div>
            <br /><br /><br />
            Click the image for a larger version


        </div>
    </div>
    $constantAssets/footer()$
</div>
</body>
</body>
</html>
