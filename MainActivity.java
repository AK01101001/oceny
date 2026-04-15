package dev.end.oceny;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import dev.end.oceny.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<Obszar> obszary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        obszary = new ArrayList<>();
        obszary.add(new Obszar("raguna",R.drawable.raguna,true,0, Obszar.Faction.OrderOfTheDeep));
        obszary.add(new Obszar("eidoscope",R.drawable.eidoscope,false,0, Obszar.Faction.BlackShores));
        obszary.add(new Obszar("rearguardbase",R.drawable.rearguardbase,true,0, Obszar.Faction.Huanglong));
        obszary.add(new Obszar("tethyshub",R.drawable.tethyshub,true,0, Obszar.Faction.BlackShores));
        obszary.add(new Obszar("fabricatoriumStoreModule",R.drawable.fabricatoriumstoremodule,false,0, Obszar.Faction.Fractsidus));

        AdapterRegions adapterRegions = new AdapterRegions(this,obszary);
        binding.lista.setAdapter(adapterRegions);
    }
}