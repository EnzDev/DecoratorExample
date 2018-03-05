public class FlashDecorator implements IHuman {
    private IHuman decoratedHuman;

    public FlashDecorator(IHuman h){ this.decoratedHuman = h; }

    @Override
    public int getLifeExpectancy() {
        return decoratedHuman.getLifeExpectancy();
    }

    @Override
    public float getSpeed() {
        return 3000;
    }
}
