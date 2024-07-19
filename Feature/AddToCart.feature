Feature: Validate the Add to cart feature

Scenario: Add Product to Add to Cart module
Given I navigated to Fashsion Page in amazon
When Selected customers review with four stars and UP under Men section
And I have filtered the Price Range between "<minPrice>" to "<maxPrice"
Then Validate the Product count in the results
And I have added the second product to the cart
Then The Cart product number should be increment by one
Examples:
|minPrice|maxPrice|
|1000|5000|

