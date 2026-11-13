public class Main {
    public static void main(String[] args) {
        String pizza = "Calzone";
        int grader = 20;
        grader = grader + 250;
        System.out.println("Ugnen är " + grader + " grader");
        if (grader >= 250) {
            System.out.println("Redo att baka " + pizza);
        } else {
            System.out.println("Värm mer");
        }

    }
}
