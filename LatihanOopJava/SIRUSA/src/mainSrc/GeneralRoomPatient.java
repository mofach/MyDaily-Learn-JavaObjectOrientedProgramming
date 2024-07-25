package mainSrc;

import java.util.Date;

public class GeneralRoomPatient extends Patient {
    public GeneralRoomPatient(String name, String gender, int age, Date admissionDate, String complaint) {
        super(name, "General", gender, age, admissionDate, complaint);
    }
}
