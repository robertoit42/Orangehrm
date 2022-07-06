#22/06/2022
#Jhonatan Medina Blanco
@Regresion
Feature: Logueo en la pagina Orange

@login
  Scenario Outline: login
    Given abrir el navegador
    And llenar campo de usuario <userName> y contraseña <pass>
		And llegar a la opcion agregar empleado
		When al diligencial first name <firstName> y last name <lastName>
    Examples: 
      | userName | pass     |firstName|lastName|
      | Admin    | admin123 |roberto  |rodriguez|
