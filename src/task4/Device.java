package task4;

import additionalTask.Animal;

import java.util.Objects;

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
    public boolean equals(Object dev) {

        if (dev != null && dev.getClass() == this.getClass()) {
            Device device = (Device) dev;

            boolean resManufacturer = device.manufacturer == this.manufacturer;
            boolean resPrice = device.price == this.price;
            boolean resSerialNumber = device.serialNumber == this.serialNumber;

            return resManufacturer && resPrice && resSerialNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {

        int result = 31;

        result *= 31 + (manufacturer != null ? manufacturer.hashCode() : 0);
        result *= 31 + Float.floatToRawIntBits(price);
        result *= 31 + (serialNumber != null ? serialNumber.hashCode() : 0);

        return result;
    }
}
