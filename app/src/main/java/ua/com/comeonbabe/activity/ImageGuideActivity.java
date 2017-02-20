package ua.com.comeonbabe.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import ua.com.comeonbabe.R;
import ua.com.comeonbabe.model.Guide;

public class ImageGuideActivity extends AppCompatActivity {

    public static final String EXTRA_GUIDE_NUM = "guideNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_guide);

        int guideNo = (Integer) getIntent().getExtras().get(EXTRA_GUIDE_NUM);

        Guide guide = Guide.guide[guideNo];
        ImageView photo = (ImageView) findViewById(R.id.icon);
        photo.setImageResource(guide.getCartoonId());

    }
}
