import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyPerson man = new MyPerson("George");
        MyDog dog = new MyDog("Alex", 2);
        MyCat cat = new MyCat("Alisa", 3);
        MyPig pig = new MyPig("Sonia", 1);
        MyHorse horse = new MyHorse("Purga", 4);
        System.out.printf("Человек - > %s, ", man.getName());
        System.out.printf("Собака -> %s\n", dog.getName());
        System.out.println(man);
        System.out.println(dog);
        man.call(dog);
        dog.goRoom(MyHouse.balcony);
        man.call(dog);
        System.out.println(dog);
        dog.goRoom(MyHouse.kitchen);
        System.out.println(dog);
        man.feed(dog);
        man.goRoom(MyHouse.kitchen);
        man.feed(dog);
        man.feed(dog);
        System.out.println("cat Alisa");
        System.out.println("pig Sonia");
        System.out.println("horse Purga");
        System.out.printf("\n%s и %s - Рады быть вместе \n", man.getName(), dog.getName());


        ArrayList<Animal> list = new ArrayList<>();
        int animal = 0;
        Animal animalFourth =  new Animal("Кабан", animal,1);
        Animal animalFirst =  new Animal("Лев", animal,2);
        Animal animalThird = new Animal("Сова", animal,3);
        Animal animalSecond =  new Animal("Тигр", animal, 4);
        System.out.println(animalFirst.compareTo(animalSecond));

        AnimalAgeComparator animalAgeComparator = new AnimalAgeComparator();
        System.out.println(animalAgeComparator.compare(animalFirst,animalSecond));


        list.add(animalSecond);
        list.add(animalThird);
        list.add(animalFirst);
        list.add(animalFourth);

        Iterator<Animal> iterator = list.iterator();

        while(iterator.hasNext()){
            Animal next = iterator.next();
            System.out.println(next);
            if(next.getName().equals ("Кабан"))
            {
                iterator.remove();
                System.out.println( list);
            }
        }

        Collections.sort(list, new AnimalAgeComparator());
//        System.out.println(list);
        System.out.println(list.remove(animalFirst));

        System.out.println(animalFourth.equals((animalSecond)));


    }
}