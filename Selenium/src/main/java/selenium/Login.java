package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setear la ruta de nuestro chromedriver
		String exePath= Paths.get("").toAbsolutePath().toString()+File.separator+"driver"+File.separator;
		// Agregando la propiedad para la ruta del chromedriver
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
		Thread.sleep(3000);//esperar  segundos se agrega el InterruptedException
		password.sendKeys("admin123");
		Thread.sleep(3000);
		btnIngresar.click();
		Thread.sleep(3000);
		
		//Metodos del explorador
		String title=driver.getTitle(); //Obtener el titulo de la página
		System.out.println("El titulo es: "+ title);
		String urlDashboard=driver.getCurrentUrl();//Obtener URL de la página
		System.out.println("La URL es: "+ urlDashboard);
		
		//Si una opcion esta desplegada
		boolean assigLeaveIsDisplayed = driver.findElement(By.className("cls-1")).isDisplayed();
		
		if (assigLeaveIsDisplayed) {
			System.out.println("La opción Assig Leave esta desplegada");
		}
		
		//Como obtener texto
		String welcomeMsj= driver.findElement(By.className("oxd-userdropdown-name")).getText();
		if (welcomeMsj.contains("Paul Collings")){  //contains compara y regresa un booleano
			System.out.println("El mensaje tiene el nombre de Sumi" );
		}
		else {
			System.out.println( "ERROR el mensaje no es correcto");
		}
	
		
		
		//Cerrar la ventana del navegador
		driver.close(); //Cierra la ventana actual que el driver esta utilizando
		//driver.quit(); //Cerrar todas las ventanas del webdriver
		
	}
	

}
