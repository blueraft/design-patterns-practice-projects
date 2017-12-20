package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Todo extends Doable {

    private String description;
    private List<Doable> doableList;

    public Todo(String description) {
        super();
        this.description = description;
        doableList = new ArrayList<>();
    }

    // getters
    public List<Doable> getSubTasks() { return doableList; }

    /**
     * Adds a given Doable to doableList
     * @param d the Doable object we wish to add
     * @return true if the Doable object is successfully added, else return false
     */
    public boolean addDoable(Doable d) {
        if (!doableList.contains(d)) {
            doableList.add(d);
            return true;
        } else {
            return false;

        }
    }

    /**
     * Removes given Doable from doableList
     * @param d the Doable object we wish to remove
     * @return true if the Doable object is successfully removed, else return false
     */
    public boolean removeDoable(Doable d) {
        if (doableList.contains(d)) {
            doableList.remove(d);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * This implementation differs from that of Task. All the doableList must be
     * complete for the top-level to be completed.
     */
    @Override
    public void complete() {
        boolean isAllDone = true;
        for (Doable d : doableList) {
            if (!d.getStatus()) {
                isAllDone = false;
            }
        }
        complete = isAllDone;
    }

    @Override
    public void display(String indentSpace) {
        System.out.println(indentSpace + getDescription());
        for (Doable d : doableList) {
            d.display(indentSpace + indentSpace);
        }
    }


}