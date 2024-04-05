package GreenwiChart;

public class Coordenada {
    private double latitud;
    private double longitud;

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLatitud(double latitud) {
        if (latitud >= -90 && latitud <= 90) {
            this.latitud = latitud;
        } else {
            System.out.println("Latitud fuera de rango.");
        }
    }

    public void setLongitud(double longitud) {
        if ((longitud >= 0 && longitud <= 180) || (longitud < 0 && longitud >= -179.9999999)) {
            this.longitud = longitud;
        } else {
            System.out.println("Longitud fuera de rango.");
        }
    }
}
