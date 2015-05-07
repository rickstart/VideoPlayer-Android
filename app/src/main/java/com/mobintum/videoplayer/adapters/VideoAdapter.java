package com.mobintum.videoplayer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobintum.videoplayer.R;
import com.mobintum.videoplayer.models.Video;

import java.util.ArrayList;

/**
 * Created by Rick on 06/05/15.
 */
public class VideoAdapter extends ArrayAdapter {



    ArrayList<Video> videos;
    Context context;

    public VideoAdapter(Context context, int resource, ArrayList<Video> videos) {
        super(context, resource, videos);
        this.videos = videos;
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
        Video video = videos.get(position);

        holder.textName.setText(video.getNameVideo());

        holder.imgPic.setImageDrawable(context.getResources().getDrawable(R.mipmap.ic_video));

        //convertView.setTag(holder);
        return rowView;
    }


    static class ViewHolder{
        TextView textName;

        ImageView imgPic;
    }
}
