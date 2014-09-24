package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// this is the git hub testing modification
@RunWith(Suite.class)
@SuiteClasses({FacebookTest.class, GmailTest.class, YahooTest.class})
public class AllTests {

}
