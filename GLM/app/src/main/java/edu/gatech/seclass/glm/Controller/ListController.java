package edu.gatech.seclass.glm.Controller;

import android.content.Context;

import java.util.List;

import edu.gatech.seclass.glm.DAO.DAOI;
import edu.gatech.seclass.glm.DAO.DAO;
import edu.gatech.seclass.glm.Model.GroceryList;

/**
 * ListMgmtController handles all communication between the current grocery list, and the UI
 * and database.
 *
 * Created by jbuoni on 10/12/16.
 */

public class ListController {

    private DAOI dao;

    public ListController(Context context) {
        dao = new DAO(context);
    }

    public void createList(String name) {
        dao.createList(name);
    }

    public List<GroceryList> getAllLists() {
        return dao.getAllLists();
    }

    public void deleteList (Integer id) {dao.deleteList(id);}

    public void updateListName(GroceryList groceryList, String name) {
        dao.updateListName(groceryList, name);
    }


}
