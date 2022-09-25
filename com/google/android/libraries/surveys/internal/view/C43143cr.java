package com.google.android.libraries.surveys.internal.view;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.surveys.internal.view.cr */
/* compiled from: PG */
public final /* synthetic */ class C43143cr implements View.OnTouchListener {

    /* renamed from: a */
    public static final /* synthetic */ C43143cr f112828a = new C43143cr();

    private /* synthetic */ C43143cr() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.setPressed(true);
        } else if (motionEvent.getAction() == 1) {
            view.performClick();
            view.setPressed(false);
        }
        return false;
    }
}
