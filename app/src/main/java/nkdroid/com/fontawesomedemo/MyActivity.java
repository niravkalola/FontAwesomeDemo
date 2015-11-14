package nkdroid.com.fontawesomedemo;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MyActivity extends Activity {

    TextView txtOne,txtTwo,txtThree,txtFour,txtFive,txtSix,txtSeven,txtEight;
    Typeface font;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //initialize
        setContentView(R.layout.activity_my);
        txtOne=(TextView)findViewById(R.id.one);
        txtTwo=(TextView)findViewById(R.id.two);
        txtThree=(TextView)findViewById(R.id.three);
        txtFour=(TextView)findViewById(R.id.four);
        txtFive=(TextView)findViewById(R.id.five);
        txtSix=(TextView)findViewById(R.id.six);
        txtSeven=(TextView)findViewById(R.id.seven);
        txtEight=(TextView)findViewById(R.id.eight);
        font = Typeface.createFromAsset(getAssets(), "fontawesome.ttf");

        // set font awesome typeface to all TextView
        txtOne.setTypeface(font);
        txtTwo.setTypeface(font);
        txtThree.setTypeface(font);
        txtFour.setTypeface(font);
        txtFive.setTypeface(font);
        txtSix.setTypeface(font);
        txtSeven.setTypeface(font);
        txtEight.setTypeface(font);

        // set font awesome code value to all TextView
        txtOne.setText(getResources().getText(R.string.icon_android));
        txtTwo.setText(getResources().getText(R.string.icon_birthday));
        txtThree.setText(getResources().getText(R.string.icon_camera));
        txtFour.setText(getResources().getText(R.string.icon_chat));
        txtFive.setText(getResources().getText(R.string.icon_facebook));
        txtSix.setText(getResources().getText(R.string.icon_gift));
        txtSeven.setText(getResources().getText(R.string.icon_github));
        txtEight.setText(getResources().getText(R.string.icon_youtube));

    }



}
