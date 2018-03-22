package car;

import visitor.ICarVisitor;

public class Hood implements ICarParts
{

    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
