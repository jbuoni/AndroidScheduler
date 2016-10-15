package edu.gatech.seclass.glm.Controller;

import android.content.Context;

import java.util.List;

import edu.gatech.seclass.glm.Model.GroceryList;
import edu.gatech.seclass.glm.Model.ListItem;
import edu.gatech.seclass.glm.DAO.DAO;

/**
 * Created by jbuoni on 10/11/16.
 */

public class ListMgmtController {

    private GroceryList currentList;
    private DAO dao;

    public ListMgmtController(Context context){
        dao = new DAO(context);
    }

    public void updateCurrentList(int listId){
        currentList = dao.loadList(listId);
    }

    public List<ListItem> getCurrentListItems(){
        //Make sure it is the most up to date version
        currentList = dao.loadList(currentList.getId());
        return currentList.getAllListItems();
    }

    public GroceryList getCurrentList(){
        return currentList;
    }

    public void uncheckAllListItems(){
        currentList.uncheckAllListItems();
        for (ListItem item: currentList.getAllListItems()) {
            dao.toggleListItemIsChecked(item.getId(), false);
        }
        currentList = dao.loadList(currentList.getId());
    }

    public void addListItem(ListItem item){
        dao.addItemToList(currentList.getId(), item.getId(), item.getQuantity());
        currentList = dao.loadList(currentList.getId());
    }

    public void removeListItem(ListItem item){
        dao.deleteItemFromList(item.getId());
        currentList = dao.loadList(currentList.getId());
    }

    public void updateItem(ListItem item) {
        for (ListItem i: currentList.getAllListItems()) {
            if(i.getId() == item.getId()){
                dao.deleteItemFromList(item.getId());
                dao.addItemToList(currentList.getId(), item.getId(), item.getQuantity());
            }
        }

        currentList = dao.loadList(currentList.getId());
    }
}
