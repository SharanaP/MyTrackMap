package com.sp.sharan.mytrackmap.model;

import java.util.List;

public class LegsObject {
    private List<StepsObject> steps;
    public LegsObject(List<StepsObject> steps) {
        this.steps = steps;
    }
    public List<StepsObject> getSteps() {
        return steps;
    }
}
