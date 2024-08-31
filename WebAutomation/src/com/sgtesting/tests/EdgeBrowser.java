package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser
{
    public static WebDriver oBrowser=null;

    public static void main(String[] args) {
        launchBrowser();
        navigateURl();
        closeApplication();

    }
    private static void launchBrowser()
    {
        try
        {
            oBrowser=new EdgeDriver();
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void navigateURl()
    {
        try
        {
            oBrowser.get("http://localhost:81/login.do");
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void closeApplication()
    {
        try
        {
            oBrowser.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
