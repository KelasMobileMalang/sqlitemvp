package com.penguin.padang.pasir.sqlitesharedpreferences.views.interfaces;

import java.util.ArrayList;

/**
 * Created by jowy on 6/2/16.
 */
public interface ListViewActivityInterface {

    void errorData(String exception);

    String[] getNamePerson();

    ArrayList<String> getListPerson();

    void setListPerson();
}
