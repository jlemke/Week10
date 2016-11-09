package edu.matc.threaddemo;

import org.apache.log4j.Logger;

/**
 * A class to demonstrate using the Runnable interface
 * @author paulawaite
 * @version 1.0 10/31/15.
 */
public class MyRunnable implements Runnable {
    private final Logger logger = Logger.getLogger(this.getClass());

    public void run() {
        logger.info("In edu.matc.threaddemo.MyRunnable");

        /*for (int i = 0; i < 100 ; i++) {
            try {
                Thread.sleep(100);
                logger.info("MyRunnable count: " + i);
            } catch (InterruptedException e) {
                logger.info("Time to stop!");
                return;
            }

        }*/
    }
}
