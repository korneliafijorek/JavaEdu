public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "university");
        teacher.walk();
        teacher.eat();
        //teacher.teachMath();
        //teacher.sayHell();

        Footballer footballer = new Footballer("Mike", 21, "KS Tęcza");
        footballer.walk();
        footballer.eat();
        //footballer.playFootball();

    }
}
