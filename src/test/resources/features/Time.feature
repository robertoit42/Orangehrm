#22/06/2022
#Jhonatan Medina Blanco
@Regresion
Feature: Time estimations
@Tag1
  Scenario Outline: estimations
    Given abrir el navegador
    And llenar campo de usuario <userName> y contraseña <pass>
		And estimation employee
		
    Examples: 
      | userName | pass     |
      | Admin    | admin123 |
