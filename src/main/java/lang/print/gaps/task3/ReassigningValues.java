package lang.print.gaps.task3;
import java.util.logging.Logger;

public class ReassigningValues {
    private static final Logger logger = Logger.getLogger(ReassigningValues.class.getName());

    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        logger.info(String.valueOf(first));
        logger.info(String.valueOf(second));
        logger.info(String.valueOf(third));
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        first = 15;
        second = 6;
        third = 4;
        logger.info(String.valueOf(first));
        logger.info(String.valueOf(second));
        logger.info(String.valueOf(third));
        logger.info(String.valueOf(linkToFirst));
        logger.info(String.valueOf(linkToSecond));
        logger.info(String.valueOf(linkToThird));
    }
}
