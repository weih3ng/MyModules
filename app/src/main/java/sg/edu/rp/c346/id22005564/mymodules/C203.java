package sg.edu.rp.c346.id22005564.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C203 extends AppCompatActivity {

    TextView TextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c203);
        TextView = findViewById(R.id.textView11);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value",2023);
        int sem = intentReceived.getIntExtra("sem",1);
        int cred = intentReceived.getIntExtra("cred",4);
        String code = intentReceived.getStringExtra("C203");
        TextView.setText("Module Code: C203 \nModule Name: Web Appln Development in php \nAcademic Year: " + value +
        "\nSemester: " + sem + "\nModule Credit: " + cred +"\nVenue: W64N");
    }
}