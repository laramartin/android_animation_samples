package eu.laramartin.uianimationsamples.slide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import butterknife.BindView;
import butterknife.ButterKnife;
import eu.laramartin.uianimationsamples.R;

public class SlideUpFirstActivity extends AppCompatActivity {

    @BindView(R.id.slide_up_first_grid)
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_up_first);

        ButterKnife.bind(this);
    }
}
