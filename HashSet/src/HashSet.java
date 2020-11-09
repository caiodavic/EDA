import java.util.Arrays;

public class HashSet {

    Integer[] set;
    int elems;

    public HashSet(int size){
        set = new Integer[size];
        elems = 0;

        for(int i =0; i < size; i++){
            set[i] = null;
        }

    }

    public boolean contains(Integer elem) {
        boolean contains = false;
        if(elem == null) return false;
        for (int i = 0; i < set.length; i++) {
            if (set[i] == elem) contains = true;

        }
        return contains;
    }

    public Integer[] put(int elem){
        if(isFull()) return set;
        if(contains(elem)) return set;

        int prob = 0;
        int hashCode = hash(elem,prob);
        while(set[hashCode] != null){
            hashCode = hash(elem,++prob);
        }
        set[hashCode] = elem;
        elems++;
        return set;
    }

    public Integer[] remove(Integer elem){
        if(isEmpty()) return set;
        if(!contains(elem)) return set;

        int prob = 0;
        int hashCode = hash(elem,prob);
        while(set[hashCode] != elem){
            hashCode = hash(elem,++prob);
        }
        set[hashCode] = null;
        elems--;
        return set;

    }

    public String toString(){
        return Arrays.toString(set);
    }

    private int hash(int key, int prob){
        return ((key % set.length)+prob);

    }

    private boolean isFull(){
        return elems == set.length;
    }

    private boolean isEmpty(){
        return elems == 0;
    }

}
