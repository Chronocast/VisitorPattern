package car;

import visitor.ICarVisitor;

public class Engine implements car.ICarPart {

    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
