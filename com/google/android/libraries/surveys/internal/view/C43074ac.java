package com.google.android.libraries.surveys.internal.view;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.surveys.internal.view.ac */
/* compiled from: PG */
public final /* synthetic */ class C43074ac implements View.OnTouchListener {

    /* renamed from: a */
    public static final /* synthetic */ C43074ac f112654a = new C43074ac();

    private /* synthetic */ C43074ac() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }
}
