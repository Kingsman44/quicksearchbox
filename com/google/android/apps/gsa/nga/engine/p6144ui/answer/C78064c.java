package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.c */
/* compiled from: PG */
public final /* synthetic */ class C78064c implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ ConfirmCancelCountDownLayout f215031a;

    public /* synthetic */ C78064c(ConfirmCancelCountDownLayout confirmCancelCountDownLayout) {
        this.f215031a = confirmCancelCountDownLayout;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f215031a.mo72980c();
        return view.performClick();
    }
}
