package GreenwiChart;

import java.util.Scanner;

public class GreenwiChartOps {

    static double distanciaCoordenadas(double lat1, double lat2, double longi1, double longi2) {
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        longi1 = Math.toRadians(longi1);
        longi2 = Math.toRadians(longi2);
        double difLat = lat2 - lat1;
        double difLongi = longi2 - longi1;
        double a = Math.pow(Math.sin(difLat / 2), 2.0) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(difLongi / 2), 2.0);
        double c = 2.0 * Math.atan2(Math.sqrt(a), Math.sqrt(1.0 - a));
        return 6378.0 * c;
    }

    public GreenwiChartOps(){
        Scanner tec = new Scanner(System.in);

        Coordenada coordenada1 = obtenerCoordenada(tec, "Primera");
        Coordenada coordenada2 = obtenerCoordenada(tec, "Segunda");

        double distancia = distanciaCoordenadas(coordenada1.getLatitud(), coordenada2.getLatitud(),
                                                coordenada1.getLongitud(), coordenada2.getLongitud());

        System.out.println("La distancia entre coordenadas es: " + distancia + " km");
    }

    private static Coordenada obtenerCoordenada(Scanner tec, String orden) {
        System.out.println("Introduzca las coordenadas para la " + orden + " coordenada:");
        System.out.print("Latitud: ");
        double latitud = tec.nextDouble();
        System.out.print("Longitud: ");
        double longitud = tec.nextDouble();

        Coordenada coordenada = new Coordenada();
        coordenada.setLatitud(latitud);
        coordenada.setLongitud(longitud);

        return coordenada;
    }
}
