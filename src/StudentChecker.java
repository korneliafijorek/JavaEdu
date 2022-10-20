public class StudentChecker {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.imie = "Patryk";
        student1.nazwisko = "Kowalski";
        student1.email = "patrykk@gmail.com";
        student1.nick = "patrykk";
        student1.numerIndeksu = 12345;

        Student student2 = new Student();
        student2.imie = "Adam";
        student2.nazwisko = "Nowak";
        student2.email = "adamn@gmail.com";
        student2.nick = "adamn";
        student2.numerIndeksu = 67890;

        Student student3 = new Student();
        student3.imie = "Ewa";
        student3.nazwisko = "Mróz";
        student3.email = "ewam@gmail.com";
        student3.nick = "ewam";
        student3.numerIndeksu = 24683;

        Student[] studenci = new Student[3];

        studenci[0] = student1;
        studenci[1] = student2;
        studenci[2] = student3;


        for (int i =0; i<studenci.length; i++){
            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
            studenci[i].podajNrIndeksu();
            studenci[i].podajEmail();
            System.out.println();
        }



    }
}
