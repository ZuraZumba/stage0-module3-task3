package lang.print.gaps.task3;
import java.util.logging.Logger;

public class BasicVariablesInitialization {
    private static final Logger logger = Logger.getLogger(BasicVariablesInitialization.class.getName());

    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;

        logger.info(String.valueOf(first));
        logger.info(String.valueOf(second));
        logger.info(String.valueOf(third));
    }
}

