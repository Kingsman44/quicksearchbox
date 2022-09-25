package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.NonTouchInterceptingScrollView */
/* compiled from: PG */
public class NonTouchInterceptingScrollView extends ScrollView {
    public NonTouchInterceptingScrollView(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() <= 0 || getChildAt(0).getHeight() <= getHeight()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public NonTouchInterceptingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonTouchInterceptingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
