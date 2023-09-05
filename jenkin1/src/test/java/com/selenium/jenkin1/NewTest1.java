package com.selenium.jenkin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 

public class NewTest1 {
  @Test
  public void f() {
      WebDriver driver=new ChromeDriver();
      driver.get("https://google.com");
      String t=driver.getTitle();
      System.out.println(t);

  }
}