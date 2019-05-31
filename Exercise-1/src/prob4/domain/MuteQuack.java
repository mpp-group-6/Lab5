package prob4.domain;


public class MuteQuack implements QuackBehavior
{
    @Override
    public void quack() {
        System.out.println("Sorry buddy. I cannot quack :(");
    }
}
