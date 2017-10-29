package xyz.xingm.gradletest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/10/29.
 */
public class CaseTest {

    int one;

    @Before
    public void start() throws Exception{
        System.out.print("start");
        one = 1;
    }

    @After
    public void end() throws Exception{
        System.out.print("end");
    }

    @Test
    public void test1() throws Exception {
        System.out.print("test1");
        assertEquals(1, 1); //正确测试结果
        assertEquals(1, one); //错误测试结果(1是期待值，one是最终值)
        assertEquals(0, 2, 3); //预期值，实际值，误差范围
    }

}