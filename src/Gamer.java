import java.util.Date;

public class Gamer {


    private int id;
    private int FirstName;
    private int LastName;
    private int tcNo;
    private int birthDate;

    public Gamer(){

    }

    public Gamer(int id, int firstName, int lastName, int tcNo, int birthDate) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.tcNo = tcNo;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFirstName() {
        return FirstName;
    }

    public void setFirstName(int firstName) {
        FirstName = firstName;
    }

    public int getLastName() {
        return LastName;
    }

    public void setLastName(int lastName) {
        LastName = lastName;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
}
