package com.example.explorechina;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private List<Attraction> attractions;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, List<Attraction> attractions) {
        this.context = context;
        this.attractions = attractions;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return attractions.size();
    }

    @Override
    public Object getItem(int position) {
        return attractions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return attractions.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.attraction_item, parent, false);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.attraction_image);
            holder.titleView = convertView.findViewById(R.id.attraction_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Attraction attraction = attractions.get(position);
        try {
            holder.imageView.setImageDrawable(ContextCompat.getDrawable(context, attraction.getImageResId()));
        } catch (Exception e) {
            holder.imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_launcher_foreground));
        }
        holder.titleView.setText(attraction.getTitle());

        return convertView;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView titleView;
    }
}
