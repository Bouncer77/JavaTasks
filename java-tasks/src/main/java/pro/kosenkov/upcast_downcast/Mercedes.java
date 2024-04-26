package pro.kosenkov.upcast_downcast;

public class Mercedes extends Car {
    @Override
    public void turnRightSignal() {
        System.out.println("Turning right signal");
    }

    @Override
    public void turnLeftSignal() {
        System.out.println("Turning left signal");
    }

    @Override
    public void gas() {
        super.gas();
    }

    @Override
    public void brake() {
        super.brake();
    }

    // Езда с мигалками
    // Riding with flashing lights
    public void flashingLights() {
        System.out.println("Flashing lights");
    }
}
