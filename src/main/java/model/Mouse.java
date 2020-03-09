package model;

import java.util.UUID;

public class Mouse extends Electronics {

    public Mouse(UUID id,  String make, String assignedTo, String assigner, String availability, String status) {
        super(id, "Mouse", make, assignedTo, assigner, availability, status);
    }
}
