package com.blibli.future.serenity.tutor.steps;

import com.blibli.future.serenity.tutor.Behaviour.BlibliHomePageBehaviour;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.blibli.future.serenity.tutor.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Steps
    BlibliHomePageBehaviour blibliHomePageBehaviour;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }


    @Given("open home page")
    public void givenOpenHomePage(){
        blibliHomePageBehaviour.open();
    }

    @When("i login to blibli")
    public void whenLoginHomepage(){
        blibliHomePageBehaviour.clickUserLogin();
    }

    @Then("i can see my name in the site")
    public void thenSeeMyName(){
        blibliHomePageBehaviour.checkUserAlreadyLoggedin();
    }

    @When("i search the product")
    public void searchTheProduct(){
        blibliHomePageBehaviour.clickSearch();
    }

    @When("i select the product")
    public void selectTheProduct(){
        blibliHomePageBehaviour.selectItem();
    }

    @When("i put the product to the bag")
    public void addToBag(){
        blibliHomePageBehaviour.addToBag();
    }

    @Then("i can see the product in the bag")
    public void seeTheProductInTheBag(){
        blibliHomePageBehaviour.checkAddToBagSuccess();
    }

    @Given("product already in the bag")
    public void isAlreadyInTheBag(){
        blibliHomePageBehaviour.checkAddToBagSuccess();
    }

    @When("i go to bag page")
    public void goToBagPage(){
        blibliHomePageBehaviour.openBagPage();
    }

    @When("i go to payment checkout")
    public void goToPayment(){
        blibliHomePageBehaviour.goToCheckoutPayment();
    }

    @When("i go to next checkout payment")
    public void goToNextPayment(){
        blibliHomePageBehaviour.goToNextPaymentCheckout();
    }

    @When("i select the payment method")
    public void selectThePaymentMethod(){
        blibliHomePageBehaviour.selectPaymentMethod();
    }

    @When("i pay the payment")
    public void nextToFinalCheckout(){
        blibliHomePageBehaviour.goToFinalPayment();
    }

    @Then("i can see thankyou page")
    public void finalCheckoutPageAppear(){
        blibliHomePageBehaviour.successCheckoutResult();
    }

}
