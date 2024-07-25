package mainSrc;

import java.util.Date;

public class PresidentSuitePatient extends Patient {
    public PresidentSuitePatient(String name, String gender, int age, Date admissionDate, String complaint) {
        super(name, "President Suite", gender, age, admissionDate, complaint);
    }
}
