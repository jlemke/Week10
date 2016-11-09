package edu.matc.threaddemo;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created on 10/22/16.
 *
 * @author pwaite
 */
public class AnimateTest {
    private final Logger logger = Logger.getLogger(this.getClass());
    @Test
    public void testAnimate() throws Exception {
        logger.info("Just before creating Animate");
        Animate gui = new Animate();
        gui.go();
    }

}
