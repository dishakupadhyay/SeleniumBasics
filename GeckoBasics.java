package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoBasics {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver","C:\\Users\\Keyur\\IdeaProjects\\Software\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("Email")).sendKeys("dishatrivedi14@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("disha1410");
        Thread.sleep(3000);


        driver.findElement(By.className("login-button")).click();

        String title = driver.getTitle();
        System.out.println("title");

        Thread.sleep(5000);

          driver.close();
    }
}
