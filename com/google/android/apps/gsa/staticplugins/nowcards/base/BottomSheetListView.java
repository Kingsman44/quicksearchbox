package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

/* compiled from: PG */
public class BottomSheetListView extends ListView {
    public BottomSheetListView(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() > 0 && !(getFirstVisiblePosition() == 0 && getChildAt(0).getTop() == 0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
