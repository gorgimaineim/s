public class Iphone extends Phone implements IOS,Ai{
    public Iphone() {
    }

    public Iphone(int cost, int year, String color) {
        super(cost, year, color);
    }

    @Override
    void call(int number) {
        System.out.println(number + " is calling your Iphone ");
    }

    @Override
    void charge(int procent) {
        System.out.println("your Iphone is " + procent + "%");
    }

    @Override
    void alarm(double time) {
        System.out.println("your Iphone clock is ringing");
    }

    @Override
    public void systemInfoIOS() {
        System.out.println("ios");
    }

    @Override
    public void photoEdit() {
        System.out.println("edited");
    }

    @Override
    public void photoGenerate() {
        System.out.println("generated");
    }
}
