package acadgild.session_03_assignment_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toast toast;
    private String buttonColor;
    private CharSequence text;
    private Button redButton,orangeButton,yellowButton,greenButton,blueButton,indigoButton,violetButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redButton = (Button)findViewById(R.id.redButton);
        orangeButton = (Button)findViewById(R.id.orangeButton);
        yellowButton = (Button)findViewById(R.id.yellowButton);
        greenButton = (Button)findViewById(R.id.greenButton);
        blueButton = (Button)findViewById(R.id.blueButton);
        indigoButton = (Button)findViewById(R.id.indigoButton);
        violetButton = (Button)findViewById(R.id.violetButton);

        redButton.setOnClickListener(this);
        orangeButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
        indigoButton.setOnClickListener(this);
        violetButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        showMyToast(v);
    }

    public void showMyToast(View view){
        buttonColor = view.getTag().toString();
        text = "Color Selected is : "+buttonColor;
        int duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
        Log.i("LOG: COLOR CLICKED : ",buttonColor.toUpperCase());
    }

}
