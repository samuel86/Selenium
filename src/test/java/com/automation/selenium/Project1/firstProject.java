package com.automation.selenium.Project1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstProject {

/** In the beginning each project, this is the first thing
 * we must do. Go to mvnrepository.com and download these dependencies
 * --In the pom.xml: create dependencies tag and paste these dependencies
 * <dependencies>
 *         <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
 *         <dependency>
 *             <groupId>io.github.bonigarcia</groupId>
 *             <artifactId>webdrivermanager</artifactId>
 *             <version>4.1.0</version>
 *         </dependency>
 *         <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
 *         <dependency>
 *             <groupId>org.seleniumhq.selenium</groupId>
 *             <artifactId>selenium-java</artifactId>
 *             <version>3.141.59</version>
 *         </dependency>
 *
 *
 *     </dependencies>
 *
 */
      public static void main(String[] args) {
          //call webdriver manager
          //which is coming from io.github.conigarcia
          WebDriverManager.chromedriver().setup(); //first step
          //then we need to cretae chrome driver object
          ChromeDriver driver = new ChromeDriver(); //This is the instance of chromedriver// second step
          //Now we need to open (driver.get(pass url))
          driver.get("http://www.google.com"); // third step
    //Now we can run our first selenium script
}
}
