package task4;

import java.util.Objects;

public class Monitor extends Device {

    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);

        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public boolean equals(Object dev) {
        if (dev != null && dev.getClass() == this.getClass()) {
            Monitor device = (Monitor) dev;

            boolean resManufacturer = device.manufacturer == this.manufacturer;
            boolean resPrice = device.price == this.price;
            boolean resSerialNumber = device.serialNumber == this.serialNumber;
            boolean resResolutionX = device.resolutionX == this.resolutionX;
            boolean resResolutionY = device.resolutionY == this.resolutionY;

            return resManufacturer && resPrice && resSerialNumber && resResolutionX && resResolutionY;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;

        result *= 31 + (manufacturer != null ? manufacturer.hashCode() : 0);
        result *= 31 + Float.floatToRawIntBits(price);
        result *= 31 + (serialNumber != null ? serialNumber.hashCode() : 0);
        result *= 31 + resolutionX;
        result *= 31 + resolutionY;

        return result;
    }
}
