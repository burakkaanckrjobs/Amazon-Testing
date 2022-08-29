import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {

    Log log = new Log();
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        String TestName = context.getDisplayName();
        String TestReason = reason.get();
        log.info(TestName +" Disabled with reason "+TestReason);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        String TestName = context.getDisplayName();
        log.info(TestName+ "PASSED");

    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {

        String TestName = context.getDisplayName();
        String TestFailCause = cause.getMessage();
        log.info(TestName+ "FAILED with cause"+TestFailCause);
    }
}
