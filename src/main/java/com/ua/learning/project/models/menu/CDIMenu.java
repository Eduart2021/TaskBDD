package com.ua.learning.project.models.menu;

import com.ua.learning.project.models.Page;

public class CDIMenu implements Page {
    @Override
    public void selectMenu() {
        System.out.println("CDI menu was selected");
    }
}
