public class Methoden {
    public static String hours(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;
        String Str_seconds = (seconds > 9) ? Integer.toString(seconds) : "0" + seconds;
        String Str_minutes = (minutes > 9) ? Integer.toString(minutes) : "0" + minutes;
        return hours + ":" + Str_minutes + ":" + Str_seconds;
    }

    public static double distance(int[] a, int[] b){
        return Math.sqrt(Math.pow(b[1] - a[1], 2) + Math.pow(b[0] - a[0], 2));
    }
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe (a)
        System.out.println("Aufgabe a)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        System.out.println(hours(475));
        System.out.println(hours(324321));
        System.out.println(hours(231));
        System.out.println(hours(34553));

        // Test-Code für Teilaufgabe (b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = {10, 0};

        System.out.println(distance(a, b));
        System.out.println(distance(a, c));
        System.out.println(distance(b, c));
        // System.out.println(distance({0, 0}, {1, 1}));
    }
    
}
