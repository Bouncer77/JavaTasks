package pro.kosenkov.upcast_downcast;

public class Solution {

    public static void main(String[] args) {

        // upcasting - расширение - преобразование short к int
        Car carBmw = new BMW();
        Car carM = new Mercedes();
        carBmw.turnLeftSignal(); // Error - change the gasket between the steering wheel and the seat
        carM.turnLeftSignal(); // Turning left signal
        // bmw.showOffs(); // Не можем вызвать! Так его нет в классе Car

        // downcast - сужение - преобразование int к short
        BMW bmw = (BMW) carBmw;
        bmw.showOffs(); // Riding on the side of the road

        Mercedes mercedes = (Mercedes) carM;
        mercedes.flashingLights(); // Riding with flashing lights

        try {
            BMW bmw2 = (BMW) carM;
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }
;}
