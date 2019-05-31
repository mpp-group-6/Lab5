package prob4.domain;


public class CannotFly implements FlyBehavior
{
    @Override
    public void fly() {
        System.out.println("Sorry buddy. I cannot fly");
    }
}
