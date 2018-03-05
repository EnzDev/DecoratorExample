import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<IHuman> humans = new ArrayList<>();
        humans.add(new FlashDecorator(new ImmortalDecorator(new Human())));
        humans.add(new ImmortalDecorator(new FlashDecorator(new Human())));
        humans.add(new ImmortalDecorator(new Human()));
        humans.add(new FlashDecorator(new Human()));
        humans.add(new Human());

        humans.forEach(h->{
            System.out.println(h.toString());
            System.out.println("Speed : " + h.getSpeed());
            System.out.println("Life  : " + h.getLifeExpectancy());
            System.out.println();
        });
    }
}
