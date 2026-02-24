package java.service;

import src.*;

public class DeviceService {

    private DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public void saveDevice(Device device) {

        if(!deviceRepository.exists(device)) {
            deviceRepository.save(device);
        }
    }

}