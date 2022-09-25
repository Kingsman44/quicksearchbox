package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dj */
/* compiled from: PG */
final class C105563dj implements View.OnTouchListener {
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        view.performClick();
        return true;
    }
}
