package launcher;

import car.Car;
import car.ICar;
import visitor.Driver;

public class test
{
    public static void main(String[] args)
    {
        ICar car = new Car();

        car.accept(new Driver());
    }
}
