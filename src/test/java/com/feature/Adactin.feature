Feature: Hotel Booking In Adactin Application

Scenario:
Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login Button And It Navigates To Search Hotel Page

Scenario:
When user Select The Location From Drop Down
And user Select The Hotels From Drop Down
And user Select The Room Type From Drop Down
And user Select The Number Of Rooms From Drop Down
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In Check Out Date Field
And user Select The Adults Per Room From Drop Down
And user Select The Children Per Romm From Drop Down
Then user Click On The Search Button And It Navigates To Select Hotel Page

Scenario:
When user Select The Available Hotels Using Radio Button
Then user Click On The Continue Button And It Navigates To Book A Hotel Page

Scenario:
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card No In Credit Card Number Field Which Should Only Be 16 Digits
And user Select The Credit Card Type From The Drop Down
And user Select The Expiry Date Month and Year From The Drop Down
And user Enter The CVV Number In The CVV Number Field
Then user Click On The Book Now Button And It Navigates To Booking Confirmation Page

Scenario:
Then user Click On The MyItinerary Button And It Navigates To Booked Itinerary Page

Scenario:
Then user Click On The Logout Button And It LogsOut Of The Application
