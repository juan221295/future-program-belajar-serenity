package com.blibli.future.serenity.tutor.Behaviour;

import com.blibli.future.serenity.tutor.pages.BlibliHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Juan on 8/14/17.
 */
public class BlibliHomePageBehaviour extends ScenarioSteps {

    BlibliHomePage blibliHomePage;


    @Step
    public void open(){
        getDriver().get("https://www.blibli.com/");
    }


    String EMAIL = "shin_blak@hotmail.com";
    String PRODUCT_NAME = "keranjang";
    @Step
    public void clickUserLogin() {
        blibliHomePage.getLoginButton().click();
        blibliHomePage.getPopupLoginForm().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS);
        blibliHomePage.getInputLoginEmail().type(EMAIL);
        blibliHomePage.getInputLoginPassword().type(""); // input password
        blibliHomePage.getSubmitLoginButton().click();

    }

    @Step
    public void checkUserAlreadyLoggedin(){
        blibliHomePage.getAlreadyLoginUser().isCurrentlyVisible();
    }

    @Step
    public void clickSearch(){
        blibliHomePage.getSearchForm().type(PRODUCT_NAME);
        blibliHomePage.getSearchButton().click();
    }

    @Step
    public void selectItem(){
        if(blibliHomePage.getGojek().isCurrentlyVisible()){
            blibliHomePage.getGojek().click();
        }
        blibliHomePage.getProductListContent().click();
    }

    @Step
    public void addToBag(){
        blibliHomePage.getAddToBagButton().click();
    }

    @Step
    public void checkAddToBagSuccess(){
        blibliHomePage.getResultProduct().isCurrentlyVisible();
        blibliHomePage.getAlreadyLoginUser().containsText(PRODUCT_NAME);
    }

    @Step
    public void openBagPage(){
        blibliHomePage.getBagButton().click();
    }

    @Step
    public void goToCheckoutPayment(){
        blibliHomePage.getBtnPembayaran().click();
    }

    @Step
    public void goToNextPaymentCheckout(){
        blibliHomePage.getBtnLanjutkanPembayaran().click();
    }

    @Step
    public void selectPaymentMethod(){
        waitABit(500);
        blibliHomePage.getCategoryInternetBanking().click();
        Select select = blibliHomePage.getDropdownPaymentOption();
        select.selectByValue("KlikBCA");
        waitABit(1000);
        blibliHomePage.getKlikBCAidForm().type("inicobacob");
        waitABit(500);
    }


    @Step
    public void goToFinalPayment(){
        blibliHomePage.getCheckOutPembayaran().click();
    }

    @Step
    public void successCheckoutResult(){
        blibliHomePage.getTerimakasihText().isCurrentlyVisible();
    }

}
