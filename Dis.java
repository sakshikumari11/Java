import java.util.*;
class car {
    String color;
    car(String color) {
        this.color = color;
    }
    void displayColor() {
        System.out.println("The color of the car is: " + color);
    }
}
public class Dis {
    public static void main(String[] args) {
        car myCar = new car("Red");
        myCar.displayColor();
    }
}
