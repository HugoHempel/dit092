public class Planner {

    public int genId(){
        final int MAX = 99999;
        final int MIN = 100000;
        int range = Math.abs(MAX - MIN) + 1;
        return (int)(Math.random() * range) + (MIN <= MAX ? MIN : MAX);
    }
}
