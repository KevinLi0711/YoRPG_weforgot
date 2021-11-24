public class Test {
    private static Monster smaug;
    private static Protagonist pat;
    public static void main(String[] args) {
        smaug = new Monster();
        smaug.printStats();

        pat = new Protagonist("pat");
        pat.specialize();
        pat.printStats();

        smaug = new Monster1();
        smaug.printStats();
    }
}
