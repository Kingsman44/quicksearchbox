package com.google.net.cronet.telemetry.p4729a;

import android.os.SystemClock;

/* renamed from: com.google.net.cronet.telemetry.a.c */
/* compiled from: PG */
public final class C62727c {

    /* renamed from: a */
    private final int f169431a;

    /* renamed from: b */
    private int f169432b = 0;

    /* renamed from: c */
    private long f169433c = Long.MIN_VALUE;

    public C62727c(int i) {
        if (i > 0) {
            this.f169431a = i;
            return;
        }
        throw new IllegalArgumentException("Expect sample rate to be > 0 sample(s) per second");
    }

    /* renamed from: a */
    public final synchronized boolean mo58627a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f169433c + 1000 <= elapsedRealtime) {
            this.f169432b = 1;
            this.f169433c = elapsedRealtime;
            return true;
        }
        int i = this.f169432b;
        if (i >= this.f169431a) {
            return false;
        }
        this.f169432b = i + 1;
        return true;
    }
}
