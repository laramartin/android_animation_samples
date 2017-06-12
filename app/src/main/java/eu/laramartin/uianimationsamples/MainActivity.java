package eu.laramartin.uianimationsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eu.laramartin.uianimationsamples.slide.SlideUpFirstActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button slideUpButton = (Button) findViewById(R.id.bt_slide_up_trans);
        slideUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SlideUpFirstActivity.class);
                startActivity(intent);
            }
        });
    }
}
