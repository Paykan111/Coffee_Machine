class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes != 59) minutes += 1;
        else {
            if (hours==12) {
                hours=1;
                minutes=0;
            } else {
                minutes = 0;
                hours += 1;
            }
        }
    }
}