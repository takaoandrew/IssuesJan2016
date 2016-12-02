package com.example.android.sunshine.app.data;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by andrewtakao on 12/2/16.
 */

public class myView extends View {
    public myView(Context context) {
        super(context);
    }
    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public myView(Context context, AttributeSet attrs, int defaultStyle) {
        super(context, attrs, defaultStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
