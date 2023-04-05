public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Denis")
                .setSurname("Chernikov")
                .setAge(26)
                .setCity("Tambov")
                .build();

        person.getAge();
        person.getSurname();
        System.out.println(person.toString());

        Person child = person.newChildBuilder()
                .setName("Pavel")
                .setAge(2)
                .build();

        System.out.println(child.toString());
    }
}
