package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.social.populous.core.dm */
/* compiled from: PG */
public abstract class C42341dm implements C42355p {

    /* renamed from: a */
    public final AtomicInteger f111044a = new AtomicInteger(1);

    /* renamed from: b */
    public final AtomicReference f111045b = new AtomicReference();

    /* renamed from: c */
    public final AtomicReference f111046c = new AtomicReference();

    /* renamed from: d */
    public final C60845bz f111047d;

    public C42341dm(C60845bz bzVar) {
        this.f111047d = bzVar;
    }

    /* renamed from: g */
    private final synchronized C60870cx m74566g() {
        C60870cx e;
        int i = this.f111044a.get();
        e = mo45321e();
        C60856cj.m92911t(e, new C42339dk(this, i), C60826bg.f164896a);
        this.f111046c.set(e);
        return e;
    }

    /* renamed from: a */
    public final C58833ax mo45322a() {
        Object obj = this.f111045b.get();
        C60870cx cxVar = (C60870cx) this.f111046c.get();
        if (obj != null || cxVar == null || !cxVar.isDone()) {
            return C58833ax.m90833j(obj);
        }
        try {
            return C58833ax.m90833j(C60856cj.m92909r(cxVar));
        } catch (ExecutionException unused) {
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public final synchronized C60870cx mo45323b() {
        Object obj = this.f111045b.get();
        C60870cx cxVar = (C60870cx) this.f111046c.get();
        if (obj != null) {
            cxVar = C60856cj.m92900i(obj);
        } else if (cxVar == null) {
            cxVar = null;
        }
        if (cxVar != null) {
            return cxVar;
        }
        return m74566g();
    }

    /* renamed from: c */
    public final synchronized void mo45324c(Object obj) {
        mo45326f(obj, this.f111044a.get());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo45325d() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference r0 = r1.f111045b     // Catch:{ all -> 0x0018 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            java.util.concurrent.atomic.AtomicReference r0 = r1.f111046c     // Catch:{ all -> 0x0018 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            r1.m74566g()     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)
            return
        L_0x0016:
            monitor-exit(r1)
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C42341dm.mo45325d():void");
    }

    /* renamed from: e */
    public abstract C60870cx mo45321e();

    /* renamed from: f */
    public final synchronized void mo45326f(Object obj, int i) {
        if (this.f111044a.compareAndSet(i, i + 1)) {
            this.f111045b.set(obj);
            this.f111046c.set((Object) null);
        }
    }
}
