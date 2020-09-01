package Android.Lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Initializing input/read variables
    private TextView total;
    private Button calculateBtn;
    private EditText a;
    private EditText c;
    private EditText y;
    private EditText i;
    private EditText t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            a = findViewById(R.id.attemptInput);
            c = findViewById(R.id.compInput);
            y = findViewById(R.id.yardInput);
            i = findViewById(R.id.interceptionInput);
            t = findViewById(R.id.touchdownInput);
            total = findViewById(R.id.Total);

            Button calculateBtn = findViewById(R.id.Calculate);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    double f1 = (((Float.parseFloat(c.getText().toString()) / Float.parseFloat(a.getText().toString())) * 100) - 30) / 20;
                    double f2 = (((Float.parseFloat(t.getText().toString()) / Float.parseFloat(a.getText().toString())) * 100) / 5);
                    double f3 = (float) ((9.5 - ( (Float.parseFloat(i.getText().toString()) / Float.parseFloat(a.getText().toString()) )* 100)) / 4);
                    double f4 = ((Float.parseFloat(y.getText().toString()) / Float.parseFloat(a.getText().toString())) - 3) / 4;
                    double answer = (float) ((f1 + f2 + f3 + f4) / .06);
                    String ansString = Double.toString(answer);
                    total.setText(ansString);
                }
        });




    }
}
