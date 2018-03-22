package car;

import visitor.ICarVisitor;

public class SteeringWheel implements ICarParts
{

    @Override
    public void accept(ICarVisitor carVisitor)
    {
        carVisitor.visit(this);
    }
}
