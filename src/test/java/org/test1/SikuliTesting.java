package org.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SikuliTesting {

	public static void main(String[] args) throws FindFailed {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\jegan\\eclipse-workspace\\MavenSample\\div\\chromedriver.exe");
     WebDriver d=new ChromeDriver();
     d.get("https://www.youtube.com/watch?v=lQWnIA0pJss");
     
     Screen s=new Screen();
     
     Pattern PlayImg=new Pattern("YT_PlayButton.png");
     s.wait(PlayImg, 2000);
     s.click();
     s.click();
     
     Pattern PauseImg=new Pattern("YT_PauseButton (1).png");
     s.wait(PauseImg, 5000);
     s.click();
     s.click();
     
     Pattern SettingImg=new Pattern("YT_Settings.png");
     s.wait(SettingImg, 2000);
     s.click();
     
   
     }

}
