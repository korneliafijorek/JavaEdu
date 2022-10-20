public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "PG po zmianie";

    public void przedstawSie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie(){
        System.out.println("Loguję się za pomocą " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println("Mój numer indekstu to: " + numerIndeksu);
    }

    public void podajEmail(){
        System.out.println("Moj email to: " + email);
    }

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to " + nazwaUczelni);
        drugaMetoda();
    }
    public static void drugaMetoda(){
        System.out.println("Jestem drugą metodą");
    }
}
