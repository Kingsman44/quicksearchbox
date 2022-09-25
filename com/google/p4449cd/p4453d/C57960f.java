package com.google.p4449cd.p4453d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60829bj;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4449cd.p4451b.C57938a;
import com.google.p4449cd.p4454e.C57969i;
import com.google.p4449cd.p4460h.C58040b;
import com.google.p4449cd.p4460h.p4461a.C58013ai;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: com.google.cd.d.f */
/* compiled from: PG */
public final class C57960f {

    /* renamed from: a */
    public final SettableFuture f155009a = new SettableFuture();

    /* renamed from: b */
    public final C58040b f155010b;

    /* renamed from: c */
    private final Object f155011c = new Object();

    /* renamed from: d */
    private boolean f155012d = false;

    /* renamed from: e */
    private final Set f155013e = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: f */
    private final C60829bj f155014f = new C60829bj();

    /* renamed from: g */
    private final C57969i f155015g;

    /* renamed from: h */
    private final C57938a f155016h;

    public C57960f(C57969i iVar, C58040b bVar, C57938a aVar) {
        this.f155015g = iVar;
        this.f155010b = bVar;
        this.f155016h = aVar;
    }

    /* renamed from: e */
    private final void m88627e() {
        this.f155014f.mo57298b();
        this.f155009a.mo57356n(C118826c.f331422a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r3.f155015g.mo54574d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r0.isEmpty() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        m88627e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r0.hasNext() == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r1 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if ((r1 instanceof com.google.p4449cd.p4453d.C57955a) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        ((com.google.p4449cd.p4453d.C57955a) r1).mo54562a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return r3.f155009a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo54566a() {
        /*
            r3 = this;
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.lang.Object r1 = r3.f155011c
            monitor-enter(r1)
            boolean r2 = r3.f155012d     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0014
            com.google.common.util.concurrent.SettableFuture r0 = r3.f155009a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            return r0
        L_0x0014:
            r2 = 1
            r3.f155012d = r2     // Catch:{ all -> 0x0047 }
            java.util.Set r2 = r3.f155013e     // Catch:{ all -> 0x0047 }
            r0.addAll(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            com.google.cd.e.i r1 = r3.f155015g
            r1.mo54574d()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002c
            r3.m88627e()
            goto L_0x0044
        L_0x002c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof com.google.p4449cd.p4453d.C57955a
            if (r2 == 0) goto L_0x0030
            com.google.cd.d.a r1 = (com.google.p4449cd.p4453d.C57955a) r1
            r1.mo54562a()
            goto L_0x0030
        L_0x0044:
            com.google.common.util.concurrent.SettableFuture r0 = r3.f155009a
            return r0
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x004a:
            throw r0
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4449cd.p4453d.C57960f.mo54566a():com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final void mo54567b(Runnable runnable) {
        this.f155014f.mo57297a(runnable, new C57959e(this, new C57958d(C57957c.f154998d, (Object) null, getClass(), (Long) null, Long.valueOf(this.f155016h.f154953d.incrementAndGet()), C58013ai.m88769b())));
    }

    /* renamed from: c */
    public final void mo54568c(Object obj) {
        boolean z;
        boolean z2;
        synchronized (this.f155011c) {
            if (this.f155013e.remove(obj)) {
                z = this.f155013e.isEmpty();
                z2 = this.f155012d;
            } else {
                z = false;
                z2 = false;
            }
        }
        if (z) {
            this.f155015g.mo54573c();
            if (z2) {
                m88627e();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo54569d(Object obj) {
        synchronized (this.f155011c) {
            if (this.f155012d) {
                return false;
            }
            this.f155013e.add(obj);
            return true;
        }
    }
}
