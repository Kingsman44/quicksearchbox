package com.google.p3723ar.imp.view;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.google.ar.imp.view.d */
/* compiled from: PG */
final class C47988d implements C47990f {

    /* renamed from: a */
    private final HandlerThread f124200a;

    /* renamed from: b */
    private final Handler f124201b;

    public C47988d() {
        HandlerThread handlerThread = new HandlerThread("impressThread");
        this.f124200a = handlerThread;
        handlerThread.start();
        this.f124201b = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final Handler mo53092a() {
        return this.f124201b;
    }
}
