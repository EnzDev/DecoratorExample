public class ImmortalDecorator implements IHuman{
    IHuman decoratedHuman;

    public ImmortalDecorator(IHuman h){ this.decoratedHuman = h; }

    @Override
    public int getLifeExpectancy() {
        return 999;
    }

    @Override
    public float getSpeed() {
        return decoratedHuman.getSpeed();
    }
}
