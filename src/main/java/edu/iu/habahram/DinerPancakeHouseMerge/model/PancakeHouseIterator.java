package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseIterator implements Iterator{
    List<MenuItem> items;
    int position = 0;

    public interface Iterator{
        boolean hasNext();
        Object next();
    }

    public PancakeHouseIterator(List<MenuItem> items){
        this.items = items;
    }

    public MenuItem next(){
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext(){
        if(position >= items.size() || items.get(position)== null){
            return false;
        }else{
            return true;
        }
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least something");
        } else {
            items.remove(position - 1);
            position--;
        }
    }
}
