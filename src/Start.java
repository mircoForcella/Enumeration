public class Start {
    public static void main(String[] args) {
        enum Month{
            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER
        }
        for (Month month:  Month.values()) {
            if(month.name().toLowerCase().endsWith("Y")){
                System.out.println(month.toString() + " Ends with Y");
            } else System.out.println(month.toString() + " Doesn't end with Y");
        }
    }
}
