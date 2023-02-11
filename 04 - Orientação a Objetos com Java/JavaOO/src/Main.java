public class Main {
    public static void main(String[] args) {

        Person  person = new Person("Romeu",20);
        Person person2 = new Person();
        person2.name = "Paula";
        person2.age = 21;

        person.say();

        System.out.println(Person.walk());
        System.out.println("Hello world! " + person.name);
        System.out.println("Hello world! " + person2.name);
    }
}