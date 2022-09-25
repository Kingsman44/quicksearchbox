package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fn */
/* compiled from: PG */
final class C115800fn extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C115801fo f321128a;

    /* renamed from: b */
    private float f321129b = -1.0f;

    public C115800fn(C115801fo foVar) {
        this.f321128a = foVar;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f321129b != motionEvent.getX()) {
            this.f321129b = motionEvent.getX();
            C115801fo foVar = this.f321128a;
            int i = foVar.f321135j.f321153b;
            if (f > 0.0f && i < foVar.f321132g.size() - 1) {
                foVar.f321131f.smoothScrollToPosition(i + 1);
            } else if (f < 0.0f && i > 0) {
                foVar.f321131f.smoothScrollToPosition(i - 1);
            }
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f321128a.f321134i.performClick();
        return true;
    }
}
