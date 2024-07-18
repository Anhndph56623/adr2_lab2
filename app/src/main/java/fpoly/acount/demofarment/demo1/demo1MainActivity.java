package fpoly.acount.demofarment.demo1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import fpoly.acount.demofarment.R;

public class demo1MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo1_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn = findViewById(R.id.demo1btn1);
        txt = findViewById(R.id.demo1txt1);
        btn.setOnClickListener(v -> {
            FragmentManager fragmentManager=getSupportFragmentManager();
            Fragment1 blackFragment=(Fragment1) fragmentManager
                    .findFragmentById(R.id.fr41);
            blackFragment.txt1.setText(txt.getText().toString());

        });
    }
}