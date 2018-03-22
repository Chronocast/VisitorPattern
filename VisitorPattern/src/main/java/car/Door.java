package car;

import visitor.CarVisitor;

public class Door implements car.ICarPart {
    @Override
    public void accept(CarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
