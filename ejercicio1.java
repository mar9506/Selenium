
package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResolucionEjercicio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath= Paths.get("").toAbsolutePath().toString()+File.separator+"driver"+File.separator;
		System.setProperty("webdriver.chrome.driver",exePath+"chromedriver.exe");
		
		//Inicializando el ChromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Obteniendo objetos o Web Elements de la pag web
		WebElement userName= driver.findElement(By.name("username"));
		WebElement password= driver.findElement(By.name("password"));
		WebElement btnIngresar= driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(1000);//esperar  segundos se agrega el InterruptedException
		password.sendKeys("admin123");
		Thread.sleep(1000);
		btnIngresar.click();
		Thread.sleep(1000);
		
		// Ingresar a Directory y buscar un Employe
		
		
		WebElement directory= driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a"));
		directory.click();
		Thread.sleep(1000);
				
		//Pantalla Directory
		WebElement employeeName=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		Thread.sleep(1000);
		employeeName.sendKeys("Peter");
		Thread.sleep(3000);
		
		WebElement optionsearch=driver.findElement(By.className("oxd-autocomplete-dropdown --positon-bottom"));
		optionsearch.click();
		
		
		
		

		
		driver.quit(); //Cerrar todas las ventanas del webdriver
				
		
	}

}


	
	

