public class Dimensions {
    private final double width; // sm.
    private final double height; // sm.
    private final double length; // sm.

    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, height, length);
    }

    public double getHeight() {
        return height;
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(width, height, length);
    }

    public double getLength() {
        return length;
    }

    public Dimensions setLength(double length) {
        return new Dimensions(width, height, length);
    }

    public String toVolume(){
        return "Обьём груза: " + width * height * length ;
    }

    public String toString(){
        return "Габариты груза: " + "\n" + "Ширина: " + getWidth() + "\n" + "Высота: " + getHeight() + "\n" + "Длина: " + getLength()
                + "\n" + toVolume();
    }


    public double getMeth(double width, double length, double height){
        return width * length * height;
    }

}
