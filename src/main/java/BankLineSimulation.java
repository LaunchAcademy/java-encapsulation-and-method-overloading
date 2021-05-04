public class BankLineSimulation {

  public static void main(String[] args) {
      Person Kevin = new Person();
      Person Michael = new Person("Michael", "Stafford", "brown");
      Person Manpreet = new Person("Manpreet" , "Lamsal", "black");
//    System.out.println(Kevin.toString());
//    System.out.println(Michael.toString());

      Line line = new Line();
      line.addPerson(Kevin);
      line.addPerson(Michael);
      line.addPerson(Manpreet);
      line.addPerson(new Person("Darleen", "Brazoban", "black and green"));

      System.out.println(line.getLine());

      System.out.println(Kevin.toString());
  }
}
