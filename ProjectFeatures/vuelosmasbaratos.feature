#Author: Diana Gaviria
@vuelos
Feature: Busqueda de los vuelos mas baratos
  Yo como usuario de la pagina de despegar
  Quiero listar los diez vuelos mas baratos  
  Para decidir que opcion tomar

  @busqueda
  Scenario Outline: Busqueda vuelos mas baratos
    Given el usuario esta en la pagina de despegar
    When elige la opcion vuelos
    And elige ida y vuelta
    And ingresa ciudad origen <ciudadorigen>
    And ingresa ciudad destino <ciudaddestino>
    And ingresa fecha de partida
    And ingresa fecha de regreso
    And ingresa numero de pasajeros
    And elige la opcion buscar
    Then se muestra la lista de vuelos disponibles
    And se ordena por criterio <ordenarpor>
    And almacena resultado en excel

    Examples: 
      | ciudadorigen | ciudaddestino | ordenarpor |
      | medellin     | cartagena     | Precio     |

  @sinfecharegreso
  Scenario Outline: Busqueda sin seleccionar la fecha de regreso
    Given el usuario esta en la pagina de despegar
    When elige la opcion vuelos
    And elige ida y vuelta
    And ingresa ciudad origen <ciudadorigen>
    And ingresa ciudad destino <ciudaddestino>
    And ingresa fecha de partida
    And elige la opcion buscar
    Then se muestra mensaje de error en las fechas

    Examples: 
      | ciudadorigen | ciudaddestino |
      | medellin     | cartagena     |

  @siningresardestino
  Scenario Outline: Busqueda sin seleccionar la ciudad destino
    Given el usuario esta en la pagina de despegar
    When elige la opcion vuelos
    And elige ida y vuelta
    And ingresa ciudad origen <ciudadorigen>
    And elige la opcion buscar
    Then se muestra mensaje para ingresar el destino

    Examples: 
      | ciudadorigen |
      | medellin     |
