import java.util.ArrayList;

public class Line {
    private ArrayList<Person> listOfPeople;

    public Line() {
        listOfPeople = new ArrayList<Person>();
    }

    public void addPerson (Person person) {
        listOfPeople.add(person);
    }

    public String getLine() {
        StringBuilder builder = new StringBuilder();
        builder.append("The following people are in line: ");

        for(Person person : listOfPeople) {
            builder.append(person.getFirstName());
            builder.append(", ");
        }
        return builder.toString();
    }
}
