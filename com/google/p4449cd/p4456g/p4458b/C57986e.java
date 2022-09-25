package com.google.p4449cd.p4456g.p4458b;

import com.google.common.p4522b.C58485gu;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.C57996c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.cd.g.b.e */
/* compiled from: PG */
public final class C57986e implements C57981b {

    /* renamed from: a */
    public final Object f155049a = new Object();

    /* renamed from: b */
    public final List f155050b = new ArrayList();

    /* renamed from: c */
    public C57985d f155051c;

    /* renamed from: d */
    public boolean f155052d = false;

    /* renamed from: e */
    private boolean f155053e = false;

    /* renamed from: f */
    private final List f155054f;

    public C57986e(Iterable iterable) {
        this.f155054f = C58485gu.m89841i(iterable);
    }

    /* renamed from: c */
    public final void mo54588c() {
        C58485gu j;
        synchronized (this.f155049a) {
            j = C58485gu.m89842j(this.f155050b);
            this.f155050b.clear();
        }
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C57996c) j.get(i)).mo21018g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r5 = new java.util.ArrayList();
        r1 = r4.f155054f.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.add(((com.google.p4449cd.p4456g.C57981b) r1.next()).mo20440jJ(new com.google.p4449cd.p4456g.p4458b.C57984c(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        com.google.common.util.concurrent.C60856cj.m92892a(r5).mo57334a(new com.google.p4449cd.p4456g.p4458b.C57983b(r4), com.google.common.util.concurrent.C60826bg.f164896a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r0.mo54585e(new java.lang.UnsupportedOperationException("MergeSource does not allow registering multiple sinks at a time"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        return r0.f155043b;
     */
    /* renamed from: jJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20440jJ(com.google.p4449cd.p4456g.C57974a r5) {
        /*
            r4 = this;
            com.google.cd.g.b.d r0 = new com.google.cd.g.b.d
            r0.<init>(r5)
            r5.mo20338d(r0)
            java.lang.Object r5 = r4.f155049a
            monitor-enter(r5)
            boolean r1 = r4.f155053e     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0016
            r0.mo21018g()     // Catch:{ all -> 0x0062 }
            com.google.cd.g.a.e r0 = r0.f155043b     // Catch:{ all -> 0x0062 }
            monitor-exit(r5)     // Catch:{ all -> 0x0062 }
            return r0
        L_0x0016:
            com.google.cd.g.b.d r1 = r4.f155051c     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x001e
            r4.f155051c = r0     // Catch:{ all -> 0x0062 }
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            monitor-exit(r5)     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0055
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r1 = r4.f155054f
            java.util.Iterator r1 = r1.iterator()
        L_0x002d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r1.next()
            com.google.cd.g.b r2 = (com.google.p4449cd.p4456g.C57981b) r2
            com.google.cd.g.b.c r3 = new com.google.cd.g.b.c
            r3.<init>(r4)
            com.google.common.util.concurrent.cx r2 = r2.mo20440jJ(r3)
            r5.add(r2)
            goto L_0x002d
        L_0x0046:
            com.google.common.util.concurrent.cf r5 = com.google.common.util.concurrent.C60856cj.m92892a(r5)
            com.google.cd.g.b.b r1 = new com.google.cd.g.b.b
            r1.<init>(r4)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            r5.mo57334a(r1, r2)
            goto L_0x005f
        L_0x0055:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MergeSource does not allow registering multiple sinks at a time"
            r5.<init>(r1)
            r0.mo54585e(r5)
        L_0x005f:
            com.google.cd.g.a.e r5 = r0.f155043b
            return r5
        L_0x0062:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0065:
            throw r0
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4449cd.p4456g.p4458b.C57986e.mo20440jJ(com.google.cd.g.a):com.google.common.util.concurrent.cx");
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        synchronized (this.f155049a) {
            this.f155053e = true;
            C57985d dVar = this.f155051c;
            if (dVar != null) {
                if (dVar.f155044c.get()) {
                    this.f155051c.mo21018g();
                    this.f155051c = null;
                    mo54588c();
                }
            }
        }
    }
}
