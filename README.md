# GreenwiChart

Esta aplicación es un programa muy sencillo escrito en el lenguaje Java. Inicialmente era una tarea del módulo de Programación en mi centro de estudios. Consistía en un programa de calcular la distancia entre dos puntos geográficos en base a introducir sus valores de latitud y longitud. Posteriormente, se añadió la interfaz gráfica. Se ha creado usando tanto Visual Studio Code como el IDE Apache Netbeans en distintas versiones, pero todas recientes.

## Requisitos previos

Si clonas este repositorio o descargas los ficheros que encontrarás en `src/GreenwiChart` antes de ser ejecutable, se tiene que compilar a ficheros `NombreDelFichero.class`. Para ello, necesitarás el kit de desarrollo de java o JDK, el cual provee las herramientas de compilación, el entorno de ejecución y la máquina virtual de java. Todo ello es necesario tenerlo instalado en tu sistema.

En los enlaces siguientes puedes descargar el mencionado kit, el JDK, en la página oficial del desarrollador, la empresa Oracle; o bien, si lo prefieres, tienes disponible versiones proporcionadas por el proyecto open source Eclipse Temurin, respaldado por la fundación de software libre Eclipse Foundation. Escoge bien el archivo a descargar, sabiendo cuál es tu sistema operativo, arquitectura de CPU, versión del JDK que deseas...después, ya el propio instalador te irá guiando con un menú gráfico con las opciones recomendadas y lo añadirá como variable de entorno.

- [Java Development Kit(JDK) de Oracle](https://www.oracle.com/java/technologies/downloads/)
- [Java Development Kit(JDK) de Eclipse Temurin](https://adoptium.net/es/temurin/releases/)

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

   ![Screenshot del output esperado](/img/Screenshot_GreenwiChart_esperado.png)

6. Introduce las coordenadas con decimales en sus respectivas posiciones.

## Autor

El autor de este programa es Luís Vázquez Lema. Puedes contactar con el autor enviando un correo electrónico a la siguiente dirección: <luisvazquezlema@gmail.com>

## Licencia

Se adjunta una copia de la licencia  MIT aplicable si clona el repositorio: sería el fichero `LICENSE`. Asimismo, en las primeras líneas comentadas de cada fichero `.java` también podrá visualizar el contenido de la licencia.
