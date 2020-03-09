package model;

import java.util.UUID;

public interface Assets  {
    UUID getId();
    String getType();
    String getMake();
    String getAssignedTo();
    String getAssigner();
    String getAvailability();
    String getStatus();


}
