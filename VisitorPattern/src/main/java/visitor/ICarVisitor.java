package visitor;

import car.*;

public interface ICarVisitor
{
    public void visit(SteeringWheel steeringWheel);
    public void visit(Door door);
    public void visit(Hood hood);
    public void visit(Engine engine);
    public void visit(Car car);
}