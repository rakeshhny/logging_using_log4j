import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Info log from Main.java");
        logger.debug("debug log from Main.java");
    }
}
