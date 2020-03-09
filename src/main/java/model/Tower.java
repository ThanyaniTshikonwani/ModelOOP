package model;

import java.util.UUID;

public class Tower  extends Electronics {




    public Tower(UUID id, String make, String assignedTo, String assigner, String availability, String status) {
        super(id, "Tower", make, assignedTo, assigner, availability, status);
    }

    private String ram;
    private String cpu;
    private String diskSize;
    private String diskType;




    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(String diskSize) {
        this.diskSize = diskSize;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
//    @Override
//    public String toString() {
//        return "Tower{" +
//                "ram='" + ram + '\'' +
//                ", cpu='" + cpu + '\'' +
//                ", diskSize='" + diskSize + '\'' +
//                ", diskType='" + diskType + '\'' +
//                '}';
//    }

}
