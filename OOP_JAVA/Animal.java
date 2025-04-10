import java.sql.Date;

public class Animal {
    private String name;
    private Date birthDate;
    
    public Animal(String name, java.util.Date birthDate2) {
        this.name = name;
        this.birthDate = (Date) birthDate2;
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
}