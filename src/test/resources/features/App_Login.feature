#Author: Jorge Hernan Ramirez

Feature: Realizar operaciones realacionadas con la app VodQA

  @LoginExitoso
  Scenario Outline: Encontrar el numero uno de la opcion Carousel en la app VodQA
    Given Inicio sesion exitosa dentro de la  App VodQA <Usuario> <Contrasena> <MensajeHome>
    When Elijo la opcion Carousel dentro de la app VodQA <MensajeCarousel>
    Then Validar que el primer elemento mostrado se el numero uno <Validacion>
    Examples:
      |Usuario|Contrasena|MensajeHome|MensajeCarousel|Validacion|
      |"admin"|"admin"|"Samples List"|"Carousel"|"1"|
