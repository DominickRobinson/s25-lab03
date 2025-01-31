package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    
    private SortedIntList list;
    private int totalAdded;

    public DelegationSortedIntList() {
        this.list = new SortedIntList();
        this.totalAdded = 0;
    }

    public boolean add(int num) {
        boolean added = list.add(num);

        if (added) {
            this.totalAdded++;
        }

        return added;
    }

    public boolean addAll(IntegerList nums) {
        int previous_size = list.size();
        boolean added = list.addAll(nums);

        if (added) {
            int new_size = list.size();
            this.totalAdded += (new_size - previous_size);
        }

        return added;
    }

    public int get(int index) {
        return list.get(index);
    }

    public boolean remove(int num) {
        return list.remove(num);
    }

    public boolean removeAll(IntegerList nums) {
        return list.removeAll(nums);
    }

    public int size() {
        return list.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }

}