package com.google.android.apps.gsa.search.shared.overlay;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.c */
/* compiled from: PG */
final class C87654c implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ View f236913a;

    public C87654c(View view) {
        this.f236913a = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f236913a.onTouchEvent(motionEvent);
        return false;
    }
}
