package com.google.android.apps.search.podcasts.p10550b.p10552b;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.podcasts.b.b.r */
/* compiled from: PG */
public final /* synthetic */ class C140040r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C140022ao f380607a;

    /* renamed from: b */
    public final /* synthetic */ long f380608b;

    public /* synthetic */ C140040r(C140022ao aoVar, long j) {
        this.f380607a = aoVar;
        this.f380608b = j;
    }

    public final Object call() {
        C140022ao aoVar = this.f380607a;
        long j = this.f380608b;
        return Integer.valueOf(aoVar.f380566i.remove(new long[]{j}));
    }
}
