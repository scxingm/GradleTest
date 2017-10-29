package xyz.xingm.gradletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MyToast().showToast(this);//根据不同选择调用不同类
        boolean autoUpdata = BuildConfig.AUTO_UPDATA; //读取项目module中build.gradle下的productFlavors中的常量

        init();
    }

    EditText editText;
    TextView textView;
    Button button;
    private void init() {
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView.setText("你好, "+editText.getText().toString()+"!");
        }
    };
}
