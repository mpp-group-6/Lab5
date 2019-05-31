package prob4.domain.ducks;

import prob4.domain.FlyWithWings;
import prob4.domain.Quack;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        super(new FlyWithWings(), new Quack());
    }

}
