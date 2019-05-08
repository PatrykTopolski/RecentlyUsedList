import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList<T> {
    private List<T> newList; //10elements


    public RecentlyUsedList(T[] objects) {
        newList = new ArrayList<T>();
        T[] newObjectsHolder;
        newObjectsHolder = objects;
        for (T element:
             newObjectsHolder) {
            newList.add(element);
        }
    }

    public List<T> getNewList() {
        return newList;
    }

    public void add(T object){
        if(newList.size() >= 10 && checkIfInTheList(object)){
            newList.remove(1);
            newList.add(1, object);
        }else newList.add(1, object);
    }

    private boolean checkIfInTheList(T object){
        for (T element:
                newList) {
            if(object.equals(element)){return false}
        }
        return true;
    }
}
