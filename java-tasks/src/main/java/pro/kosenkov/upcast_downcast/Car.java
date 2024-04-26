package pro.kosenkov.upcast_downcast;

public abstract class Car {
    private String name;
    private String manufacturer;
    private int year;

    public abstract void turnRightSignal();
    public abstract void turnLeftSignal();

    public void gas() {
        System.out.printf("%s %s Gas!", manufacturer, name);
    }

    public void brake() {
        System.out.printf("%s %s Stop!", manufacturer, name);
    }
}
