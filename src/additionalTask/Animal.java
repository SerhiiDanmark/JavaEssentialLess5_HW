package additionalTask;

public class Animal {

    private String name;
    private int age;
    private boolean tale;

    public Animal (String name, int age, boolean tale){
        this.name = name;
        this.age = age;
        this.tale = tale;
    }

    @Override
    public boolean equals(Object pet) {

        if (pet != null && pet.getClass() == this.getClass()) {
            Animal animal = (Animal) pet;

            boolean resName = animal.name == this.name;
            boolean resAge = animal.age == this.age;
            boolean resTale = animal.tale == this.tale;

            return resName && resAge && resTale;
        }
        return false;
    }

    @Override
    public int hashCode() {

        int result = 31;

        result *= 31 + (tale ? 1 : 0);
        result *= 31 + (name != null ? name.hashCode() : 0);
        result *= 31 + age;

        return result;
    }

    @Override
    public String toString() {
        return ("Ім'я: " + name + ", " + "Вік: " + age + ", " + "Хвіст: " + (tale ? "Є" : "Немає"));
    }
}
