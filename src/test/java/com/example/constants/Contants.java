package com.example.constants;

import org.openqa.selenium.By;

public class Contants {

    public static final By input_search = By.cssSelector("input[class='default-input o-header__search--input']");
    public static final By onetrust_button = By.id("onetrust-accept-btn-handler");
    public static final By gender_popup = By.id("genderManButton");
    public static final By product = By.cssSelector("a[href='/p_polo-ralph-lauren-lacivert-yesil-ekose-desenli-gomlek_1094549']");
    public static final By addBasket = By.id("addBasket");
    public static final By size = By.cssSelector("span[class='m-variation__item']");
    public static final By productPrice = By.cssSelector("ins[id='priceNew']");
    public static final By cart = By.cssSelector("a[class='o-header__userInfo--item bwi-cart-o -cart']");
    public static final By cartPrice = By.cssSelector("span[class='m-productPrice__salePrice']");
    public static final By quantity = By.cssSelector("select[id='quantitySelect0-key-0']");
    public static final By quantity2 = By.cssSelector("option[value='2']");
    public static final By removeCartItem = By.cssSelector("button[id='removeCartItemBtn0-key-0']");
    public static final By emptyCart = By.xpath("//*[@id='emtyCart']/div[2]/strong");
    public static final By productDescription = By.cssSelector("span[class='o-productDetail__description']");
}