package com.mobintum.videoplayer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobintum.videoplayer.R;
import com.mobintum.videoplayer.models.Category;

import java.util.ArrayList;

/**
 * Created by Rick on 04/05/15.
 */
public class CategoryAdapter extends ArrayAdapter {
    ArrayList<Category> categories;
    Context context;

    public CategoryAdapter(Context context, int resource, ArrayList<Category> categories) {
        super(context, resource, categories);
        this.categories = categories;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_category_list, parent, false);
        ViewHolder holder = new ViewHolder();

        holder.textName = (TextView) rowView.findViewById(R.id.textNameCategory);

        holder.imgPic = (ImageView) rowView.findViewById(R.id.ImgIconCategory);
        Category category = categories.get(position);

        holder.textName.setText(category.getNameCategory());

        holder.imgPic.setImageDrawable(category.getIcon());

        //convertView.setTag(holder);
        return rowView;
    }


    static class ViewHolder{
        TextView textName;

        ImageView imgPic;
    }
}
