package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aep */
/* compiled from: PG */
public final class aep implements adk {
    protected aep() {
    }

    /* renamed from: a */
    public final long mo14486a() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final long mo14487b() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: c */
    public final adp mo14488c(Looper looper, Handler.Callback callback) {
        return new aeq(new Handler(looper, callback));
    }
}
