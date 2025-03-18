public class Main {
    public static void main(String[] args) throws Exception {
        Clock brlclock = new BRLClock();
        brlclock.setHour(14);
        brlclock.setMinute(0);
        brlclock.setSecond(0);

        System.out.println(brlclock.getTime());
        System.out.println(new USClock().convert(brlclock).getTime());
    }
}
