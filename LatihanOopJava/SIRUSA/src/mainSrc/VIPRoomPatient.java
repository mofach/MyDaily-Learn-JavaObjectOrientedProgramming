package mainSrc;

import java.util.Date;

public class VIPRoomPatient extends Patient {
    public VIPRoomPatient(String name, String gender, int age, Date admissionDate, String complaint) {
        super(name, "VIP", gender, age, admissionDate, complaint);
    }
}