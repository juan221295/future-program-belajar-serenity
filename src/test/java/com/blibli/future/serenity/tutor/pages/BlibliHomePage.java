package com.blibli.future.serenity.tutor.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Juan on 8/14/17.
 */

//@DefaultUrl("https://www.blibli.com/")
public class BlibliHomePage extends PageObject {

    @FindBy(id = "gdn-login-registrasi")
    private WebElementFacade loginButton;

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public WebElementFacade getPopupLoginForm() {
        return popupLoginForm;
    }

    public WebElementFacade getInputLoginEmail() {
        return inputLoginEmail;
    }

    public WebElementFacade getInputLoginPassword() {
        return inputLoginPassword;
    }

    public WebElementFacade getSubmitLoginButton() {
        return submitLoginButton;
    }

    public WebElementFacade getAlreadyLoginUser() {
        return alreadyLoginUser;
    }

    @FindBy(id = "gdn-login-modal-body")
    private WebElementFacade popupLoginForm;

    @FindBy(id = "loginEmail")
    private WebElementFacade inputLoginEmail;

    @FindBy(id = "loginPassword")
    private WebElementFacade inputLoginPassword;

    @FindBy(id = "gdn-submit-login")
    private WebElementFacade submitLoginButton;

    @FindBy(id = "gdn-already-login-label")
    private WebElementFacade alreadyLoginUser;


    @FindBy(name = "s")
    private WebElementFacade searchForm;

    @FindBy(id = "gdn-search-button")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//*[@id=\"catalogProductListContentDiv\"]/div[1]")
    private WebElementFacade productListContent;

    @FindBy(id = "gdn-add-to-cart-top")
    private WebElementFacade addToBagButton;

    @FindBy(xpath = "//*[@id=\"gdn-pop-up-shopping-bag\"]/div[2]/div[2]/div[1]/div[2]/div/div[2]")
    private WebElementFacade resultProduct;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[4]/nav/div[2]/button")
    private WebElementFacade gojek;

    @FindBy(id = "gdn-cart-button")
    private WebElementFacade bagButton;

    public WebElementFacade getBagButton() {
        return bagButton;
    }

    @FindBy(id = "gdn-sb-page-continue-checkout")
    private WebElementFacade btnPembayaran;

    @FindBy(id = "gdn-next-step")
    private WebElementFacade btnLanjutkanPembayaran;

    @FindBy(xpath = "//*[@id=\"gdn-payment-list\"]/li[2]/div[1]")
    private WebElementFacade categoryInternetBanking;


    @FindBy(id = "payment_userid")
    private WebElementFacade klikBCAidForm;

    @FindBy(id = "gdn-submit-checkout")
    private WebElementFacade checkOutPembayaran;


    @FindBy(id = "//*[@id=\"blibli-main-ctrl\"]/section/div/section/div/div/div[1]/div[1]/h1")
    private WebElementFacade terimakasihText;

    public WebElementFacade getBtnPembayaran() {
        return btnPembayaran;
    }

    public WebElementFacade getBtnLanjutkanPembayaran() {
        return btnLanjutkanPembayaran;
    }

    public WebElementFacade getCategoryInternetBanking() {
        return categoryInternetBanking;
    }


    public WebElementFacade getKlikBCAidForm() {
        return klikBCAidForm;
    }

    public WebElementFacade getCheckOutPembayaran() {
        return checkOutPembayaran;
    }

    public WebElementFacade getTerimakasihText() {
        return terimakasihText;
    }

    public WebElementFacade getGojek() {
        return gojek;
    }

    public WebElementFacade getSearchForm() {
        return searchForm;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }

    public WebElementFacade getProductListContent() {
        return productListContent;
    }

    public WebElementFacade getAddToBagButton() {
        return addToBagButton;
    }

    public WebElementFacade getResultProduct() {
        return resultProduct;
    }

    public Select getDropdownPaymentOption(){
        Select dropdown = new Select(getDriver().findElement(By.id("gdn-payment-option-KlikBCA")));
        return dropdown;
    }
}
