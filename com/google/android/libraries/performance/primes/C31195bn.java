package com.google.android.libraries.performance.primes;

import com.google.android.libraries.p1963i.C23834ai;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60895di;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.bn */
/* compiled from: PG */
public final class C31195bn {
    /* renamed from: a */
    public static C60888db m58187a(C31201bt btVar, C23834ai aiVar) {
        C60888db c = btVar.mo36935c();
        if (c != null) {
            return c;
        }
        int a = btVar.mo36933a();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(a, new C31194bm(btVar.mo36934b()), new C31192bk());
        scheduledThreadPoolExecutor.setMaximumPoolSize(a);
        return aiVar.mo29183a(C60895di.m92996b(scheduledThreadPoolExecutor));
    }

    /* renamed from: b */
    public static Executor m58188b(C69464a aVar, C69464a aVar2, C31201bt btVar) {
        if (btVar.mo36936d()) {
            return (Executor) aVar.mo17428b();
        }
        return (Executor) aVar2.mo17428b();
    }
}
