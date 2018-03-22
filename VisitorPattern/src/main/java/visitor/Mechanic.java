package visitor;

import car.*;

public class Mechanic implements CarVisitor {
   private String name = "Mechanic";

    @Override
    public void visit(SteeringWheel steeringWheel) {
        System.out.println(name + " adds steering fluid");
    }

    @Override
    public void visit(Door door) {
        System.out.println(name + " closes the door");
    }

    @Override
    public void visit(Hood hood) {
        System.out.println(name + " opens the hood");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println(name + " checks the engine oil");
    }

    @Override
    public void visit(Car car) {
        System.out.println(name + " inspect the car");
    }
}
