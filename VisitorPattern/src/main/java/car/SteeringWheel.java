package car;

import visitor.CarVisitor;

public class SteeringWheel implements car.ICarPart
{

    @Override
    public void accept(CarVisitor carVisitor)
    {
        carVisitor.visit(this);

    }
}
