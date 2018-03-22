package car;

import visitor.ICarVisitor;

public class Door implements ICarParts
{

    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
