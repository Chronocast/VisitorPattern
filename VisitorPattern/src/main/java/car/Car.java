package car;

import visitor.CarVisitor;

public class Car implements car.ICarPart {
    car.ICarPart[] carElement;

    //create car object array with all parts
    public Car(){
        this.carElement = new car.ICarPart[]{new Door(), new Hood(), new Engine(), new SteeringWheel()};
    }
    @Override
    public void accept(CarVisitor carVisitor) {
        carVisitor.visit(this);
        //loop through all car elements
        for(car.ICarPart e: carElement){
            e.accept(carVisitor);
        }
    }
}
