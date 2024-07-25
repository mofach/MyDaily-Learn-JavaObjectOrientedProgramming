package mainSrc;

public class Doctor {
    private String name;
    private String field;
    private String room;
    private String schedule;

    public Doctor(String name, String field, String room, String schedule) {
        this.name = name;
        this.field = field;
        this.room = room;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public String getRoom() {
        return room;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
public String toString() {
    return String.format(
        "Doctor Information:\n" +
        "Name      : %s\n" +
        "Field     : %s\n" +
        "Room      : %s\n" +
        "Schedule  : %s\n",
        name, field, room, schedule
    );
}

}
