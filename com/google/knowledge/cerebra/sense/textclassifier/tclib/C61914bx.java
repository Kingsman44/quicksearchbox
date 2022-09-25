package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bx */
/* compiled from: PG */
final class C61914bx {

    /* renamed from: a */
    public C60887da f167387a;

    /* renamed from: b */
    public final boolean f167388b;

    /* renamed from: c */
    public List f167389c = new ArrayList();

    /* renamed from: d */
    public List f167390d = new ArrayList();

    /* renamed from: e */
    private final C61928ck f167391e;

    public C61914bx(C61928ck ckVar, C58833ax axVar) {
        this.f167391e = ckVar;
        this.f167387a = (C60887da) axVar.mo56111f();
        this.f167388b = axVar.mo56113h();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        mo58353c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r2.f167388b != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r2.f167387a = com.google.common.util.concurrent.C60895di.m92995a(java.util.concurrent.Executors.newSingleThreadExecutor());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo58351a() {
        /*
            r2 = this;
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r0.<init>()
            monitor-enter(r2)
            java.util.List r1 = r2.f167390d     // Catch:{ all -> 0x002d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0026
            java.util.List r1 = r2.f167390d     // Catch:{ all -> 0x002d }
            r1.add(r0)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            boolean r1 = r2.f167388b
            if (r1 != 0) goto L_0x0022
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.google.common.util.concurrent.da r1 = com.google.common.util.concurrent.C60895di.m92995a(r1)
            r2.f167387a = r1
        L_0x0022:
            r2.mo58353c()
            return r0
        L_0x0026:
            java.util.List r1 = r2.f167389c     // Catch:{ all -> 0x002d }
            r1.add(r0)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r0
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61914bx.mo58351a():com.google.common.util.concurrent.cx");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo58352b() {
        C60870cx a = mo58351a();
        a.mo4106b(new C61913bw(a), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo58353c() {
        C61928ck ckVar = this.f167391e;
        C60870cx g = ckVar.f167405a.mo58307g(this.f167387a);
        g.mo4106b(new C61912bv(this, g), this.f167387a);
    }
}
