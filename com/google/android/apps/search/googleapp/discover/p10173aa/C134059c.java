package com.google.android.apps.search.googleapp.discover.p10173aa;

import androidx.work.C4381ae;
import androidx.work.C4634o;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.c */
/* compiled from: PG */
public final class C134059c extends C134060d {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134059c(C4381ae aeVar, Instant instant, Duration duration, boolean z) {
        super(instant, duration, aeVar, z, "feed_sync_watchdog_worker", C134064h.WATCHDOG, C4634o.KEEP);
        C69664n.m101061g(aeVar, "networkType");
        C69664n.m101061g(instant, "timestampCreated");
        C69664n.m101061g(duration, "scheduledOffset");
    }
}
