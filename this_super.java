class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        this();
        System.out.println("in int A");
    }
}

class B extends A {
    public B() {
        super(0);
        System.out.println("in B");
    }

    public B(int a) {

        this();

        System.out.println("in int B");
    }
}

public class this_super {
    public static void main(String[] args) {
        B b = new B(5);
    }

}
