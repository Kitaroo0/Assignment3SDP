public class Main {
    public static void main(String[] args) {

        Englishman englishman = new EnglishmanImpl("Sam");
        Russianman russianman = new RussianmanImpl("Ivan");

        RussianTV russianTV = new RussianTV(russianman);
        EnglishTV englishTV = new EnglishTV(englishman);

        System.out.println("RussianTV:");
        russianTV.operate();

        System.out.println("\nEnglishTV:");
        englishTV.operate();

        Russianman adapter = new TVAdapter(englishman);
        RussianTV russianController2 = new RussianTV(adapter);

        System.out.println("\nRussianTV with adapter:");
        russianController2.operate();
    }
}