package task3;

public class Main {
    public static void main(String[] args) {

        Device d1 = new Device("Samsung", 120, "AB1234567CD");
        Device d2 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);

        System.out.println(d1.toString());
        System.out.println(d2.toString());

    }
}
