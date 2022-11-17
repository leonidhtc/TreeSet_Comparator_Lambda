import java.util.Comparator;

public class User implements Comparable<User>{
    String name;
    int age;
    int height;
    int weight;

    public User(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        System.out.println(this + " hashCode()==" + this.hashCode() );

    }

    public String toString() {
        return name + "-" + age + "-" + height + "-" + weight;
    }

    public int compareTo(User u) {
        //System.out.println(this +" <> "+ u);
        return this.height - u.height;
    }

}

class UserNameComparator implements Comparator<User>{
    public int compare(User a, User b){
        return a.name.compareTo(b.name);
    }
}
class UserAgeComparator implements Comparator<User>{
    public int compare(User a, User b){
        return a.age - b.age;
    }
}
class UserHeightComparator implements Comparator<User>{
    public int compare(User a, User b){
        return a.height - b.height;
    }
}
class UserWeightComparator implements Comparator<User>{
    public int compare(User a, User b){
        return a.weight - b.weight;
    }
}

