package com.google.ads.interactivemedia.p367v3.internal;

import android.os.SystemClock;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hz */
/* compiled from: PG */
final class C7000hz {

    /* renamed from: a */
    private Exception f22341a;

    /* renamed from: b */
    private long f22342b;

    /* renamed from: a */
    public final void mo16000a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f22341a == null) {
            this.f22341a = exc;
            this.f22342b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f22342b) {
            Exception exc2 = this.f22341a;
            if (exc2 != exc) {
                auf.m19649a(exc2, exc);
            }
            Exception exc3 = this.f22341a;
            mo16001b();
            throw exc3;
        }
    }

    /* renamed from: b */
    public final void mo16001b() {
        this.f22341a = null;
    }
}
