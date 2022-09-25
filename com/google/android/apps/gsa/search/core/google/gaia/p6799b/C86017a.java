package com.google.android.apps.gsa.search.core.google.gaia.p6799b;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.b.a */
/* compiled from: PG */
public final class C86017a {
    /* renamed from: a */
    public static Handler m138320a() {
        HandlerThread handlerThread = new HandlerThread("LoginHelperThread");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
