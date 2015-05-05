package com.mobintum.videoplayer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobintum.videoplayer.R;
import com.mobintum.videoplayer.models.Artist;

import java.util.ArrayList;

/**
 * Created by Rick on 04/05/15.
 */
public class ArtistAdapter extends ArrayAdapter {


    ArrayList<Artist> artists;
    Context context;

    public ArtistAdapter(Context context, int resource, ArrayList<Artist> artists) {
        super(context, resource, artists);
        this.artists = artists;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_list_icon, parent, false);
        ViewHolder holder = new ViewHolder();

        holder.textName = (TextView) rowView.findViewById(R.id.textName);

        holder.imgPic = (ImageView) rowView.findViewById(R.id.ImgIcon);
        Artist artist = artists.get(position);

        holder.textName.setText(artist.getNameArtist());

        holder.imgPic.setImageDrawable(artist.getPicture());

        //convertView.setTag(holder);
        return rowView;
    }


    static class ViewHolder{
        TextView textName;

        ImageView imgPic;
    }
}
