package ua.com.comeonbabe.adaptor;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ua.com.comeonbabe.R;

/**
 * Created by Lisa on 2/9/2017.
 */

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] title, Integer[] imgid) {
        super(context, R.layout.list_recepi, title);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.title = title;
        this.imgid = imgid;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_recepi, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
        TextView extratxt = (TextView) rowView.findViewById(R.id.shortDescription);

        txtTitle.setText(title[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Description " + title[position]);
        return rowView;

    };

}
