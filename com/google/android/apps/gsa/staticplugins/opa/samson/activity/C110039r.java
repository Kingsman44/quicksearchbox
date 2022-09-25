package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.r */
/* compiled from: PG */
final class C110039r extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final WeakReference f306589a;

    public C110039r(OpaAmbActivity opaAmbActivity) {
        this.f306589a = new WeakReference(opaAmbActivity);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        OpaAmbActivity opaAmbActivity = (OpaAmbActivity) this.f306589a.get();
        if (opaAmbActivity == null) {
            return true;
        }
        opaAmbActivity.finish();
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }
}
