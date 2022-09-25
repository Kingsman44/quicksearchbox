package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.bk */
/* compiled from: PG */
public final /* synthetic */ class C82161bk implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C82167bq f224581a;

    public /* synthetic */ C82161bk(C82167bq bqVar) {
        this.f224581a = bqVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C82167bq bqVar = this.f224581a;
        MotionEvent.actionToString(motionEvent.getActionMasked());
        if (motionEvent.getActionMasked() != 4) {
            return false;
        }
        bqVar.f224593b.mo76660b(C82165bo.TOUCH_OUTSIDE);
        return false;
    }
}
