import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer, float salary) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
        this.salary = salary;
    }

    public String fullName(){
        return String.format("%s %s", name, surname);
    }

    public float calculateYearlySalary(){
        return this.salary * 12;
    }

    public boolean isMEI() {
        LocalDate birthLocalDate = this.birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(birthLocalDate, LocalDate.now());
        int age = period.getYears();
        if (calculateYearlySalary() > 130000) return false;
        if (age < 18) return false;
        if (this.anotherCompanyOwner) return false;
        if (this.pensioner) return false;
        if (this.publicServer) return false;
        return true;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
}
