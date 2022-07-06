#22/06/2022
#Jhonatan Medina Blanco
@Regresion
Feature: leave general

@searchEmployee
  Scenario Outline: buscar un empleado
    Given abrir el navegador
    And llenar campo de usuario <userName> y contraseña <pass>
		And buscar empleado
    Examples: 
      | userName | pass     |
      | Admin    | admin123 |
	