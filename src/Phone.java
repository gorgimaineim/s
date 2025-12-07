public abstract class Phone {
    private int cost;
    private int year;
    private String color;

    public Phone(){}

    public Phone(int cost, int year, String color) {
        setCost(cost);
        setYear(year);
        setColor(color);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cost=" + cost +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    abstract void call(int number);
    abstract void alarm(double time);
    abstract void charge(int procent);


}
