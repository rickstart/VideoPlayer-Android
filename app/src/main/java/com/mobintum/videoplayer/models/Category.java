package com.mobintum.videoplayer.models;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.mobintum.videoplayer.R;

import java.util.ArrayList;

/**
 * Created by Rick on 27/04/15.
 */
public class Category {


    private String nameCategory;
    private Drawable icon;


    public Category(String nameCategory, Drawable icon) {
        this.nameCategory = nameCategory;
        this.icon = icon;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }


    public ArrayList<Category> getCategories(Context context){
        ArrayList<Category> categories = new ArrayList<Category>();

        categories.add(new Category("Banda", context.getResources().getDrawable(R.mipmap.ic_banda)));
        categories.add(new Category("Electronic", context.getResources().getDrawable(R.mipmap.ic_electronic)));
        categories.add(new Category("Pop", context.getResources().getDrawable(R.mipmap.ic_pop)));
        categories.add(new Category("Salsa", context.getResources().getDrawable(R.mipmap.ic_pop)));

        return categories;
    }
}
