package io.chgocn.demo.algorithm.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

import io.chgocn.demo.algorithm.R;
import io.chgocn.demo.algorithm.utils.DateTimeHelper;

public class MainActivity extends AppCompatActivity {

    public static String TAG = MainActivity.class.getSimpleName();

    private TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time = (TextView) findViewById(R.id.time);
        String timeStr = DateTimeHelper.timeFormat(0,2,1);
        time.setText(Html.fromHtml(timeStr));
    }
}
