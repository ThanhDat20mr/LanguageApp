package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sinhvien.myrex.R;

import java.util.List;

import Sen.Greeting;

public class AdapterSen extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Greeting> listGreeting;

    public AdapterSen(Context context, int layout, List<Greeting> listGreeting) {
        this.context = context;
        this.layout = layout;
        this.listGreeting = listGreeting;
    }

    @Override
    public int getCount() {
        return listGreeting.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);

        Greeting greetingSen = listGreeting.get(position);
        TextView txtEn = convertView.findViewById(R.id.txtEn);
        TextView txtVn = convertView.findViewById(R.id.txtVn);

        txtEn.setText(greetingSen.getEn());
        txtVn.setText(greetingSen.getVn());
        return convertView;
    }
}
