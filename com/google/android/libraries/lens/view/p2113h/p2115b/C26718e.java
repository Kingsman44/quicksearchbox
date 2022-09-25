package com.google.android.libraries.lens.view.p2113h.p2115b;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.google.android.libraries.lens.view.h.b.e */
/* compiled from: PG */
public final class C26718e {
    /* renamed from: a */
    public static final Handler m49396a() {
        HandlerThread handlerThread = new HandlerThread("cameraThread", -2);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
