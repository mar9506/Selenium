package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) throws InterruptedException {
		//Setear la ruta de nuestro chromedriver
		String exePath= Paths.get("").toAbsolutePath().toString()+File.separator+"driver"+File.separator;
		// Agregando la propiedad para la ruta del chromedriver
		System.setProperty("webdriver.chrome.driver",exePath+"chromedriver.exe");
		
		//Inicializando el ChromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com.mx");
		driver.manage().window().maximize();
		
		
	}
	

}
