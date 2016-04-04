package pl.samouczekprogramisty.rescuer.model;

/**
 * Created by Maciek on 23.03.2016.
 */
public class Position {
    private double lat;
    private double lon;

    public Position (double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
