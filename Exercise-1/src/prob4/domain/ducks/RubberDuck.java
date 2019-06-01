package prob4.domain.ducks;

import prob4.domain.CannotFly;
import prob4.domain.Squeak;

public class RubberDuck extends Duck
{
    public RubberDuck()
    {
        super(new CannotFly(), new Squeak());
    }
    
    @Override
    public void display() {
        System.out.println("Displaying RubberDuck");
    }

}
