public non-sealed class USClock extends Clock {
    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidDay() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidDay() {
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        setBeforeMidDay();
        if ((hour > 12) && (hour <= 23)) {
            setAfterMidDay();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            this.hour = 12;
        } else {
            this.hour = hour;
        }

    }

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        if (clock instanceof USClock usclock) {
            this.hour = usclock.getHour();
            this.periodIndicator = usclock.getPeriodIndicator();

        } else if (clock instanceof BRLClock brlclock) {
            this.setHour(brlclock.getHour());
        }

        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + periodIndicator;
    }
}