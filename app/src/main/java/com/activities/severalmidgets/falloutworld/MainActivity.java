package com.activities.severalmidgets.falloutworld;

<<<<<<< HEAD
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    ImageView imgFavorite;
    ImageView compButton;
    Bitmap favImg;
    TextView compNum;

=======
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

>>>>>>> 233836f9990939a56d6ba85f52d65bd43d964622
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        imgFavorite = (ImageView) findViewById(R.id.imageView1);
        compButton = (ImageView) findViewById(R.id.compButton);
        compNum = (TextView) findViewById(R.id.compNum);
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });
        compButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tmp = compare(imgFavorite.getDrawingCache(), compButton.getDrawingCache());
                String comp = new String();
                comp = Integer.toString(tmp);
                compNum.setText(comp.toCharArray(), 0, comp.length());
            }
        });

    }

    private int compare(Bitmap img_a, Bitmap img_b) {
        Random rand = new Random();
        return rand.nextInt();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bp = (Bitmap) data.getExtras().get("data");
        compButton.setImageBitmap(favImg);
        imgFavorite.setImageBitmap(bp);
        favImg = bp;
    }
=======
    }

>>>>>>> 233836f9990939a56d6ba85f52d65bd43d964622

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
<<<<<<< HEAD
=======

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
>>>>>>> 233836f9990939a56d6ba85f52d65bd43d964622
}
