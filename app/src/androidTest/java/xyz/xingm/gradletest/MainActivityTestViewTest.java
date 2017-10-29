package xyz.xingm.gradletest;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * MainActivity测试类
 * Created by Administrator on 2017/10/29.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTestViewTest {

    private static final String TAG = "androidTest";

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void runTest(){

        // onView可以获取控件
        // 需要点击的选项为ListView或Spinner这类控件中没有id的选项时，可以通过onData对其进行获取。

        //　获得EditTex并输入字符串
        onView(withId(R.id.editText)).perform(typeText(TAG), closeSoftKeyboard());

        //　获取button并模拟点击
        onView(withId(R.id.button)).perform(click());

        //　比较testView与期望字符串是否匹配
        String str = "你好, "+ TAG + "!";
        onView(withId(R.id.textView)).check(matches(withText(str)));
    }

}
