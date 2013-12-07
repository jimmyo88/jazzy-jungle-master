$constantAssets/doctype()$
$booking/bookingHeader()$

<body xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html">
<!--[if lt IE 7]>
<p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<div id="wrapper">
    <div id="headerwrap">
        <div id="header">
        </div>
    </div>
$constantAssets/topNavigation()$
$constantAssets/facebookColumn()$
    <div id="contentwrap">
        <div id="leftContent">
        <h1>Make A Booking</h1>
        <div id="formContainer">
            <p>Please complete this form to make a booking request. All bookings will be confirmed once a 50% Non-Refundable Deposit
                per party has been received (Cheque or Cash) </p>
            <form id="bookingForm" class="pure-form pure-form-aligned">
                <fieldset>
                    <legend>Personal information:</legend>

                    <div class="pure-control-group">
                        <label for="adultname">Your name:</label>
                        <input id="adultname" type="text" name="adultname" placeholder="Your Name...">
                    </div>

                    <div class="pure-control-group">
                        <label for="address">Address:</label>
                        <textarea id="address" type="text" name="address" placeholder="Address..."></textarea>
                    </div>

                    <div class="pure-control-group">
                        <label for="telephoneNumber">Tel Number:</label>
                        <input id="telephoneNumber" type="text" name="telephoneNumber" placeholder="Telephone Number...">
                    </div>

                    <div class="pure-control-group">
                        <label for="mobileNumber">Mob Number:</label>
                        <input id="mobileNumber" type="text" name="mobileNumber" placeholder="Mobile Number...">
                    </div>

                    <div class="pure-control-group">
                        <label for="email">Email:</label>
                        <input id="email" type="text" name="email" placeholder="Email...">
                    </div>

                    <legend>Child Details:</legend>
                    <div class="pure-control-group">
                        <label for="childname">Child's name:</label>
                        <input id="childname" type="text" name="childname" placeholder="Child's Name...">
                    </div>

                    <div class="childAgeLabel">
                        <label for="childAgeSlider"> #Child Age: </label>
                    </div>
                    <div class="adultSlider" id="childAgeSlider"><div id=childAgeSliderValue class="sliderValue">1</div>
                    </div>

                    <br/><legend>Party Information:</legend>

                    <div class="childSliderLabel">
                        <label for="childSlider"> #Children: </label>
                    </div>
                    <div class="adultSlider" id="childSlider"><div id=childSliderValue class="sliderValue">10</div>
                    </div>

                    <div class="clearfix"></div>

                    <div class="adultSliderLabel">
                        <label for="adultSlider"> #Adults: </label>
                    </div>
                    <div class="adultSlider" id="adultSlider"><div id=adultSliderValue class="sliderValue">4</div>
                    </div>


                    <div class="clearfix"></div>
                    <br />

                    <div class="pure-control-group">
                        <label for="datepicker">Date:</label>
                        <input id="datepicker" type="text" name="datepicker">
                    </div>


                    <div class="pure-control-group">
                        <label for="timeOfParty">Party Time:</label>
                        <select id="timeOfParty" name="timeOfParty">
                        <option value="10:00am">10:00 a.m &nbsp;&nbsp;&nbsp;&nbsp;Mon - Sun</option>
                        <option value="11:00am">11:00 a.m. &nbsp;&nbsp;&nbsp;&nbsp;Mon - Sun</option>
                        <option value="12:15pm">12:15 p.m. &nbsp;&nbsp;&nbsp;&nbsp;Mon - Sun</option>
                        <option value="1.30pm">1:30  p.m. &nbsp;&nbsp;&nbsp;&nbsp;Mon - Fri</option>
                        <option value="2.45pm">2:45 p.m. &nbsp;&nbsp;&nbsp;&nbsp;Mon - Fri</option>
                        <option value="3.45pm">3:45 p.m. &nbsp;&nbsp;&nbsp;&nbsp;Mon - Fri</option>
                        <option value="4.00pm">4.00 p.m. &nbsp;&nbsp;&nbsp;&nbsp;Mon - Fri</option>
                        <option value="4.30pm">4.30 p.m. &nbsp;&nbsp;&nbsp;&nbsp;Mon - Fri</option>
                    </select>
                    </div>

                    <legend>Extras:</legend>
                    <br />
                    <div class="pure-control-group">
                        <label for="partyBags">Party Bags:</label>
                        <select id="partyBags" name="partyBags">
                            <option value="false">No thanks</option>
                            <option value="true">Yes - Additional &pound;1.50 per head</option>
                        </select>
                    </div>
                    <div class="clearfix"></div>

                    <div class="pure-control-group">
                        <label for="jazzyRequired">Jazzy the friendly tiger to present cake:</label>
                        <select id="jazzyRequired" name="jazzyRequired">
                            <option value="false">No thanks</option>
                            <option value="true">Yes additional &pound;10.00</option>
                        </select>
                    </div>

                    <legend>Adult Platters - &pound;8.00:</legend>

                    <div class="adultPlatterDipSliderLabel">
                        <label for="adultPlatterDipSlider">#Dip Platters:</label>
                    </div>
                    <div class="adultSlider" id="adultPlatterDipSlider"><div id=adultPlatterDipSliderValue class="sliderValue">0</div>
                    </div>

                    <div class="clearfix"></div>

                    <div class="adultPlatterSandwichSliderLabel">
                        <label for="adultPlatterSandwichSlider">#Sandwiches: </label>
                    </div>
                    <div class="adultSlider" id="adultPlatterSandwichSlider"><div id=adultPlatterSandwichSliderValue class="sliderValue">0</div>
                    </div>
                    <br />

                    <legend></legend>
                    <div class="pure-control-group">
                        <label for="invitationLanguage">Invitation Language:</label>
                        <select id="invitationLanguage" name="invitationLanguage">
                            <option value="english">English</option>
                            <option value="welsh">Welsh</option>
                        </select>
                    </div>

                    <div class="pure-control-group">
                        <label for="additionalComments">Additional Comments:</label>
                        <textarea id="additionalComments" type="text" name="additionalComments" placeholder="Any Additional Comments..."></textarea>
                    </div>

                    <!--<div id="childslidervalue">10</div>-->


                    <div class="pure-controls">
                        <button type="submit" class="pure-button pure-button-primary">Submit</button>
                    </div>
                </fieldset>
            </form>
        </div>
        </div>

        <div id="rightContent">
            <h1>Booking Summary</h1> <br>
                <div id="summaryContainer">
                    <table id="bookingSummary" border="2">
                        <tr>
                            <td class="formLeft"> Number Of Children:</td>
                            <td class="formRight">10</td>
                        </tr>
                        <tr>
                            <td class="formLeft">Package Chosen:</td>
                            <td class="formRight">Small 10-15 Children</td>
                        </tr>
                        <tr>
                            <td class="formLeft">Number Of Adult Sandwich Platters :</td>
                            <td class="formRight">0</td>
                        </tr>
                        <tr>
                            <td class="formLeft">Number Of Adult Dips Platters:</td>
                            <td class="formRight">0</td>
                        </tr>
                        <tr>
                            <td class="formLeft">Jazzy to present cake:</td>
                            <td class="formRight">No thanks</td>
                        </tr>
                        <tr>
                            <td class="formLeft">Party Bags:</td>
                            <td class="formRight">No thanks</td>
                        </tr>
                    </table>
                </div>

            <h1>Cost</h1>
            <div id="costContainer">
            <table id="costSummary" border="2">
            <tr>
                <td class=""> Amount</td>
                <td class=""> Item</td>
                <td class=""> Cost</td>
                <td class=""> Total</td>
            </tr>
            <tr>
                <td class="">10</td>
                <td class="">children @</td>
                <td class="">&pound;8.00</td>
                <td class="">&pound;80.00</td>
            </tr>
            <tr>
                <td class="">0</td>
                <td class="">adult platters @</td>
                <td class="">&pound;0.00</td>
                <td class="">&pound;0.00</td>
            </tr>
            </table>
                <br />
                <h1>Total = &pound;80.00 </h1><br />
        </div>
    </div>
    </div>
    $constantAssets/footer()$
</div>
</body>
</html>
