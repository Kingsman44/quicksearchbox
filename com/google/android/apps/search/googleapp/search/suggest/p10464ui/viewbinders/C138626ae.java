package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ae */
/* compiled from: PG */
final class C138626ae implements View.OnTouchListener {

    /* renamed from: a */
    private final View.OnTouchListener f377013a;

    /* renamed from: b */
    private boolean f377014b = false;

    public C138626ae(View.OnTouchListener onTouchListener) {
        this.f377013a = onTouchListener;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f377014b) {
            this.f377014b = true;
            if (this.f377013a.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
