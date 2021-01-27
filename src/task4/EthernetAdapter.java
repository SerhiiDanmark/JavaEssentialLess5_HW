package task4;

import java.util.Objects;

public class EthernetAdapter extends Device {

    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);

        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public boolean equals(Object dev) {
        if (dev != null && dev.getClass() == this.getClass()) {
            EthernetAdapter device = (EthernetAdapter) dev;

            boolean resManufacturer = device.manufacturer == this.manufacturer;
            boolean resPrice = device.price == this.price;
            boolean resSerialNumber = device.serialNumber == this.serialNumber;
            boolean resSpeed = device.speed == this.speed;
            boolean resMac = device.mac == this.mac;

            return resManufacturer && resPrice && resSerialNumber && resSpeed && resMac;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;

        result *= 31 + (manufacturer != null ? manufacturer.hashCode() : 0);
        result *= 31 + Float.floatToRawIntBits(price);
        result *= 31 + (serialNumber != null ? serialNumber.hashCode() : 0);
        result *= 31 + speed;
        result *= 31 + (mac != null ? mac.hashCode() : 0);;

        return result;
    }
}
