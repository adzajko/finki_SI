import jdk.internal.jline.internal.TestAccessible;

import java.util.ArrayList;
import java.util.List;

public class MyTests {

    private static final User Antonij = new User("Antonij", "12345", "antonij@gmail.com");
    private static final User Bile = new User("Bile", "1234567@#", "bile@gmail.com");
    private static final User Finch = new User("Finch", "12345", "finch_adrej@gmail.com");
    private static final List<String> ALLUSERS = new ArrayList<String>() {{
        antonij();
        bile();
        finch();
    }};

    public static User antonij() { return Antonij; }
    public static User bile() { return Bile; }
    public static User finch() { return Finch; }

    @TestAccessible
    public void testLab2() {
        SILab2 tester = new SILab2();
        // assert statements
        tester.function(Antonij, ALLUSERS);
        tester.function(Bile, ALLUSERS);
        tester.function(Finch, ALLUSERS);
    }
}
