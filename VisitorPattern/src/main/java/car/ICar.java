package car;

import visitor.ICarVisitor;

public interface ICar
{
    public void accept(ICarVisitor carVisitor);
}
