import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList<T> {
    private final List<T> newList; //10elements


    public RecentlyUsedList(T objects) {
        newList = new ArrayList<T>();

        newList.add(objects);
    }

    public List<T> getList() {
        return newList;
    }

    public void add(T object){
        if(newList.size() >= 10 && checkIfInTheList(object)){
            newList.remove(9);
            newList.add(1, object);
        }else newList.add(1, object);
    }

    private boolean checkIfInTheList(T object){
        for (T element:
                newList) {
            if(object.equals(element)){return false;}
        }
        return true;
    }
}
