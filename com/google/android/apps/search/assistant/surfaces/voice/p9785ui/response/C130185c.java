package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.c */
/* compiled from: PG */
public final class C130185c extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private final C130274k f356934a;

    public C130185c(C130274k kVar) {
        this.f356934a = kVar;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f356934a.mo109620b(motionEvent, motionEvent2);
        return true;
    }
}
