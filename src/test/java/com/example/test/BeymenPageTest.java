package com.example.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.ReadExcelFile;
import com.example.WriteFile;
import com.example.base.BaseTest;
import com.example.pages.BeymenPage;

public class BeymenPageTest extends BaseTest {

    BeymenPage beymenPage;

    @Before
    public void before() {
        beymenPage = new BeymenPage(getWebDriver());
    }

    @Test
    public void Test() throws InterruptedException, IOException {

        ReadExcelFile r = new ReadExcelFile();
        String value = r.readExcel(0, 0);
        String value2 = r.readExcel(0, 1);

        beymenPage
                .clickoneTrustButton()
                .clickgenderButton()
                .clickSearchBox()
                .setTextInSearchBox(value);

        Thread.sleep(2000);

        beymenPage
                .clearSearchBox()
                .setTextInSearchBox2(value2)
                .clickProduct()
                .selectSize()
                .clickAddBasket();

        String productPrice = beymenPage.getProductPrice();
        String productDescription = beymenPage.getProductDescription();

        WriteFile w = new WriteFile();
        w.WriteFileTxt(productDescription, productPrice);

        Thread.sleep(5000);

        beymenPage.clickCart();
        String cartPrice = beymenPage.getCartPrice();

        beymenPage
                .clickQantity()
                .selectQantity();

        Thread.sleep(2000);

        beymenPage.removeCartItem();

        assertEquals(productPrice, cartPrice);
        assertEquals("SEPETINIZDE ÜRÜN BULUNMAMAKTADIR", beymenPage.emptyCart());
       
    }

    @After
    public void after() {
        tearDown();
        ;
    }

}
