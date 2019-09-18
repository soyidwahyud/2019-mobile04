package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        editText = findViewById(R.id.input_name);
        textView = findViewById(R.id.text_output);
    }


    public void submitOnClick(View view) {
        String name = editText.getText().toString();
        textView.setText("Hello " + name + ", Congratulations!");
    }
}
