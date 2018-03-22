package car;

import visitor.CarVisitor;

public class Hood implements car.ICarPart {
    @Override
    public void accept(CarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
