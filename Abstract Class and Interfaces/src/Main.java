abstract class AbstractClass {
    abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
    void abstractMethod() {

        System.out.println("ConcreteClass.abstractMethod");
    }
}

interface Interface {
    void interfaceMethod();
}

class ConcreteClass2 implements Interface {
    public void interfaceMethod() {
        System.out.println("ConcreteClass2.interfaceMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.abstractMethod();

        ConcreteClass2 concreteClass2 = new ConcreteClass2();
        concreteClass2.interfaceMethod();
    }
}