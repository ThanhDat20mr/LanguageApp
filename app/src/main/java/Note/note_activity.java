package Note;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.sinhvien.myrex.Database;
import com.sinhvien.myrex.R;

import java.util.ArrayList;

import Adapter.note_adapter;

public class note_activity extends AppCompatActivity {


    Button btnThem, btnList, btnDel;
    ListView lvTu;
    ArrayList<note_tu> tuArrayList;
    note_adapter adapter;
    public static Database database;
    private Database db;
    ImageView imgHinh;
    int REQUEST_CODE_CAMERA = 123;
    int REQUEST_CODE_FOLDER = 456;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        btnThem = (Button) findViewById(R.id.btnThem);
        btnList = (Button) findViewById(R.id.btnList);
        btnDel = (Button) findViewById(R.id.btnDel);
        db = new Database(this);
        btnThem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(note_activity.this, note_themtu_activity.class));
            }
        });

        btnList.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(note_activity.this,note_list.class));
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.delTu();
                Toast.makeText(note_activity.this, "Cleaned :3", Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(note_activity.this,note_activity.class);
//                startActivity(i);
            }
        });

    }
}