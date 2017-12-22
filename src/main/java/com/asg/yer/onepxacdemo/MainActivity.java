package com.asg.yer.onepxacdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ScreenManager screenManager = ScreenManager.getInstance(MainActivity.this);
        ScreenBroadcastListener listener = new ScreenBroadcastListener(this);
        Log.e("YER", "===============================");
        listener.registerListener(new ScreenBroadcastListener.ScreenStateListener() {
            @Override
            public void onScreenOn() {
                screenManager.finishActivity();
                Log.e("YER", "onScreenOn: 屏被唤醒了"+Thread.currentThread().getName());
//                moveTaskToBack(false);
            }

            @Override
            public void onScreenOff() {
                screenManager.startActivity();

                Log.e("YER", "onScreenOn: 屏被熄灭了"+Thread.currentThread().getName());
            }
        });
    }


    @Override
    public void onBackPressed() {
        moveTaskToBack(false);




//        终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。
//        该方法调用 Runtime 类中的 exit 方法。该方法永远不会正常返回。
//        调用 System.exit(n) 实际上等效于调用：
//        java.lang.System.exit(0);
//        Runtime.getRuntime().exit(0);


//        int pid = android.os.Process.myPid();
//        String command = "kill -9 "+ pid;
//        try {
//            Runtime.getRuntime().exec(command);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }

}
