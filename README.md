# [Evaluación Técnica: Pruebas Automatizadas de Móviles]
Test numero 2: Pruebas Automatizadas Móviles.

## Detalles generales de la implementación

Los tests usan tareas (tasks), interacciones (interactions), elementos de páginas (userinterface).
La estructura completa del proyecto es la siguiente:

````
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interactions
    Clases que representan las interacciones directas con la interfaz de usuario
+ userinterface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objetos usados para consultar acerca del estado de la aplicación
+ util
    Clases de utilidad
+ runners
    Clases que permiten correr los tests
+ step definitions
    Clases que mapean las líneas Gherkin a código java
+ features
    La representación de las historias en archivos cucumber
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8, Appium y Maven

## Para correr el proyecto

Descargar el .zip del proyecto e importarlo en Intelli IDEA, luego configurar el runner "RunnerVodQA" para su debida ejecuciòn. 
    
 ### Si tiene alguna pregunta, puede escribirme a jorgehernan.ramirez@globant.com

