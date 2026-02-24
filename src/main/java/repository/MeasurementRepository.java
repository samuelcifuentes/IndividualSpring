package java.repository;

import src.*;
import java.util.ArrayList;

public class MeasurementRepository {
    private ArrayList<Measurement> measurements = new ArrayList<>();

    public void save(Measurement measurement) {
        measurements.add(measurement);
    }

    public ArrayList<Measurement> getMeasurements() {

        return measurements;
    }


}