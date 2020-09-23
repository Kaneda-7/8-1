public class DateMain {

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.year = 2009;
        d1.month = 10;
        d1.day = 17;
        Date d2 = new Date();
        d2.year = 2008;
        d2.month = 2;
        d2.day = 3;

        System.out.println(d1.getDaysInMonth());
        System.out.println(d2.getDaysInMonth());
    }
}

    public class Date {
        int year;
        int month;
        int day;


        public int getDaysInMonth() {
            if (month == 9 || month == 4 || month == 6 || month == 11) {
                return 30;
            } else if (month == 2) {
                if (isLeapYear()) {
                    return 29;
                } else {
                    return 28;
                }
            } else {
                return 31;
            }
        }

    public boolean isLeapYear() {
            return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public int getDaysInYear() {
        if (isLeapYear()) {
            return 366;
        }
        else {
            return 365;
        }
    }
}
