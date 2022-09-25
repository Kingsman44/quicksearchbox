package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.content.Context;
import android.support.p033v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.UntouchableTextView */
/* compiled from: PG */
public final class UntouchableTextView extends AppCompatTextView {
    public UntouchableTextView(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public UntouchableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UntouchableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
