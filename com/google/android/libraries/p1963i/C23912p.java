package com.google.android.libraries.p1963i;

import android.os.Looper;
import android.os.StrictMode;
import com.google.android.libraries.p1963i.p1967c.C23877f;
import com.google.android.libraries.p1963i.p1967c.C23880i;
import com.google.android.libraries.p1963i.p1967c.C23881j;
import com.google.android.libraries.p1963i.p1967c.C23882k;
import com.google.android.libraries.p1963i.p1968d.C23890c;
import com.google.android.libraries.p1963i.p1968d.C23894g;
import com.google.android.libraries.p1963i.p1968d.C23896i;
import com.google.android.libraries.p1963i.p1968d.C23898k;
import com.google.android.libraries.p1963i.p1968d.C23900m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60908dv;
import com.google.common.util.concurrent.C60917ed;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.i.p */
/* compiled from: PG */
public final class C23912p {
    /* renamed from: a */
    public static int m44492a() {
        return Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
    }

    /* renamed from: b */
    public static C60888db m44493b(C23834ai aiVar) {
        C23910n nVar = new C23910n(m44501j("Scheduler", C23871c.f65326a));
        nVar.setRemoveOnCancelPolicy(true);
        return aiVar.mo29183a(C60895di.m92996b(nVar));
    }

    /* renamed from: c */
    public static int m44494c() {
        Integer num = 4;
        return num.intValue();
    }

    /* renamed from: d */
    public static Looper m44495d() {
        SettableFuture settableFuture = new SettableFuture();
        new C23907k(m44501j("Lite", new C23845at(C23915s.m44504c(0))), C23864be.m44420a()).newThread(new C23905i(settableFuture)).start();
        try {
            return (Looper) C60917ed.m93034a(settableFuture);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public static C60888db m44496e(C60888db dbVar, int i, C23881j jVar, C23898k kVar) {
        Boolean bool = false;
        C23890c cVar = new C23890c("BG", i, bool.booleanValue());
        C23896i h = m44499h(kVar, cVar);
        boolean booleanValue = bool.booleanValue();
        String str = cVar.f65365a;
        StrictMode.ThreadPolicy.Builder penaltyLog = new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyLog();
        penaltyLog.detectResourceMismatches();
        penaltyLog.detectUnbufferedIo();
        return new C23828ac(C60895di.m92995a(m44500i(cVar, booleanValue, jVar, m44501j(str, new C23907k(new C23845at(C23915s.m44504c(10)), penaltyLog.build())), h)), dbVar);
    }

    /* renamed from: f */
    public static C60888db m44497f(C60888db dbVar, C23881j jVar) {
        C58833ax axVar;
        ThreadFactory j = m44501j("Blocking", new C23909m(new C23845at(C23915s.m44504c(11))));
        if (!jVar.f65350a.mo56113h()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(new C23877f((C23882k) jVar.f65350a.mo56107c(), jVar.f65351b, j));
        }
        return new C23828ac(C60895di.m92995a(new C23911o(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), (ThreadFactory) axVar.mo56109e(j))), dbVar);
    }

    /* renamed from: g */
    public static C60888db m44498g(C60888db dbVar, int i, C23881j jVar, C23898k kVar) {
        Boolean bool = false;
        C23890c cVar = new C23890c("Lite", i, bool.booleanValue());
        C23896i h = m44499h(kVar, cVar);
        return new C23828ac(C60895di.m92995a(m44500i(cVar, bool.booleanValue(), jVar, m44501j(cVar.f65365a, new C23907k(new C23845at(C23915s.m44504c(0)), C23864be.m44420a())), h)), dbVar);
    }

    /* renamed from: h */
    private static C23896i m44499h(C23898k kVar, C23894g gVar) {
        return ((C23890c) gVar).f65367c ? kVar.mo29309a(gVar) : C23896i.f65370a;
    }

    /* renamed from: i */
    private static ExecutorService m44500i(C23894g gVar, boolean z, C23881j jVar, ThreadFactory threadFactory, C23896i iVar) {
        C58833ax axVar;
        if (!jVar.f65350a.mo56113h()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(new C23880i(threadFactory));
        }
        if (axVar.mo56113h()) {
            threadFactory = (ThreadFactory) axVar.mo56107c();
        }
        C23890c cVar = (C23890c) gVar;
        C23900m mVar = cVar.f65367c ? new C23900m(threadFactory, iVar) : threadFactory;
        if (z) {
            C23839an anVar = new C23839an(cVar.f65366b, mVar, new C23901e(iVar), new C23902f(iVar));
            if (!axVar.mo56113h()) {
                return anVar;
            }
            Objects.requireNonNull(anVar);
            return jVar.mo29280a((C23880i) axVar.mo56107c(), anVar, new C23903g(anVar));
        }
        int i = cVar.f65366b;
        C23911o oVar = new C23911o(i, i, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), mVar);
        return axVar.mo56113h() ? jVar.mo29280a((C23880i) axVar.mo56107c(), oVar, new C23904h(oVar)) : oVar;
    }

    /* renamed from: j */
    private static ThreadFactory m44501j(String str, ThreadFactory threadFactory) {
        C60908dv dvVar = new C60908dv();
        dvVar.f165020a = true;
        dvVar.mo57410b(str.concat(" Thread #%d"));
        threadFactory.getClass();
        dvVar.f165021b = threadFactory;
        return C60908dv.m93015a(dvVar);
    }
}
