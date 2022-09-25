package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: com.google.android.material.timepicker.ah */
/* compiled from: PG */
final class C44974ah implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ GestureDetector f117544a;

    public C44974ah(GestureDetector gestureDetector) {
        this.f117544a = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f117544a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
