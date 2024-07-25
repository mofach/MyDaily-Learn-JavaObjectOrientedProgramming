package mainSrc;

public class Schedule {
    private String day;
    private String doctorName;
    private String doctorField;
    private String doctorRoom;
    private String doctorSchedule;

    public Schedule(String day, String doctorName, String doctorField, String doctorRoom, String doctorSchedule) {
        this.day = day;
        this.doctorName = doctorName;
        this.doctorField = doctorField;
        this.doctorRoom = doctorRoom;
        this.doctorSchedule = doctorSchedule;
    }

    public String getDay() {
        return day;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorField() {
        return doctorField;
    }

    public String getDoctorRoom() {
        return doctorRoom;
    }

    public String getDoctorSchedule() {
        return doctorSchedule;
    }

    @Override
    public String toString() {
        return String.format(
            "Schedule Information:\n" +
            "Day            : %s\n" +
            "Doctor Name    : %s\n" +
            "Doctor Field   : %s\n" +
            "Doctor Room    : %s\n" +
            "Doctor Schedule: %s\n",
            day, doctorName, doctorField, doctorRoom, doctorSchedule
        );
    }

}
