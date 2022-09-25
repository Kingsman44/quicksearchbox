package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import android.os.Handler;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85335d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.c */
/* compiled from: PG */
final class C105808c {

    /* renamed from: a */
    public static final C59071e f295171a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.o.b.c");

    /* renamed from: b */
    public C85335d f295172b = C85335d.f231112d;

    /* renamed from: c */
    private final List f295173c = new ArrayList();

    /* renamed from: d */
    private final C60870cx f295174d;

    /* renamed from: e */
    private C60870cx f295175e = C60856cj.m92900i(C85335d.f231112d);

    /* renamed from: f */
    private boolean f295176f = false;

    public C105808c(C60870cx cxVar) {
        this.f295174d = cxVar;
    }

    /* renamed from: a */
    public final synchronized void mo95072a() {
        this.f295176f = true;
    }

    /* renamed from: b */
    public final synchronized void mo95073b(C85335d dVar) {
        this.f295172b = dVar;
        if (!this.f295176f) {
            for (C105815j jVar : this.f295173c) {
                C62971cq cqVar = dVar.f231115b;
                C105823r rVar = jVar.f295198a;
                if (rVar.f295215i.mo56113h()) {
                    ((Handler) rVar.f295215i.mo56107c()).post(new C105816k(rVar, cqVar));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95074c() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.apps.gsa.search.core.al.dd.d r0 = r3.f295172b     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.f231116c     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002e
            boolean r0 = r3.f295176f     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x000c
            goto L_0x002e
        L_0x000c:
            com.google.common.util.concurrent.cx r0 = r3.f295175e     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)
            return
        L_0x0016:
            com.google.common.util.concurrent.cx r0 = r3.f295174d     // Catch:{ all -> 0x0030 }
            com.google.android.apps.gsa.staticplugins.o.b.a r1 = com.google.android.apps.gsa.staticplugins.p8163o.p8165b.C105806a.f295169a     // Catch:{ all -> 0x0030 }
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x0030 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r1, r2)     // Catch:{ all -> 0x0030 }
            r3.f295175e = r0     // Catch:{ all -> 0x0030 }
            com.google.android.apps.gsa.staticplugins.o.b.b r1 = new com.google.android.apps.gsa.staticplugins.o.b.b     // Catch:{ all -> 0x0030 }
            r1.<init>(r3)     // Catch:{ all -> 0x0030 }
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x0030 }
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r1, r2)     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)
            return
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8163o.p8165b.C105808c.mo95074c():void");
    }

    /* renamed from: d */
    public final synchronized void mo95075d(C105815j jVar) {
        this.f295173c.add(jVar);
    }
}
