public class Human implements IHuman{

    @Override
    public int getLifeExpectancy() {
        return 100;
    }

    @Override
    public float getSpeed() {
        return 44.72f;
    }

    @Override
    public String toString() {
        return "Human";
    }
}
