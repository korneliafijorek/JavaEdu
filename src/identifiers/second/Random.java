package identifiers.second;

import identifiers.first.Parent;

//klasa w innej paczce nie dostępu do pól/metod private, protected i default

public class Random {
    public void testIdentifier(){
        Parent parent = new Parent();

        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethod();
        //parent.secondMethod();
        //parent.thirdMethod();
        //parent.fourthMethod();

    }
}
