package edu.matc;

/**
 * Created by Joe on 11/9/2016.
 */
public class Children {

    private int childCount;

    private int totalChildren;

    public Children() {
        childCount = 0;
        totalChildren = 0;
    }

    synchronized public void addChild() {
        childCount++;
        totalChildren++;
    }

    synchronized public void removeChild() {
        childCount--;
    }

    synchronized public int getChildCount() {
        return childCount;
    }

    synchronized public int getTotalChildren() {
        return totalChildren;
    }
}
