package prob4.domain.driver;

import java.util.Arrays;
import java.util.List;
import prob4.domain.ducks.DecoyDuck;
import prob4.domain.ducks.Duck;
import prob4.domain.ducks.MallardDuck;
import prob4.domain.ducks.RedHeadDuck;
import prob4.domain.ducks.RubberDuck;

public class Main
{
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new DecoyDuck(), new RedHeadDuck(), new RubberDuck());
        ducks.forEach(duck->duck.display());
    }
}
