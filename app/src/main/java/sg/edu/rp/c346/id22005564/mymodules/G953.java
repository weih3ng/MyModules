package sg.edu.rp.c346.id22005564.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class G953 extends AppCompatActivity {

    TextView TextView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g953);
        TextView = findViewById(R.id.textView16);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value",2023);
        int sem = intentReceived.getIntExtra("sem",1);
        int cred = intentReceived.getIntExtra("cred",0);
        String code = intentReceived.getStringExtra("G953");
        TextView.setText("Module Code: G953 \nModule Name: Life Skills III \nAcademic Year: " + value +
                "\nSemester: " + sem + "\nModule Credit: " + cred +"\nVenue: HB02");
    }
}