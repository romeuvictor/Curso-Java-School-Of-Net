public class Person {

    public String name;
    public Integer age;
    public String cpf;

    public Person(){}

    public Person(String nome, Integer age){
        this.name = nome;
        this.age = age;
    }

    public void say(){
        System.out.println(" I'm saying something...");
    }

    public static String walk(){
        return "I'm walkin...";
    }
}
