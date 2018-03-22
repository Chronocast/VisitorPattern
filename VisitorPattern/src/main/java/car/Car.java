package car;

import visitor.ICarVisitor;

public class Car implements ICarParts
{
    ICarParts[] carElement;


    //create car object array with all parts
    public Car(){
        this.carElement = new ICarParts[]{new Door(), new Hood(), new Engine(), new SteeringWheel()};
    }


    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visit(this);

        for(ICarParts e: carElement){
            e.accept(carVisitor);
        }
    }
}
