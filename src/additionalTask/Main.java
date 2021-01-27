package additionalTask;

public class Main {
    public static void main(String[] args) {

    Animal a1 = new Animal("Жора", 2, true);
    Animal a2 = new Animal("Вася", 6, false);

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a1.equals(a2));
    }
}
