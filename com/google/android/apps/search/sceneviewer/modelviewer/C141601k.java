package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.k */
/* compiled from: PG */
public final /* synthetic */ class C141601k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ MotionEvent f384387a;

    public /* synthetic */ C141601k(MotionEvent motionEvent) {
        this.f384387a = motionEvent;
    }

    public final void accept(Object obj) {
        MotionEvent motionEvent = this.f384387a;
        String str = C141584am.f384270a;
        ((GestureDetector) obj).onTouchEvent(motionEvent);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
