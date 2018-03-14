package br.com.barbosa.rodrigo.makescene;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static final String VIEW_NAME_HEADER_IMAGE = "bla";


    ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        imv = (ImageView) findViewById(R.id.newImaage);
        imv.setImageResource(R.mipmap.ic_launcher);



        ViewCompat.setTransitionName(imv, VIEW_NAME_HEADER_IMAGE);

    }
}
