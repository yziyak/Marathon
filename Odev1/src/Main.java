public class Main {
    public static void main(String[] args) {
        String[][] students = {
                {"Deniz", "412"},
                {"İlker", "259"},
                {"Yusuf", "217"},
                {"Elif", "347"},
                {"Hazal", "398"},
                {"Bilge", "276"},
                {"Servet", "299"},
                {"Muhammet", "303"},
                {"Özge", "486"},
                {"Yasemin", "453"}
        };
        Marathon MyMarathon = new Marathon(students);

        MyMarathon.marathonRanking();
        MyMarathon.classification();
    }
}