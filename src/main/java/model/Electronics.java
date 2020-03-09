package model;

import java.util.UUID;

public class Electronics implements Assets {
    private UUID id;
    private String type;
    private String make;
    private String assignedTo;
    private String assigner;
    private String availability;
    private String status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getAssigner() {
        return assigner;
    }

    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Electronics " +
                "id =" + id +
                ", type ='" + type + '\'' +
                ", make ='" + make + '\'' +
                ", assignedTo ='" + assignedTo + '\'' +
                ", assigner ='" + assigner + '\'' +
                ", availability ='" + availability + '\'' +
                ", status ='" + status + '\'';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Electronics(UUID id, String type, String make, String assignedTo, String assigner, String avialabilty, String status) {
        this.id = id;
        this.type = type;
        this.make = make;
        this.assignedTo = assignedTo;
        this.assigner = assigner;
        this.availability = avialabilty;
        this.status = status;
    }
}
