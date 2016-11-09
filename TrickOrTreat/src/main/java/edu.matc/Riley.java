package edu.matc;

/**
 * Created by Joe on 11/9/2016.
 *
 * gives candy to trick-or-treaters
 */
public class Riley extends Thread {

    private Children children;

    public Riley(Children children) {
        this.children = children;
    }


    public void run() {
        watchTV();
        boolean childrenAtDoor = false;
        while(children.getTotalChildren() <= 100) {

            synchronized(children) {
                if (children.getChildCount() > 0) {
                    childrenAtDoor = true;
                }
            }

            if (childrenAtDoor) {
                try {
                    System.out.println("Riley answers the door");
                    answeringDoor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            childrenAtDoor = false;
        }

        System.out.println("Riley turns off the house lights and goes to bed");
    }

    public void watchTV() {
        System.out.println("Riley watches TV");
    }

    public void answeringDoor() throws InterruptedException {
        //wait 3 seconds
        try {
            sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("riley interrupted");
        }
        giveCandy();
    }


    //takes 3 seconds to give out candy, keeps giving until there are no children left
    synchronized public void giveCandy() throws InterruptedException {
        children.removeChild();
        System.out.println("Riley gave candy to a child.");
        synchronized(children) {
            if (children.getChildCount() > 0)
                answeringDoor();
            else
                watchTV();
        }
    }

}
