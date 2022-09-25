package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.b */
/* compiled from: PG */
final class C136084b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ Function f370629a;

    /* renamed from: b */
    final /* synthetic */ LockableBottomSheetBehavior f370630b;

    public C136084b(LockableBottomSheetBehavior lockableBottomSheetBehavior, Function function) {
        this.f370630b = lockableBottomSheetBehavior;
        this.f370629a = function;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.f370630b.f115862E != 6 || !((Boolean) this.f370629a.apply(motionEvent)).booleanValue()) {
            return false;
        }
        this.f370630b.mo47519v(3);
        return true;
    }
}
