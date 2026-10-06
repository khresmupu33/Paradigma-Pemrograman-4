package Soal1;

import java.util.Date;

public class Employee extends Person {
    private String id;
    private Date joinDate;

    public Employee() {
        super();
    }

    public Employee(String id, Date joinDate, String firstName, String lastName) {
        super(firstName, lastName);
        this.id = id;
        this.joinDate = joinDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
