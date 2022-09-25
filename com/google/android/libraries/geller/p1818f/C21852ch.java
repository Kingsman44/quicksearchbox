package com.google.android.libraries.geller.p1818f;

import android.net.TrafficStats;

/* renamed from: com.google.android.libraries.geller.f.ch */
/* compiled from: PG */
public final /* synthetic */ class C21852ch implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21853ci f60309a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f60310b;

    public /* synthetic */ C21852ch(C21853ci ciVar, Runnable runnable) {
        this.f60309a = ciVar;
        this.f60310b = runnable;
    }

    public final void run() {
        C21853ci ciVar = this.f60309a;
        Runnable runnable = this.f60310b;
        TrafficStats.setThreadStatsTag(ciVar.f60311a);
        int i = ciVar.f60312b;
        if (i != -1) {
            TrafficStats.setThreadStatsUid(i);
        }
        try {
            runnable.run();
            TrafficStats.clearThreadStatsTag();
            if (ciVar.f60312b != -1) {
                TrafficStats.clearThreadStatsUid();
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            if (ciVar.f60312b != -1) {
                TrafficStats.clearThreadStatsUid();
            }
            throw th;
        }
    }
}
