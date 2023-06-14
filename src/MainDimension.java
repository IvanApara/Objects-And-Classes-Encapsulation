public class MainDimension {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(3, 3,3);
        dimensions = dimensions.setLength(1);
        dimensions = dimensions.setHeight(2);
        dimensions = dimensions.setWidth(4);
        dimensions = dimensions.setLength(5);
        Cargo cargo = new Cargo(dimensions , 50, "улица Нехинская 55", true,
                "586355", true);
        cargo = cargo.setWeigh(35);
        System.out.println(cargo);
        cargo = cargo.setRegistrationNumber("333333");
        System.out.println(cargo);
        cargo = cargo.setWeigh(1);
        cargo = cargo.setDimensions(dimensions = dimensions.setLength(5.1));
        cargo = cargo.setDimensions(dimensions = dimensions.setWidth(5.2));
        cargo = cargo.setDimensions(dimensions = dimensions.setHeight(5.3));
        System.out.println(cargo);

    }
}
