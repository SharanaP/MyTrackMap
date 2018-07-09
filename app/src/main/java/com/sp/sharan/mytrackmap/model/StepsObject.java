package com.sp.sharan.mytrackmap.model;

public class StepsObject {
    private PolylineObject polyline;
    public StepsObject(PolylineObject polyline) {
        this.polyline = polyline;
    }
    public PolylineObject getPolyline() {
        return polyline;
    }
}
