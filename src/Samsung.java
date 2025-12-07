public class Samsung extends Phone implements Android,Ai,WirelessCharging{

    public Samsung() {
    }

    public Samsung(int cost, int year, String color) {
        super(cost, year, color);
    }

    @Override
    void charge(int procent) {
        System.out.println("youre phone is "+ procent+"%");
    }

    @Override
    void alarm(double time) {
        System.out.println("alarm calling");

    }

    @Override
    void call(int number) {
        System.out.println("phone calling from: "+ number);
    }

    @Override
    public void photoEdit() {
        System.out.println("edited");
    }

    @Override
    public void photoGenerate() {
        System.out.println("generated");

    }

    @Override
    public void systemInfoAndroid() {
        System.out.println("android");

    }

    @Override
    public void wirelessCharging() {
        System.out.println("wireless");

    }


    
}
