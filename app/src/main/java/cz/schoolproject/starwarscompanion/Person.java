package cz.schoolproject.starwarscompanion;

/**
 * Created by Jarda on 7. 12. 2015.
 */
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class Person extends AppCompatActivity {
ViewPager viewPager;
    CustomSwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_personas);
        viewPager = (ViewPager)findViewById(R.id.star_wars);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

}