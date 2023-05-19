import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LogMainFile {
    private static final Logger logger = LoggerFactory.getLogger(LogMainFile.class);


    /**
     * @param args
     */
    public static void main(String[] args) {
        logger.trace("Log Tracer Testtt");
        String name = "Binam";
        logger.debug("Hi, {}", name);
        logger.info("Logger Info");
        logger.warn("Logger Warn.");
        logger.error("Logger Error");
    }
}