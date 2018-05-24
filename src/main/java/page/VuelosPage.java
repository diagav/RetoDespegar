package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import util.GrabaExcel;

public class VuelosPage {
	WebDriver driver;
	
    public String muestraVuelosDisponibles() throws InterruptedException {
    	Thread.sleep(5000);
    	return driver.getTitle();
    }
    
    public void ordenarPorCriterio(String ordenarPor) {
		Select resultado = new Select(driver.findElement(By.id("eva-select")));
		resultado.selectByVisibleText(ordenarPor); 
    }
    
    public void almacenaResultado() throws IOException, InterruptedException {
    	
    	Thread.sleep(5000);
    	
    	GrabaExcel ayudaExcel;
    	ayudaExcel = new GrabaExcel();
    	 
        String precio;
        String ruta = "C:\\Users\\diagavir\\eclipse-workspace\\RetoDespegar";
        String libro = "BusquedaDespegar.xls";
        String hoja = "Hoja1"; 
        
        String aerolinea = driver.findElement(By.xpath("//*[@id='clusters']/span[1]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
        
        //Primer vuelo
    	if (driver.findElements(By.xpath("//*[@id=\'clusters\']/span[1]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).size() != 0) {
    		precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[1]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		} else {
			precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[1]/span/cluster/div/div/span/fare-box/div/span/span/span/p[2]/span[2]/em[2]")).getText(); 
		}
    		   	
    	String [] datosInsertar= {aerolinea, precio};    	
    	ayudaExcel.escribeExcel(ruta, libro, hoja, datosInsertar);

    	//Segundo vuelo 
    	String aerolinea2 = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[2]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
    	
    	if (driver.findElements(By.xpath("//*[@id=\'clusters\']/span[2]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).size() != 0) {
        	precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[2]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		} else {
			precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[2]/span/cluster/div/div/span/fare-box/div/span/span/span/p[2]/span[2]/em[2]")).getText(); 
		}
    	
    	String [] datosInsertar2= {aerolinea2, precio};    	
    	ayudaExcel.escribeExcel(ruta, libro, hoja, datosInsertar2);
    	
       	//Tercer vuelo
    	String aerolinea3 = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[3]/span[1]/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
        
    	if (driver.findElements(By.xpath("//*[@id=\'clusters\']/span[3]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).size() != 0) {
			precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[3]/span[1]/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		} else {
			precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[3]/span/cluster/div/div/span/fare-box/div/span/span/span/p[2]/span[2]/em[2]")).getText();
		}
    	
    	String [] datosInsertar3= {aerolinea3, precio};    	
    	ayudaExcel.escribeExcel(ruta, libro, hoja, datosInsertar3);
    	
     	//Cuarto vuelo
    	String aerolinea4 = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[4]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
    	if (driver.findElements(By.xpath("//*[@id=\'clusters\']/span[4]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).size() != 0) {
        	precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[4]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		} else {
			precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[4]/span/cluster/div/div/span/fare-box/div/span/span/span/p[2]/span[2]/em[2]")).getText();
		}
    	
    	String [] datosInsertar4= {aerolinea4, precio};    	
    	ayudaExcel.escribeExcel(ruta, libro, hoja, datosInsertar4);
    	
     	//Quinto vuelo
    	String aerolinea5 = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[5]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
    	if (driver.findElements(By.xpath("//*[@id=\'clusters\']/span[5]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).size() != 0) {
        	precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[5]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		} else {
			precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[5]/span/cluster/div/div/span/fare-box/div/span/span/span/p[2]/span[2]/em[2]")).getText();
		}
    	
    	String [] datosInsertar5= {aerolinea5, precio};    	
    	ayudaExcel.escribeExcel(ruta, libro, hoja, datosInsertar5);
    	
     	//Sexto vuelo
    	String aerolinea6 = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[6]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
    	if (driver.findElements(By.xpath("//*[@id=\'clusters\']/span[6]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).size() != 0) {
        	precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[6]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		} else {
			precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[6]/span/cluster/div/div/span/fare-box/div/span/span/span/p[2]/span[2]/em[2]")).getText();
		}
    	
    	String [] datosInsertar6= {aerolinea6, precio};    	
    	ayudaExcel.escribeExcel(ruta, libro, hoja, datosInsertar6);
    	
     	//Septimo vuelo
    	String aerolinea7 = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[7]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")).getText();
    	if (driver.findElements(By.xpath("//*[@id=\'clusters\']/span[7]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).size() != 0) {
        	precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[7]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]")).getText();
		} else {
			precio = driver.findElement(By.xpath("//*[@id=\'clusters\']/span[7]/span/cluster/div/div/span/fare-box/div/span/span/span/p[2]/span[2]/em[2]")).getText();
		}
    	
    	String [] datosInsertar7= {aerolinea7, precio};    	
    	ayudaExcel.escribeExcel(ruta, libro, hoja, datosInsertar7);
    }
        
	public VuelosPage(WebDriver driver) {
		this.driver = driver;
	}
}
