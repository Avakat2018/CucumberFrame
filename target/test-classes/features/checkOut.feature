Feature: Add more products and check out

@PlaceOrder
Scenario Outline: Add the desired quantity of the product from home page and go to checkout to place order


Given User is on Grenkart landing page
When user searched for shotname <Name> and extract actual name of product
And add the "3" quantity 
Then go to checkout and validate the <Name> in checkout Page
And enter promo code and place order

Examples: 
| Name |
| Cauli  |