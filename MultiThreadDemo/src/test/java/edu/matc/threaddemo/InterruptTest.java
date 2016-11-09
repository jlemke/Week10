package edu.matc.threaddemo;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created on 10/22/16.
 *
 * @author pwaite
 */
public class InterruptTest {
    private final Logger logger = Logger.getLogger(this.getClass());
    @Test
    public void testThread() throws Exception {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException x) {
        }

        logger.info("Interrupting the other thread");
        thread.interrupt();
    }

}