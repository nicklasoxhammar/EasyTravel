package four.easytravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GooglePlace extends AppCompatActivity {

    public TextView city;
    public String cityLocate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_place);

        cityLocate = getIntent().getStringExtra("cityLocate");
        city = findViewById(R.id.city);
        city.setText(cityLocate);

    }
}
