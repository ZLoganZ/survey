package admin;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String email;
    private String doB;
    private String heardFrom;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        doB = "";
        heardFrom = "";
    }

    public User(String firstName, String lastName, String email, String DoB, String heardFrom) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.doB = DoB;
        this.heardFrom = heardFrom;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String DoB) {
        this.doB = DoB;
    }

    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }
}
