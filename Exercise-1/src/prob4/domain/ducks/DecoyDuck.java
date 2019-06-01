package prob4.domain.ducks;

import prob4.domain.CannotFly;
import prob4.domain.MuteQuack;

public class DecoyDuck extends Duck
{
    public DecoyDuck()
    {
        super(new CannotFly(), new MuteQuack());
    }
    
    @Override
    public void display() {
        System.out.println("Displaying DecoyDuck");
    }

}
