package car;

import visitor.ICarVisitor;

public class Engine implements ICarParts
{

    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
