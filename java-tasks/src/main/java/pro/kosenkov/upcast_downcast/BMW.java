package pro.kosenkov.upcast_downcast;

public class BMW extends Car {
    @Override
    public void turnRightSignal() {
        System.out.println("Error - change the gasket between the steering wheel and the seat");
    }

    @Override
    public void turnLeftSignal() {
        System.out.println("Error - change the gasket between the steering wheel and the seat");
    }

    @Override
    public void gas() {
        super.gas();
    }

    @Override
    public void brake() {
        super.brake();
    }

    // Езда по обочине
    public void showOffs() {
        System.out.println("Riding on the side of the road");
    }

}
