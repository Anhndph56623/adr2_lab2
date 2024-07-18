package fpoly.acount.demofarment.demo1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import fpoly.acount.demofarment.R;

public class   demo43 extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo43);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        viewPager=findViewById(R.id.demo43ViewPager);
        tabLayout=findViewById(R.id.demo43Tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
    public void addTabLayout(ViewPager2 viewPage2){
        Demo43Adapter adapter=new Demo43Adapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"tab1");
        adapter.addFragment(new Fragment2(),"tab2");
        adapter.addFragment(new Fragment3(),"tab3");
        viewPager.setAdapter(adapter);
    }
}