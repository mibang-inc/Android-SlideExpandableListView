package com.tjerkw.slideexpandable.sample;
 import android.util.*;
 import android.widget.*;
 import android.view.*;
 import android.content.*;
 import android.app.*;
 import android.os.*;
 import android.database.*;
 import android.net.*;
 import android.opengl.*;
 import android.graphics.*;
 import android.view.animation.*;
 import android.text.TextUtils;
 
 import java.util.*;

public class MyLayout extends LinearLayout {

    private ToggleListener listener;

    public MyLayout(Context context) {
        super(context);
    }

    public MyLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean performClick() {
        if (listener != null) {
            listener.toggle();
        }
        System.out.println("++++++++++++++++++++" + "performclick" + "++++++++++++++++++++");
        return super.performClick();
    }

    public void setToggleListener(ToggleListener listener) {
        this.listener = listener;
    }

    public static interface ToggleListener {
        public void toggle();
    }
}

