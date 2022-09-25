package com.google.android.apps.gsa.assistant.settings.features.voiceselection;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.voiceselection.al */
/* compiled from: PG */
final class C73522al extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ an f194538a;

    /* renamed from: b */
    private float f194539b = -1.0f;

    public C73522al(an anVar) {
        this.f194538a = anVar;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f194539b != motionEvent.getX()) {
            this.f194539b = motionEvent.getX();
            an anVar = this.f194538a;
            int i = anVar.i.b;
            if (f > 0.0f && i < anVar.c.size() - 1) {
                anVar.h.smoothScrollToPosition(i + 1);
            } else if (f < 0.0f && i > 0) {
                anVar.h.smoothScrollToPosition(i - 1);
            }
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f194538a.j.performClick();
        return true;
    }
}
