package pages;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class CartPage extends BasePage{
    public String cart_page_url = "https://www.saucedemo.com/cart.html";
    public By checkout_btn = By.id("checkout");
    public By continue_shopping = By.xpath("//button[@id='continue-shopping']");
    public By quantity = By.xpath("//div[@class='cart_quantity_label']");
    public By description = By.xpath("//div[@class='cart_desc_label']");
    public By remove_cart_button = By.xpath("(//*[@class='btn btn_secondary btn_small cart_button'])[1]");
    public By inventory_item_name= By.xpath("(//*[@class='inventory_item_name'])[1]");
    public By inventory_item_price= By.xpath("(//*[@class='inventory_item_price'])[1]");


}
