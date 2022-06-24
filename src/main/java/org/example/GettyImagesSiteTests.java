package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GettyImagesSiteTests {
    private WebDriver driver;
    private WebDriverWait wait;
    private long timeOutSec = 100;

    public GettyImagesSiteTests() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(this.driver, timeOutSec);
        driver.get("https://www.gettyimages.com/");
        driver.manage().window().setSize(new Dimension(748, 824));
    }

    public String authorizationTest() {
        System.out.println("Authorization test has been started...");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")));
        driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
        System.out.println("step 1 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]" +
                "/header-side-panels/div[6]/div[4]/a")));
        driver.findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]" +
                "/header-side-panels/div[6]/div[4]/a")).click();
        System.out.println("step 2 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]" +
                "/header-side-panels/div[3]/div[2]/div[4]/div/a[1]")));
        driver.findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]" +
                "/header-side-panels/div[3]/div[2]/div[4]/div/a[1]")).click();
        System.out.println("step 3 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_new_session\"]/gi-text-field[1]")));
        driver.findElement(By.xpath("//*[@id=\"new_session_username\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"new_session_username\"]")).
                sendKeys("vika.dolgikh@mail.ru");
        System.out.println("step 4 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_new_session\"]/gi-text-field[2]")));
        driver.findElement(By.xpath("//*[@id=\"new_session_password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"new_session_password\"]")).
                sendKeys("19072014Vika");
        System.out.println("step 5 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_new_session\"]/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"new_new_session\"]/div[1]")).click();
        System.out.println("step 6 has passed");
        return "Authorization test result: Success!";
    }

    public String addPhotosToCart() {
        System.out.println("Add photos to cart test has been started...");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"customer_notifications_application\"]/div/div/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"customer_notifications_application\"]/div/div/div[2]")).click();
        System.out.println("step 1 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/ul/li[1]/a")));
        driver.findElement(By.xpath("/html/body/div[2]/section/div/ul/li[1]/a")).click();
        System.out.println("step 2 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[1]/a")));
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[1]/a")).click();
        System.out.println("step 3 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"comp\"]")));
        driver.findElement(By.xpath("//*[@id=\"comp\"]")).click();
        System.out.println("step 4 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")));
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")).click();
        System.out.println("step 5 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[4]/div[1]/button")));
        driver.findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[4]/div[1]")).click();
        System.out.println("step 6 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[2]/ul/li[1]/a")));
        driver.findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[2]/ul/li[1]/a")).click();
        System.out.println("step 7 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]")));
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]")).click();
        System.out.println("step 8 has passed");
        wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"comp\"]"))));
        driver.findElement(By.xpath("//*[@id=\"comp\"]")).click();
        System.out.println("step 9 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")));
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")).click();
        System.out.println("step 10 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]/a[3]")));
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]/a[3]")).click();
        System.out.println("step 11 has passed");
        return "Add photos to cart test result: Success!";

    }

    public String removePhotosSignOut() {
        System.out.println("Remove photos from cart and signed out test has been started...");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart-item-list\"]/div[2]/div/div/figure/ul/li[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"cart-item-list\"]/div[2]/div/div/figure/ul/li[2]/a")).click();
        System.out.println("step 1 has passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart-item-list\"]/div/div/div/figure/ul/li[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"cart-item-list\"]/div/div/div/figure/ul/li[2]/a")).click();
        System.out.println("step 2 has passed");
        return "Remove photos from cart and signed out test result: Success!";
    }

    public void closeChromeTab() {
        driver.close();
    }

}
