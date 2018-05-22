package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;

public class HomePage {
	
	WebDriver driver;
	
    public void eligeOpcionVuelos() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Vuelos")).click(); 
    }
    
    public void eligeIdaVuelta() throws InterruptedException {
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/form/span/label/span[contains(text(),'Ida y vuelta')]")).click();
 
    	//driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa desde dónde viajas\"]")).clear();
        //driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa hacia dónde viajas\"]")).clear();
     
    	
    }
    
    
    public void ingresaCiudadOrigen(String ciudadOrigen) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa desde dónde viajas\"]")).clear();
       	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa desde dónde viajas\"]")).sendKeys(ciudadOrigen);
       	Thread.sleep(2000);
       	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa desde dónde viajas\"]")).sendKeys(Keys.ENTER);  
    }
    
    public void ingresaCuidadDestino(String ciudadDestino) throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa hacia dónde viajas\"]")).clear();
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa hacia dónde viajas\"]")).click();
     	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa hacia dónde viajas\"]")).sendKeys(ciudadDestino);
     	Thread.sleep(2000);     	
     	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Ingresa hacia dónde viajas\"]")).sendKeys(Keys.ENTER);
    }
	
    public void ingresaFechaPartida() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder=\"Partida\"]")).click();
    	driver.findElement(By.xpath("/html/body/div/div/div/div[@class=\"_dpmg2--controls-next\"]")).click();
    	driver.findElement(By.xpath("/html/body/div/div/div/div[@class=\"_dpmg2--controls-next\"]")).click();
    	driver.findElement(By.xpath("/html/body/div/div/div/div[@class=\"_dpmg2--controls-next\"]")).click();
    	driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]")).click();
     }
    
    public void ingresaFechaRegreso() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[29]")).click();
    }
    
    public void ingresaNumeroPasajeros() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\'searchbox-sbox-all-boxes\']/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input")).click();   	
    	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]")).click();
    	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a")).click();
    }
    
    @And("elige la opcion buscar")
    public void eligeOpcionBuscar() {
    	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/a/em[@class=\"btn-text\"]")).click();
    }
        
    public String muestraMensajeErrorFechas() {
    	return driver.findElement(By.xpath("//*[@id=\'searchbox-sbox-all-boxes\']/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/span[2]")).getText();
    }
    
    public String muestraMensajeErrorDestino() {
    	return driver.findElement(By.xpath("//*[@id=\'searchbox-sbox-all-boxes\']/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/span[1]")).getText();
    }
      
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

}
