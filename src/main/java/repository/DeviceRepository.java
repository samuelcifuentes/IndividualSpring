package java.repository;

import src.*;
import java.util.ArrayList;


public class DeviceRepository {

    private ArrayList<Device> Devices = new ArrayList<>();

    public void save(Device device) {

        devices.add(device);
    }

    public boolean exists(Course course) {
        return devices.contains(device);
    }

    public ArrayList<Device> getDevices() {

        return devices;
    }

}
