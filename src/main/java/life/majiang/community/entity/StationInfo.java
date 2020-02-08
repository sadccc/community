package life.majiang.community.entity;

import java.util.List;

public class StationInfo {
    private int stationId;
    private String stationName;
    private List<Device> resDevices;

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Device> getResDevices() {
        return resDevices;
    }

    public void setResDevices(List<Device> resDevices) {
        this.resDevices = resDevices;
    }
}
