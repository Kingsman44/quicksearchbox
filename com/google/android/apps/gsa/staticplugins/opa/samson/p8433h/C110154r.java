package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.r */
/* compiled from: PG */
final class C110154r extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C110161y f306925a;

    public C110154r(C110161y yVar) {
        this.f306925a = yVar;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C110161y yVar = this.f306925a;
        yVar.mo98430c(true != yVar.f306963m ? 2 : 7);
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C110161y yVar = this.f306925a;
        if (!yVar.f306963m) {
            return false;
        }
        C89949q.m146521e(C28285c.m52882i(yVar.f306954d, 5, (Integer) null), false);
        this.f306925a.mo98430c(2);
        return true;
    }
}
