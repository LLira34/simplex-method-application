package models;

/**
 *
 * @author LLira
 */
public class Link {

    private Object[] points = null;
    private int[] objectiveFunction = null;

    public Link() {
    }

    public Object[] getPoints() {
        return points;
    }

    public void setPoints(Object[] points) {
        this.points = points;
    }

    public int[] getObjectiveFunction() {
        return objectiveFunction;
    }

    public void setObjectiveFunction(int[] objectiveFunction) {
        this.objectiveFunction = objectiveFunction;
    }

}//End class
