package com.google.android.libraries.lens.view.filters;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.filters.at */
/* compiled from: PG */
final class C25913at extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ View f70407a;

    public C25913at(View view) {
        this.f70407a = view;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f70407a.performClick();
        return true;
    }
}
