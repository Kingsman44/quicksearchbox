package com.google.android.setupcompat.template;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/* compiled from: PG */
public class FooterActionButton extends Button {

    /* renamed from: a */
    public C45277d f118257a;

    /* renamed from: b */
    public boolean f118258b = false;

    public FooterActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }
}
