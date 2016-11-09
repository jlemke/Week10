package edu.matc.threaddemo;

import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 10/22/16.
 *
 * @author pwaite
 */
public class MyThreadTest {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Test
    public void run() throws Exception {
        logger.info("Just before creating a new thread");
        MyThread myThread = new MyThread();
        myThread.start();
    }

}