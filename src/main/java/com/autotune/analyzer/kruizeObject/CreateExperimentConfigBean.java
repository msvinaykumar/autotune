package com.autotune.analyzer.kruizeObject;

public class CreateExperimentConfigBean {

    // Private fields
    private String mode;
    private String target;
    private String version;
    private String datasourceName;
    private String performanceProfile;
    private double threshold;
    private String measurementDurationStr;
    private int measurementDuration;

    // Getters and Setters
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public String getPerformanceProfile() {
        return performanceProfile;
    }

    public void setPerformanceProfile(String performanceProfile) {
        this.performanceProfile = performanceProfile;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public String getMeasurementDurationStr() {
        return measurementDurationStr;
    }

    public void setMeasurementDurationStr(String measurementDurationStr) {
        this.measurementDurationStr = measurementDurationStr;
    }

    public int getMeasurementDuration() {
        return measurementDuration;
    }

    public void setMeasurementDuration(int measurementDuration) {
        this.measurementDuration = measurementDuration;
    }

    @Override
    public String toString() {
        return "MonitoringConfigBean{" +
                "mode='" + mode + '\'' +
                ", target='" + target + '\'' +
                ", version='" + version + '\'' +
                ", datasourceName='" + datasourceName + '\'' +
                ", performanceProfile='" + performanceProfile + '\'' +
                ", threshold=" + threshold +
                ", measurementDurationStr='" + measurementDurationStr + '\'' +
                ", measurementDuration=" + measurementDuration +
                '}';
    }
}
