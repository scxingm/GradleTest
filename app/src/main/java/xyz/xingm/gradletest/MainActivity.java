package xyz.xingm.gradletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MyToast().showToast(this);//根据不同选择调用不同类
        boolean autoUpdata = BuildConfig.AUTO_UPDATA; //读取项目module中build.gradle下的productFlavors中的常量
    }
}
