package edu.matc;

/**
 * Created by Joe on 11/9/2016.
 * produces children to trick or treat
 */
public class ChildFactory extends Thread {

    private Children children;

    public ChildFactory(Children children) {
        this.children = children;
    }

    public void run() {
        while(children.getTotalChildren() <= 100) {
            //create a new child
            newChild();
            try {
                //sleep a random amount of time between 100 and 400 ms
                sleep((int) (Math.random() * 3 + 1) * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Factory was interrupted");
            }
        }

        System.out.println("Children go back to their homes");


    }

    //prints the child number in console
    synchronized public void ringDoorBell() {
        System.out.println("Child " + children.getTotalChildren() + " rings the doorbell");
    }

    //add a child if there are less than 10
    synchronized public void newChild() {
        synchronized(children) {
            //if there are 10 kids, don't make a new one
            if (children.getChildCount() < 10) {
                children.addChild();
                System.out.println("Child " + children.getTotalChildren() + " was created");
            }

            //if this is the only kid at the door, ring the door bell
            if (children.getChildCount() == 1) {
                ringDoorBell();
            }
        }
    }

}
