package car;

import visitor.CarVisitor;

public class Engine implements car.ICarPart {
    @Override
    public void accept(CarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
