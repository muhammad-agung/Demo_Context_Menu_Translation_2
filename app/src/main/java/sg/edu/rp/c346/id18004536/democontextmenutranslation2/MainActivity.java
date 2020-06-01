package sg.edu.rp.c346.id18004536.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTrnslatedText);

        registerForContextMenu(tvTranslatedText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0){//checkwhethertheselectedmenuitemIDis0
//codeforaction
            Toast.makeText(MainActivity.this,"English is chosen",Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Hello");
            return true;//menuitemsuccessfullyhandled
        }
        else if(item.getItemId()==1){//checkiftheselectedmenuitemIDis1
//codeforaction
            Toast.makeText(MainActivity.this,"Italian is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Ciao");
            return true;//menuitemsuccessfullyhandled
        }
        return super.onContextItemSelected(item);
    }



}
