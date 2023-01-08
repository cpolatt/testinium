package com.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.example.base.BasePage;

import static com.example.constants.Contants.*;

public class BeymenPage extends BasePage {

    public BeymenPage(WebDriver driver) {
        super(driver);
    }

    public BeymenPage clickSearchBox() {
        click(input_search);
        return this;
    }

    public BeymenPage setTextInSearchBox() {
        sendKeys(input_search, "şort");
        return this;
    }

    public BeymenPage setTextInSearchBox2() {
        findElement(input_search).sendKeys("gömlek", Keys.RETURN);
        return this;
    }

    public BeymenPage clickoneTrustButton() {
        findElement(onetrust_button).click();
        return this;
    }

    public BeymenPage clickgenderButton() {
        findElement(gender_popup).click();
        return this;
    }

    public BeymenPage clearSearchBox() {
        findElement(input_search).sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        return this;
    }

    public BeymenPage clickProduct(){
        findElement(product).click();
        return this;
    }

    public BeymenPage clickAddBasket(){
        findElement(addBasket).click();
        return this;
    }

    public BeymenPage selectSize(){
        findElement(size).click();
        return this;
    }

    public String getProductPrice(){
        return findElement(productPrice).getText();
    }

    public BeymenPage clickCart(){
        findElement(cart).click();
        return this;
    }

    public String getCartPrice(){
        return findElement(cartPrice).getText();
    }

    public BeymenPage clickQantity(){
        findElement(quantity).click();
        return this;
    }

    public BeymenPage selectQantity(){
        findElement(quantity2).click();
        return this;
    }

    public String getQantity(){
        return findElement(quantity).getText();
    }

    public BeymenPage removeCartItem(){
        findElement(removeCartItem).click();
        return this;
    }

    public String emptyCart(){
        return findElement(emptyCart).getText();
    }

}
