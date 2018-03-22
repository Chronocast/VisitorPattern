package car;

import visitor.ICarVisitor;

public interface ICarPart
{
    public void accept(ICarVisitor carVisitor);
}
