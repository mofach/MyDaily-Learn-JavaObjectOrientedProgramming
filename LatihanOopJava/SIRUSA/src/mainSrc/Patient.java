package mainSrc;

import java.util.Date;

public class Patient {
    private String name;
    private String room;
    private String gender;
    private int age;
    private Date admissionDate;
    private String complaint;

    public Patient(String name, String room, String gender, int age, Date admissionDate, String complaint) {
        this.name = name;
        this.room = room;
        this.gender = gender;
        this.age = age;
        this.admissionDate = admissionDate;
        this.complaint = complaint;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public String getComplaint() {
        return complaint;
    }

    @Override
    public String toString() {
        return String.format(
            "Patient Information:\n" +
            "Name           : %s\n" +
            "Room           : %s\n" +
            "Gender         : %s\n" +
            "Age            : %d\n" +
            "Admission Date : %s\n" +
            "Complaint      : %s\n",
            name, room, gender, age, admissionDate, complaint
        );
    }

}

