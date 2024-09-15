Feature: Search and place order for products

@SearchProduct
Scenario Outline: Search Experience for product in both home page and offers page

Given User is on Grenkart landing page
When user searched for shotname <Name> and extract actual name of product
Then User searches for <Name> shortname in offers page to check
And Validate product name between offers and Landing page

Examples:
| Name |
| Tom  |
| Beet |







