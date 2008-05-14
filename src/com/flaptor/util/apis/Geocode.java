package com.flaptor.util.apis;

/**
 * represents a geographic position. Can be a country (locality = null) 
 * or a locality (locality != null)
 * country must always be set
 * 
 * @author Martin Massera
 */
public class Geocode {
    private String locality;
    private String country;
    private double[] latLong;
    
    public Geocode() {}
    public Geocode(String locality, String country, double[] latLong) {
        this.locality = locality;
        this.country = country;
        this.latLong = latLong;
    }
    
    public String getLocality() {
        return locality;
    }
    public String getCountry() {
        return country;
    }
    public double[] getLatLong() {
        return latLong;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setLatLong(double[] latLong) {
        this.latLong = latLong;
    }

    public int hashCode() {
        return country.hashCode() + locality != null ? locality.hashCode() : 0;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Geocode)) return false;
        Geocode code = (Geocode)obj;
        if (!country.equals(code.country)) return false;
        if (locality == null) return code.locality == null;
        else return locality.equals(code.locality);
    }
}