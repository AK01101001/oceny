package dev.end.oceny;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterRegions extends ArrayAdapter<Obszar> {
    private Context context;
    private List<Obszar> obszary;
    public AdapterRegions(@NonNull Context context, List<Obszar> obszary) {
        super(context,0,obszary);
        this.context = context;
        this.obszary = obszary;

    }

    @NonNull
    @Override
    public View getView(int index, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.list_item, parent, false);
        }
        Obszar obszar = obszary.get(index);
        ImageView img = convertView.findViewById(R.id.img);

        TextView name = convertView.findViewById(R.id.name);
        TextView urbanized = convertView.findViewById(R.id.urbanized);
        TextView tdAmmount = convertView.findViewById(R.id.tdAmmount);
        TextView faction = convertView.findViewById(R.id.faction);
        img.setImageResource(obszar.getImage());
        name.setText(obszar.getName());
        urbanized.setText(obszar.isUrbanized());
        tdAmmount.setText(obszar.getTDAmmount());
        faction.setText(obszar.getOwnership());
        switch ()
        return convertView;
    }
}
