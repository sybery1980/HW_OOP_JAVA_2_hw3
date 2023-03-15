import java.util.Objects;

public  class  Animal implements Comparable<Animal> {


    private Object Animal;
    public String name;
    private int age;

    public Animal(Object animal, String name, int age, int satiety) {
        Animal = animal;
        this.name = name;
        this.age = age;
        this.satiety = satiety;
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int satiety;

    public Animal(String name, int satiety, Object animal) {
        this.name = name;
        Animal = animal;
        this.satiety = 2;

    }

    public Animal(String сова, int animal) {
        Animal = animal;
    }

    public Object Animal(String кабан, Object animal) {
        Animal = animal;
        return Animal;
    }


    public Animal(Object animal, String name, int satiety) {
        Animal = animal;
        this.name = name;
        this.satiety = satiety;
    }

    public Animal(Object animal) {
        Animal = animal;
    }

    public Object getAnimal() {
        return Animal;
    }

    public void setAnimal(Object animal) {
        Animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal(int age, int satiety) {
        this.age = age;
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return name;


    }

    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else return this.getName().equals(((Animal) obj).getName());
    }
}
