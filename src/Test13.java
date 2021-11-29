class SuperClass {
    public void call() {
        System.out.println("superClass");
    }

    public void callParent() {
        super.hashCode();
    }
}

class SubClass extends SuperClass {
    @Override
    public void call() {
        System.out.println("subClass");
    }

    @Override
    public void callParent() {
        super.call();
    }
}

public class Test13 {
    public static void main(String[] args) {
        SuperClass sub = new SuperClass();
        sub.call();
        sub.callParent();

        SuperClass sup = new SubClass();
        sup.call();
        sup.callParent();
    }
}

// superClass subClass superClass +-