package com.ua.learning.project.models.menu;

import com.ua.learning.project.models.Page;

public class AbcMenu implements Page {
    @Override
    public void selectMenu() {
        System.out.println("ABC menu was selected");
    }
}
