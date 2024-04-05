# GreenwiChart

Esta aplicación es un programa muy sencillo para principiantes escrito en el lenguaje Java. Inicialmente era una tarea del módulo de Programación en mi centro de estudios. Consistía en un programa de calcular la distancia entre dos puntos geográficos en base a introducir sus valores de latitud y longitud. Posteriormente, se añadió la interfaz gráfica. Se ha creado usando tanto Visual Studio Code como el IDE Apache Netbeans en distintas versiones, pero todas recientes. No sería recomendable crearlo con un editor de texto o código aisladamente, ya que se asume que lo hará un principiante y el programa cuenta con varios centenares de líneas de código, algo poco manejable si no se desarrolla con un IDE.

## Requisitos previos

Si clonas este repositorio o descargas los ficheros que encontrarás en `src/GreenwiChart` y tratas de ejecutar esta aplicación haciendo simplemente "click", no funcionará, ya que antes se tiene que compilar a ficheros  `NombreDelFichero.class`. Para ello, necesitarás el kit de desarrollo de java, el cual provee las herramientas de compilación, el entorno de ejecución y la máquina virtual de java. Todo ello es necesario tenerlo instalado en tu sistema.

En el enlace de abajo puedes descargar la versión de este mencionado kit, el JDK, en la página oficial del desarrollador, la empresa Oracle.

Escoge bien el archivo a descargar, sabiendo cuál es tu sistema operativo, arquitectura de CPU, versión del JDK que deseas...ya el propio ejecutable te irá guiando con un menú gráfico y lo añadirá como variable de entorno:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/)

## Cómo compilar y ejecutar

1. Abre una terminal de comandos.
2. Sitúate en el directorio donde se encuentran los ficheros con extensión `.java` y la imagen del icono del programa.
3. Compila, uno a uno los ficheros utilizando el siguiente comando:

    ```sh
   javac NombreDelFichero.java

4. Una vez compilados, tendrás en el mismo directorio las versiones con la extensión `.class` de los ficheros compilados. Usa el siguiente comando con el fichero para ejecutar el programa:

    ```sh
    java GreenwiChart

5. El resultado esperado sería el siguiente:

   ![Screenshot del output esperado](/src/GreenwiChart/Screenshot_GreenwiChart_esperado.png)

6. Introduce las coordenada con decimales en sus respectivas posiciones

## Autor

El autor de este programa es Luís Vázquez Lema.

## Licencia

Se adjunta una copia de la licencia  MIT aplicable sin clona el repositorio: ería el fichero `LICENSE`.
