public class TestClass {
    @AutoInjectable
    private Our_Interface Our_Interface;

    public String doSomething ( ) {
        return Our_Interface.doSomething ( );
    }
}
