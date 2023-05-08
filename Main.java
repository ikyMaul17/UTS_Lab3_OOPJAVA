package No1;

public class Main {
    public static void main(String[] args) {
//        Objek
        Film film1 = new Film("My Sassy Girl ", "Kwak Jae-yong ", 2001, 9.5);
        Film film2 = new Film("Memories of Murder", "Bong Joon-ho", 2003, 9.0);

        System.out.println("Film Drama Korea 1");
        film1.Movie();
        System.out.println("-----------------------------------------------");
        System.out.println("Film Drama Korea 2");
        film2.Movie();
        System.out.println("-----------------------------------------------");

//        Contoh Melakukan Set And Get satu per satu
        film1.setJudul("---------A Moment to Remember---------");
        System.out.println("Judul Film  : "+ film1.getJudul());
        film1.setSutradara("Oldboy");

        System.out.println("Sutradara   : "+film1.getSutradara());
        film1.setTahun(2023);

        System.out.println("Tahun Rilis : "+film1.getTahun());
        film1.setRating(9.0);

        System.out.println("Rating      : "+film1.getRating());
    }
}
