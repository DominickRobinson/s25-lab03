package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation

    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        this.totalAdded = 0;
    }

    @Override
    public boolean add(int num) {
        boolean added = super.add(num);

        if (added) {
            this.totalAdded += 1;
        }
        return added;
    }

    @Override
    public boolean addAll(IntegerList nums) {
        return super.addAll(nums);
    }

    public int getTotalAdded() {
        return this.totalAdded;
    }

}