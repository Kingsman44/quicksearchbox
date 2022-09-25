package com.google.android.setupdesign.view;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.google.android.setupdesign.view.f */
/* compiled from: PG */
public final class C45326f extends LinkMovementMethod {

    /* renamed from: a */
    boolean f118449a = false;

    /* renamed from: b */
    MotionEvent f118450b;

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.f118450b = motionEvent;
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f118449a = Selection.getSelectionStart(spannable) != -1;
        } else {
            this.f118449a = onTouchEvent;
        }
        return onTouchEvent;
    }
}
