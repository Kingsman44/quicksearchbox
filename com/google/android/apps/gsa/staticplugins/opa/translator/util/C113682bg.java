package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.bg */
/* compiled from: PG */
final class C113682bg extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ OobeView f314877a;

    public C113682bg(OobeView oobeView) {
        this.f314877a = oobeView;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        OobeView oobeView = this.f314877a;
        if (!oobeView.mo100463e() && !oobeView.mo100464f()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (oobeView.f314813m) {
            ModeTogglePlateView c = oobeView.mo100461c();
            C113680be e = c.mo100450e(x, y);
            if (e == C113680be.AUTO) {
                c.mo100447b().performClick();
            } else if (e == C113680be.MANUAL) {
                c.mo100449d().performClick();
            } else if (e == C113680be.KEYBOARD) {
                c.mo100448c().performClick();
            }
            oobeView.f314815o = true;
            return true;
        }
        if (!oobeView.f314814n || !oobeView.mo100460b().mo100387p(x, y, true)) {
            return false;
        }
        return true;
    }
}
