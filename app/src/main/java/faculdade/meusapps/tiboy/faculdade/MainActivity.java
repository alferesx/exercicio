package faculdade.meusapps.tiboy.faculdade;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fruts = {"banana","apple","strawberry","bluebarry","orange","kiwi"};
        ListAdapter adapter = new CustomAdapter(this,fruts);
        ListView lista  = (ListView) findViewById(R.id.listafrutas);
        lista.setAdapter(adapter);



        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String frut = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,frut,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
