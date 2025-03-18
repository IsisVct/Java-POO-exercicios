public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        if (clock instanceof USClock usclock) {
            this.hour = (usclock.getPeriodIndicator().equals("PM")) ? (usclock.getHour() + 12) : usclock.getHour();
        } else if (clock instanceof BRLClock brlclock) {
            this.hour = brlclock.getHour();
        }

        return this;
    }
}
