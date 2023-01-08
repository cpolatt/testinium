package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.base.BaseTest;
import com.example.pages.BeymenPage;

public class BeymenPageTest extends BaseTest {

    BeymenPage beymenPage2;

    @Before
    public void before() {
        beymenPage2 = new BeymenPage(getWebDriver());
    }

    @Test
    public void Test() throws InterruptedException {
        beymenPage2
                .clickoneTrustButton()
                .clickgenderButton()
                .clickSearchBox()
                .setTextInSearchBox()
                .clearSearchBox()
                .setTextInSearchBox2()
                .clickProduct()
                .selectSize()
                .clickAddBasket();

        String productPrice = beymenPage2.getProductPrice();

        Thread.sleep(5000);

        beymenPage2.clickCart();
        String cartPrice = beymenPage2.getCartPrice();

        beymenPage2
                .clickQantity()
                .selectQantity();
        
        Thread.sleep(2000);

        beymenPage2.removeCartItem();

        assertEquals("SEPETINIZDE ÜRÜN BULUNMAMAKTADIR", beymenPage2.emptyCart());
        assertEquals(productPrice, cartPrice);
    }

    @After
    public void after() {
        tearDown();;
    }

}
