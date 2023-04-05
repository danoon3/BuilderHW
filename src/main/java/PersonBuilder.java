public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (Character.isAlphabetic(name.charAt(i))) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("Вы ввели некорректное имя");
            }
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        for (int i = 0; i < surname.length(); i++) {
            if (Character.isAlphabetic(surname.charAt(i))) {
                this.surname = surname;
            } else {
                throw new IllegalArgumentException("Вы ввели некорректную фамилию");
            }
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Вы ввели некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не указано достаточно данных(имя или фамилия)");
        }

        if(age >= 0 && city != null)  return new Person(name, surname, age, city);
        else if(age >= 0) return new Person(name, surname, age);
        else return new Person(name, surname);
    }
}
