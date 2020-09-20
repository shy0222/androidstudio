package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvInput;
    private TextView tvResult;


    private String inputStr;
    private String express;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInput = findViewById(R.id.tv_input);
        tvResult = findViewById(R.id.tv_result);

        flag = false;
        express = "";
        inputStr = "";
    }
    public void calculate(View view){
        Button button = (Button) view;
        if(flag){
            inputStr = "";
            tvInput.setText(inputStr);
            tvResult.setText(0);
            flag = !flag;
        }

    }
}