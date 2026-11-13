public class Main {
    public static void main(String[] args) {
        String pizza = "Calzone";
        int grader = 400;
        System.out.println("Ugnen är " + grader + " grader");
        if (grader >= 400) {
            System.out.println("För varmt, " + pizza + " bränns");
        }
        else if (grader >= 250) {
            System.out.println("Redo att baka " + pizza);
        } else {
            System.out.println("Värm mer");
        }

    }
}
