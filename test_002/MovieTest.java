public class MovieTest{

    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потеряные в офсе";
        two.genre = "Трагедия";
        two.rating = 1;
        two.playIt();

        Movie three = new Movie();
        three.title = "Байт-клуб";
        three.genre = "Комедия";
        three.rating = 2;

    }

}
