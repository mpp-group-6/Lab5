package prob4.domain.ducks;

import prob4.domain.FlyWithWings;
import prob4.domain.Quack;

public class RedHeadDuck extends Duck
{
    public RedHeadDuck()
    {
        super(new FlyWithWings(), new Quack());
    }
    
    @Override
    public void display() {
        System.out.println("Displaying RedHeadDuck");
    }
}
