package fpoly.acount.demofarment.demo1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fpoly.acount.demofarment.R;

public class Fragment1 extends Fragment {
    Button btn1;
    EditText txt1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        btn1 = view.findViewById(R.id.btn1);
        txt1 = view.findViewById(R.id.fra1txt1);
        btn1.setOnClickListener(v -> {
            Toast.makeText(getContext(), txt1.getText(), Toast.LENGTH_SHORT).show();
        });
        return view;
    }
}