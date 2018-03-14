package br.com.barbosa.rodrigo.makescene;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imv = (ImageView)findViewById(R.id.simple_activity_a_imageView);

        imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animateIntent();
            }
        });



    }

    public void animateIntent() {

        Intent intent = new Intent(this, Main2Activity.class);
        //intent.putExtra(Main2Activity.EXTRA_PARAM_ID, "id");

        ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,

                new Pair<View, String>(imv,
                        Main2Activity.VIEW_NAME_HEADER_IMAGE));

        // Now we can start the Activity, providing the activity options as a bundle
        ActivityCompat.startActivity(this, intent, activityOptions.toBundle());

    }
}
