package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.ac */
/* compiled from: PG */
public final class C31374ac {
    /* renamed from: a */
    public static Handler m58483a(C58833ax axVar) {
        Looper looper;
        if (axVar.mo56113h()) {
            looper = (Looper) axVar.mo56107c();
        } else {
            HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        return new Handler(looper);
    }

    /* renamed from: b */
    static C31399t m58484b(C58833ax axVar, C69464a aVar) {
        return axVar.mo56113h() ? (C31399t) aVar.mo17428b() : new C31373ab();
    }

    /* renamed from: c */
    public static Set m58485c(C58833ax axVar, C69464a aVar) {
        if (axVar.mo56113h()) {
            return new C58759qy((C31313p) aVar.mo17428b());
        }
        return C58733pz.f156496a;
    }

    /* renamed from: d */
    public static boolean m58486d(C58833ax axVar, C69464a aVar, C58833ax axVar2) {
        if (((Boolean) axVar2.mo56109e(false)).booleanValue() || (((Boolean) axVar.mo56109e(false)).booleanValue() && ((Boolean) aVar.mo17428b()).booleanValue())) {
            return true;
        }
        return false;
    }
}
