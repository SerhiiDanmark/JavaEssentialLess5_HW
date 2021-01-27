package task3;

public class Device {

    String manufacturer;
    float price;
    String serialNumber;

    public Device (String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return ("Device: " + "manufacturer = " + getManufacturer() + ", " + "price = " + getPrice() + ", " + "serialNumber = " + getSerialNumber());
    }
}
