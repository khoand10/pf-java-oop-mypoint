public class app {
    public static void main(String[] args) {
        MyPoint m1 = new MyPoint(0,0);
        MyPoint m2 = new MyPoint(1,1);
        double longg=MyPoint.distance(m1,m2);
        System.out.printf("%.3f",longg);
    }
}
