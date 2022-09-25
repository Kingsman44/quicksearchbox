package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.aj */
/* compiled from: PG */
final class C141581aj extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C141584am f384265a;

    public C141581aj(C141584am amVar) {
        this.f384265a = amVar;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.f384265a.f384353v.isModelLoaded() || this.f384265a.f384356y.getTouchEventsEnabled()) {
            return false;
        }
        C141584am amVar = this.f384265a;
        amVar.mo116580n(!amVar.f384296X, 300);
        this.f384265a.mo116584q();
        return true;
    }
}
