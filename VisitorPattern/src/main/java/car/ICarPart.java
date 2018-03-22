package car;

import visitor.CarVisitor;

public interface ICarPart
{
    public void accept(CarVisitor carVisitor);
}
