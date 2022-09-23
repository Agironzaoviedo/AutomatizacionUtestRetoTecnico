#Author: AndersonGironza

@stories
Feature: Registrar el usuario en la pagina de Utest

  @scenario1
  Scenario: Registro de Anderson en la pagina de Utest
    Given Anderson desea registrarse en la pagina de Utest
    When ingrese todos los campos requeridos
        |nombre   | apellido | correo                 | nacimientoMes | nacimientoDia | nacimientoAnio | ciudad   | codPostal | pais     | computadorSo | versionComputador | lenguajeComputador | dispositivoMovil | modeloDispositivoMovil | soDispositivoMovil | contrasenia | confirmarContrasenia |
        |Anderson | Oviedo   | ander03@hotmail.com    | March         | 19            | 1996           | Monteria | 123456    | Colombia | Windows      | Windows 10        | Spanish            | Xiaomi           | Redmi Note             | Android 4.4.4      | Pass1234Aa. | Pass1234Aa.          |
    Then se completara el registro de manera satisfactoria
        | textoFinal     |
        | Complete Setup |
