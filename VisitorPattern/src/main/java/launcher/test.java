package launcher;

import car.Car;
import car.ICarPart;
import visitor.Driver;
import visitor.Mechanic;

public class test
{
    public static void main(String[] args)
    {
        ICarPart car = new Car();

        car.accept(new Driver());
        System.out.println("\n");
        car.accept(new Mechanic());
    }
}
