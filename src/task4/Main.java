package task4;

public class Main {
    public static void main(String[] args) {

        Device d1 = new Device("Samsung", 120, "AB1234567CD");
        Device d2 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Device d3 = new EthernetAdapter("TP-Link", 80, "AB12567FD", 120, "001AFJ8L63W");

        System.out.println("Result equals: ");
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println("-------------------");
        System.out.println("Result hashCode: ");
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println(d3.hashCode());

    }
}
