Meta:

Narrative:
In order to be able to buy in blibli
As customer
I want to be able to login
I want to be able to add the product to the bag

Scenario: go to blibli site and login
Given open home page
When i login to blibli
Then i can see my name in the site

Scenario: search the product
Given open home page
When i search the product
And i select the product
And i put the product to the bag
Then i can see the product in the bag

Scenario: make a payment
Given product already in the bag
When i go to bag page
And i go to payment checkout
And i go to next checkout payment
And i select the payment method
And i pay the payment
Then i can see thankyou page