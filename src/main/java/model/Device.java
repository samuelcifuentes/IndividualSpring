package java.model;

import java.util.List;

public class Device {
    public int id;
    public String Name;
    public String SerialNumber;
    public String Type;
    public double MaxValue;
    public double MinValue;
    public long SamplingPeriod;
    public long TimeTolerance;


    public device(int id, String Name, String SerialNumber, String Type, double MaxValue, double MinValue, long SamplinPeriod, long TimeTolerance) {
        this.id = id;
        this.Name = Name;
        this.SerialNumber = SerialNumber;
        this.Type = Type;
        this.MaxValue = MaxValue;
        this.MinValue = MinValue;
        this.SamplingPeriod = SamplinPeriod;
        this.TimeTolerance = TimeTolerance;
    }

    public int getId() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public double getMaxValue() {
        return MaxValue;
    }

    public void setMaxValue(double MaxValue) {
        this.MaxValue = MaxValue;
    }

    public double getMinValue() {
        return MinValue;
    }

    public void setMinValue(double MinValue) {
        this.MaxValue = MinValue;
    }

    public long getSamplingPeriod() {
        return SamplingPeriod;
    }

    public void setSamplingPeriod(long SamplingPeriod) {
        this.SamplingPeriod = SamplingPeriod;
    }

    public long getTimeTolerance() {
        return TimeTolerance;
    }

    public void setTimeTolerance(long TimeTolerance) {
        this.TimeTolerance = TimeTolerance;
    }


}