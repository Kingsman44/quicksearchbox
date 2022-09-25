package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7412c;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.c.d */
/* compiled from: PG */
final class C94118d extends GestureDetector {

    /* renamed from: a */
    final /* synthetic */ C94124j f262942a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94118d(C94124j jVar, Context context, GestureDetector.OnGestureListener onGestureListener) {
        super(context, onGestureListener);
        this.f262942a = jVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            C94124j jVar = this.f262942a;
            if (!jVar.f262963h) {
                jVar.f262961f.startAnimation(new C94123i(jVar.f262961f, jVar.f262960e));
            }
        }
        return true;
    }
}
