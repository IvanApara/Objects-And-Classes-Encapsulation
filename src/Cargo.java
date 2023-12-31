public class Cargo {

    private final Dimensions  dimensions;
    private final double weigh; // kg
    private final String deliveryAddress;
    private final boolean onlyVertically;
    private final String registrationNumber;
    private final boolean fragile;

    public Cargo(Dimensions dimensions,
                 double weigh, String deliveryAddress,
                 boolean onlyVertically, String registrationNumber,
                 boolean fragile) {
        this.dimensions = dimensions;
        this.weigh = weigh;
        this.deliveryAddress = deliveryAddress;
        this.onlyVertically = onlyVertically;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions,  weigh, deliveryAddress, onlyVertically,registrationNumber,fragile);
    }

    public double getWeigh() {
        return weigh;
    }

    public Cargo setWeigh(int weigh) {
        return new Cargo(dimensions, weigh, deliveryAddress, onlyVertically,registrationNumber,fragile);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }


    public boolean isOnlyVertically() {
        return onlyVertically;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, weigh, deliveryAddress, onlyVertically,registrationNumber,fragile);
    }

    public boolean isFragile() {
        return fragile;
    }

    public String toString(){
        return "     Информауция о грузе:" + "\n" + getDimensions() + "\n" + "Вес груза: " + weigh + "\n"
                + "Адрес доставки: " + deliveryAddress + "\n" + "Регистарионный номер: " + getRegistrationNumber();
    }
}
