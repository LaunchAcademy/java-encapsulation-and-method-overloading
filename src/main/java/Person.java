public class Person {

    private String firstName;
    private String lastName;
    private String hairColor;

    public Person() {
        this.firstName = "Kevin";
        this.hairColor = "black";
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }

    public String toString(int displayNum){
        return this.toString() + " " + displayNum;
    }

    public Person(String firstName, String lastName, String hairColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hairColor = hairColor;
    }

    public String getFirstName() {
        return this.firstName;
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

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
