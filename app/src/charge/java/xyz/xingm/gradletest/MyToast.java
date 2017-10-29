package xyz.xingm.gradletest;

import android.content.Context;
import android.widget.Toast;

/**
 * Build Variants 中 Build Variant 选择chargeRelease/chargeDebug　会使用该类
 * Created by Administrator on 2017/10/29.
 */

public class MyToast {

    public void showToast(Context context){
        Toast.makeText(context, "收费版", Toast.LENGTH_SHORT).show();
    }

}
