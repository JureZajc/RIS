package si.fri.emp.ris_naloga;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private EditText editTxt;
    private EditText editText2;
    private Button btn;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    private String izposojevalec;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        editTxt = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);
        listView = (ListView) findViewById(R.id.listView);
        editText2 = (EditText) findViewById(R.id.editText2);
        izposojevalec = "Test";




        arrayList = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);
        listView.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.add("Book name: " + editTxt.getText().toString()  +" quantity: "+ editText2.getText().toString() + " issued by: " + izposojevalec);
                adapter.notifyDataSetChanged();
                editTxt.setText("");
                editText2.setText("");
              //  editTxt.setText(getGradivoArrayList().toString());

            }
        });




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
        if (id == R.id.action_racun){
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
