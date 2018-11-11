package com.zone24x7.cluster;

public class Cluster {

    private int clusterId;
    private double latitude;
    private double longitude;
    private double radius;


    public Cluster(int clusterId, double latitude, double longitude, double radius){

        this.clusterId = clusterId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;

    }
}
