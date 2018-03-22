package visitor;

import car.*;

public class Driver implements ICarVisitor
{
    private String name = "DRIVER";

    @Override
    public void visit(SteeringWheel steeringWheel)
    {
        System.out.println(name + " honks the horn ");
    }

    @Override
    public void visit(Door door) {
        System.out.println(name + " opens the door");
    }

    @Override
    public void visit(Hood hood) {
        System.out.println(name + " takes a selfie on the hood");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println(name + " starts the engine");
    }

    @Override
    public void visit(Car car) {
        System.out.println(name + " comes to the car");
    }
}
