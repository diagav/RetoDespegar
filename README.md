# Automatizaci�n b�squeda de vuelos Despegar.com

Buscar los 10 precios m�s baratos de tiquetes en el siguiente enlace: https://www.despegar.com.co  
Origen: Medell�n   
Destino: Cartagena  
Viajeros: dos personas   
Fecha Inicio: 01/09/2018   
Fecha Regreso: 29/09/2018   
Guardar en Excel los 7 precios m�s baratos de la primera p�gina del sitio. 
Marcar en verde el precio m�s econ�mico  

#Tabla de contenido:

- [Resumen de condificaci�n](#resumen-de-codificacion)
- [Framework](#framework)
- [Compilador](#compilador)
- [Patrones de desarrollo](#patrones-de-desarrollo)
- [Practicas de automatizaci�n](#practicas-de-automatizacion)
- [Herramientas de automatizaci�n](#herramientas-de-automatizacion)
- [Estrategia de automatizaci�n](#estrategia-de-automatizacion)
- [Navegador y la versi�n utilizada](#navegador-y-la-version-utilizada)
- [Conclusiones de la automatizaci�n](#conclusiones-de-la-automatizacion)
---

## Resumen de codificacion
Se tiene un proyecto con la siguiente estructura:   

En el src/main/java se tienen los siguientes paquetes y clases:  
- Configuration: ShareDriver.java    
- Page: HomePage.java, VuelosPage.java  
- Runners: Runner.java  
- StepDefinitios: BusquedaSteps.java   
- �til: WriteExcel.java   
 
Se tiene la carpeta ProjectFeatures que almacena el feature vuelosbaratos.feature


## Framework
Selenium

## Compilador
Java

## Patrones de desarrollo
Page Object model, es un patr�n de dise�o de objeto en Selenium, donde las p�ginas web se representan como clases, y los diversos elementos de la p�gina se definen como variables en la clase. 

## Practicas de automatizacion

## Herramientas de automatizacion
- Selenium, es un entorno de pruebas de software para aplicaciones basadas en la web.  
- Cucumber, es una de las herramientas que podemos utilizar para automatizar nuestras pruebas en BDD. 
- Gherkin, es un lenguaje comprensible por humanos y por ordenadores, con el que vamos a describir las funcionalidades, definiendo el comportamiento del software, sin entrar en su implementaci�n. Se trata de un lenguaje f�cil de leer, f�cil de entender y f�cil de escribir.
- Eclipse, es una plataforma de software compuesto por un conjunto de herramientas de programaci�n de c�digo abierto multiplataforma para desarrollar lo que el proyecto llama "Aplicaciones de Cliente Enriquecido", opuesto a las aplicaciones "Cliente-liviano" basadas en navegadores.  
- Gradel, es una herramienta para automatizar el proceso de construcci�n de nuestro proyecto(compilar,testing,empaquetado�).  
- JUnit es un conjunto de clases que permite realizar la ejecuci�n de clases Java de manera controlada, para poder evaluar si el funcionamiento de cada uno de los m�todos de la clase se comporta como se espera.

## Estrategia de automatizacion  
-	Ejecutar escenarios de automatizaci�n manualmente a fin de conocer el proceso a automatizar.   
-	Identificar las diferentes p�ginas que intervienen en el proceso.  
-	Crear feature con los diferentes escenarios  
-	Crear clase para los stepDefinitions   
-	Crear clases para las p�ginas identificadas   
-	Crear runner  
-	Crear configuraci�n donde se inicializa el driver  
-   Ejecutar escenario positivos y negativos   

## Navegador y la version utilizada
ChromeDriver 2.36.540470

## Conclusiones de la automatizacion
- Se logr� automatizar la solicitud de acuerdo a las indicaciones dadas    
- Fue una buena oportunidad para afianzar los conocimientos recibidos en la capacitaci�n.  


