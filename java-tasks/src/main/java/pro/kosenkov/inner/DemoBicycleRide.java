package pro.kosenkov.inner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class DemoBicycleRide {
    public static void main(String[] args) {

        Human rider = new Human("Ivan", 80, LocalDate.of(1955, 11, 15));
        Bicycle bicycle = new Bicycle("Srels", 21, 12);
        BicycleRider bicycleRider = new BicycleRider(rider, bicycle);

        bicycleRider.downSeat();
        bicycleRider.start();
        bicycleRider.turnRight();
        bicycleRider.stop();
    }
}

@AllArgsConstructor
class BicycleRider implements ControlBicycle {

    private Human rider;
    private Bicycle bicycle;

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void turnLeft() {
        System.out.println("left");
    }

    @Override
    public void turnRight() {
        System.out.println("right");
    }

    @Override
    public void upSeat() {
        System.out.println("up seat");
    }

    @Override
    public void downSeat() {
        System.out.println("down seat");
    }
}

@AllArgsConstructor
class Human {
    private String name;
    private int weight;
    private LocalDate birthDate;
}

interface ControlBicycle {
    void start();
    void stop();
    void turnLeft();
    void turnRight();
    void upSeat();
    void downSeat();
}

@Setter
@Getter
class Bicycle {

    private String model;
    private int weight;

    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    @Setter
    @Getter
    class HandleBar {
        private boolean isBroken = false;
    }

    class Seat {
        public void getSeatParam() {
            System.out.println("Параметр сиденья: диаметр подседельного штыря = " + Bicycle.this.seatPostDiameter);
        }
    }
}
