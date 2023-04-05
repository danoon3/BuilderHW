public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }


    public void happyBirthday(){
        if(hasAge()){
          age++;
        }
    }

    public boolean hasAge(){
        if(age != 0 && age > 0) return true;
        else return false;
    }

    public boolean hasCity(){
        if(city != null) return true;
        else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public PersonBuilder newChildBuilder(){
        return new PersonBuilder().setCity(city).setSurname(surname);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", city=" + city +
                '}';
    }
}
