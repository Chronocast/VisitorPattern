package car;

import visitor.ICarVisitor;

public class Hood implements car.ICarPart {

    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
