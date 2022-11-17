/*
https://replit.com/@LeoHTC/TreeSet#Main.java

Создать класс User с полями возраст, имя, рост и вес. Забить обьектами этого класса TreeSet.
Сначала выведи просто в порядке увеличения роста.
Далее в натуральном порядке по имени, если имена одинаковые то по росту, если и рост одинаковый, то все равно добавить (просто учти этот момент)

used article https://metanit.com/java/tutorial/5.6.php
*/

import java.util.TreeSet;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        System.out.println("\nTreeSet\n");
        TreeSet<User> t = new TreeSet<User>();
        t.add(new User("Иван",20, 180, 80));
        t.add(new User("Пётр",19, 170, 70));
        t.add(new User("Сидор",18, 170, 65));
        t.add(new User("Сергей",19, 165, 65));
        t.add(new User("Михаил",18, 170, 70));
        t.add(new User("Фёдор",18, 170, 70));
        t.add(new User("Фёдор",18, 175, 70));
        t.add(new User(null,18, 175, 70));
        //t.add(null); //NullPointerException

        System.out.println(t);
        System.out.println();

        Comparator<User> usercomparator =
                new UserNameComparator()
                        .thenComparing(new UserHeightComparator())
                        .thenComparing(new UserWeightComparator())
                        .thenComparing(new UserAgeComparator());

        // Comparator<User> usercomparator =
        //   ((User a, User b) -> a.name.compareTo(b.name))
        // .thenComparing(new UserHeightComparator())
        // .thenComparing(new UserWeightComparator())
        // .thenComparing(new UserAgeComparator())
        ;


        TreeSet<User> tt = new TreeSet(usercomparator);

        tt.add(new User("Иван",22, 180, 80));
        tt.add(new User("Иван",20, 180, 80));
        tt.add(new User("Иван",21, 185, 80));
        tt.add(new User("Иван",21, 180, 80));
        tt.add(new User("Иван",21, 180, 80));
        tt.add(new User("Пётр",19, 170, 70));
        tt.add(new User("Сидор",18, 170, 65));
        tt.add(new User("Сергей",19, 165, 65));
        tt.add(new User("Михаил",18, 170, 70));
        tt.add(new User("Фёдор",18, 170, 70));
        tt.add(new User("Фёдор",18, 175, 70));
        tt.add(new User("Фёдор",18, 175, 70));
        t.add(new User(null,18, 175, 70));

        System.out.println(tt);

        //Integer i=-128, k=-128;
        String i="teststri"+"ng", k="test"+"string";
        System.out.println(i == k);
        System.out.println(k.hashCode() +","+ i.hashCode());

    }
}

