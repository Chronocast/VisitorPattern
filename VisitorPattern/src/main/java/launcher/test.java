package launcher;

import car.Car;
import car.ICarParts;
import visitor.Driver;

public class test
{
    public static void main(String[] args)
    {
        ICarParts car = new Car();

        car.accept(new Driver());
    }
}
