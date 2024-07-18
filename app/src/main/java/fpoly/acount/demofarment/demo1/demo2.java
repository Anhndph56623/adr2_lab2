package fpoly.acount.demofarment.demo1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import fpoly.acount.demofarment.R;

public class demo2 extends AppCompatActivity {
    Button btnAn,btnHien;
    Fragment1 frg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnAn = findViewById(R.id.btnAn);
        btnHien = findViewById(R.id.btnHien);
        btnAn.setOnClickListener(v -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            frg=(Fragment1) fragmentManager.findFragmentById(R.id.frademo2);
            fragmentManager.beginTransaction()
                    .hide(frg).commit();

        });
        btnHien.setOnClickListener(v -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            frg=(Fragment1) fragmentManager.findFragmentById(R.id.frademo2);
            fragmentManager.beginTransaction()
                    .show(frg).commit();
        });

    }
}