package org.chromium.net.impl;

import android.net.TrafficStats;
import org.chromium.net.ThreadStatsUid;

/* renamed from: org.chromium.net.impl.bd */
/* compiled from: PG */
final class C72471bd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f192837a;

    /* renamed from: b */
    final /* synthetic */ C72477bj f192838b;

    public C72471bd(C72477bj bjVar, Runnable runnable) {
        this.f192838b = bjVar;
        this.f192837a = runnable;
    }

    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.f192838b.f192847b);
        C72477bj bjVar = this.f192838b;
        if (bjVar.f192848c) {
            ThreadStatsUid.set(bjVar.f192849d);
        }
        try {
            this.f192837a.run();
            if (this.f192838b.f192848c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        } catch (Throwable th) {
            if (this.f192838b.f192848c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
            throw th;
        }
    }
}
