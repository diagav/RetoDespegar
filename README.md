# Automatización búsqueda de vuelos Despegar.com

Buscar los 10 precios más baratos de tiquetes en el siguiente enlace: https://www.despegar.com.co  
Origen: Medellín   
Destino: Cartagena  
Viajeros: dos personas   
Fecha Inicio: 01/09/2018   
Fecha Regreso: 29/09/2018   
Guardar en Excel los 7 precios más baratos de la primera página del sitio. 
Marcar en verde el precio más económico  

#Tabla de contenido:

- [Resumen de condificación](#resumen-de-codificacion)
- [Framework](#framework)
- [Compilador](#compilador)
- [Patrones de desarrollo](#patrones-de-desarrollo)
- [Practicas de automatización](#practicas-de-automatizacion)
- [Herramientas de automatización](#herramientas-de-automatizacion)
- [Estrategia de automatización](#estrategia-de-automatizacion)
- [Navegador y la versión utilizada](#navegador-y-la-version-utilizada)
- [Conclusiones de la automatización](#conclusiones-de-la-automatizacion)
---

## Resumen de codificacion
Se tiene un proyecto con la siguiente estructura:   

En el src/main/java se tienen los siguientes paquetes y clases:  
- Configuration: ShareDriver.java    
- Page: HomePage.java, VuelosPage.java  
- Runners: Runner.java  
- StepDefinitios: BusquedaSteps.java   
- Útil: WriteExcel.java   
 
Se tiene la carpeta ProjectFeatures que almacena el feature vuelosbaratos.feature


## Framework
Selenium

## Compilador
Java

## Patrones de desarrollo
Page Object model, es un patrón de diseño de objeto en Selenium, donde las páginas web se representan como clases, y los diversos elementos de la página se definen como variables en la clase. 

## Practicas de automatizacion

## Herramientas de automatizacion
- Selenium, es un entorno de pruebas de software para aplicaciones basadas en la web.  
- Cucumber, es una de las herramientas que podemos utilizar para automatizar nuestras pruebas en BDD. 
- Gherkin, es un lenguaje comprensible por humanos y por ordenadores, con el que vamos a describir las funcionalidades, definiendo el comportamiento del software, sin entrar en su implementación. Se trata de un lenguaje fácil de leer, fácil de entender y fácil de escribir.
- Eclipse, es una plataforma de software compuesto por un conjunto de herramientas de programación de código abierto multiplataforma para desarrollar lo que el proyecto llama "Aplicaciones de Cliente Enriquecido", opuesto a las aplicaciones "Cliente-liviano" basadas en navegadores.  
- Gradel, es una herramienta para automatizar el proceso de construcción de nuestro proyecto(compilar,testing,empaquetado…).  
- JUnit es un conjunto de clases que permite realizar la ejecución de clases Java de manera controlada, para poder evaluar si el funcionamiento de cada uno de los métodos de la clase se comporta como se espera.

## Estrategia de automatizacion  
-	Ejecutar escenarios de automatización manualmente a fin de conocer el proceso a automatizar.   
-	Identificar las diferentes páginas que intervienen en el proceso.  
-	Crear feature con los diferentes escenarios  
-	Crear clase para los stepDefinitions   
-	Crear clases para las páginas identificadas   
-	Crear runner  
-	Crear configuración donde se inicializa el driver  
-   Ejecutar escenario positivos y negativos   

## Navegador y la version utilizada
ChromeDriver 2.36.540470

## Conclusiones de la automatizacion
- Se logró automatizar la solicitud de acuerdo a las indicaciones dadas    
- Fue una buena oportunidad para afianzar los conocimientos recibidos en la capacitación.  


