package edu.matc;

/**
 * Created by Joe on 11/9/2016.
 */
public class HalloweenMain {

    //where we will actually test
    public static void main(String[] args) {

        Children children = new Children();

        //start
        System.out.println("Trick-Or-Treating begins");

        //create riley and children threads
        Riley riley = new Riley(children);
        riley.start();

        ChildFactory childFactory = new ChildFactory(children);
        childFactory.start();

    }
}
