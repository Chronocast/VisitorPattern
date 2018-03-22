package car;

import visitor.ICarVisitor;

// Defines the elements in the structure
public interface ICarParts
{
    public void accept(ICarVisitor carVisitor);
}
