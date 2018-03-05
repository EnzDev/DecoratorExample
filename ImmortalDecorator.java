public class ImmortalDecorator implements IHuman{
    private IHuman decoratedHuman;

    ImmortalDecorator(IHuman h){ this.decoratedHuman = h; }

    @Override
    public int getLifeExpectancy() {
        return Integer.MAX_VALUE;
    }

    @Override
    public float getSpeed() {
        return decoratedHuman.getSpeed();
    }

    @Override
    public String toString() {
        return decoratedHuman + " & Immortal";
    }
}
