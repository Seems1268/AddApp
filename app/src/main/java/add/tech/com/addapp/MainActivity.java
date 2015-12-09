package add.tech.com.addapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private EditText num1_txt;
    private EditText num2_txt;
    private Button cal_btn;
    private TextView result_txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI(){
        num1_txt = (EditText) findViewById(R.id.num1_edittxt);
        num2_txt = (EditText) findViewById(R.id.num2_edittxt);

        cal_btn = (Button) findViewById(R.id.cal_btn);
        result_txtview = (TextView) findViewById(R.id.result_txtview);

        cal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calAndDisplay();
            }
        });
    }

    private void calAndDisplay(){

        int result = Integer.parseInt(num1_txt.getText().toString()) + Integer.parseInt(num2_txt.getText().toString());

        result_txtview.setText(String.valueOf(result));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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
}
