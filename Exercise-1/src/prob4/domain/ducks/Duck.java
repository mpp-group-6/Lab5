package prob4.domain.ducks;

import prob4.domain.FlyBehavior;
import prob4.domain.QuackBehavior;

public abstract class Duck 
{
    protected final FlyBehavior fb;
    protected final QuackBehavior qb;
    
    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }
    
    public void swim() {
        System.out.println("I am swimming!");
    }
    
    public void display() {
        String className = this.getClass().getSimpleName();
        System.out.println("**************************");
        System.out.println(String.format("%s:", className));
        System.out.println("Display");
        fb.fly();
        qb.quack();
        swim();
        System.out.println();
        System.out.println();
    }
    

}
