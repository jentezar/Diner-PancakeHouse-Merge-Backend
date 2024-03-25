package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DinerRepository {

    public MenuItem[] getTheMenu() {
        DinerMenu dinerMenu = new DinerMenu();
        return dinerMenu.getMenuItems();
    }

    public List<MenuItem> getMenuArrList() {
        MenuItem[] menuItems = getTheMenu();
        List<MenuItem> menuList = new ArrayList<>();

        for (MenuItem menuItem : menuItems) {
            menuList.add(menuItem);
        }

        return menuList;
    }
}
