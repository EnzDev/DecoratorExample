public class Main {
    public static void main(String[] args){
        IHuman superHuman = new FlashDecorator(new ImmortalDecorator(new Human()));
        System.out.println(superHuman.getSpeed());
        System.out.println(superHuman.getLifeExpectancy());
    }
}
