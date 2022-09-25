package com.google.android.libraries.onegoogle.accountmenu;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h */
/* compiled from: PG */
public final /* synthetic */ class C30650h implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ SelectedAccountDisc f82748a;

    public /* synthetic */ C30650h(SelectedAccountDisc selectedAccountDisc) {
        this.f82748a = selectedAccountDisc;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SelectedAccountDisc selectedAccountDisc = this.f82748a;
        View.OnTouchListener onTouchListener = selectedAccountDisc.f81904e;
        boolean z = onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        View.OnTouchListener onTouchListener2 = selectedAccountDisc.f81905f;
        boolean z2 = onTouchListener2 != null && SelectedAccountDisc.m56353e(((C30701i) onTouchListener2).f82878a, view, motionEvent);
        if (selectedAccountDisc.f81905f == null || !z) {
            return z2 || z;
        }
        throw new RuntimeException("customOnTouchListener may not consume the event");
    }
}
