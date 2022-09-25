package com.google.android.apps.gsa.p8885y.p8886a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C59793fu;
import com.google.common.p4552o.C59794fv;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.y.a.d */
/* compiled from: PG */
public final class C118831d {

    /* renamed from: a */
    public final AtomicInteger f331439a = new AtomicInteger();

    /* renamed from: b */
    private final C21370a f331440b;

    /* renamed from: c */
    private final Deque f331441c;

    /* renamed from: d */
    private final C118829b f331442d = new C118829b();

    /* renamed from: e */
    private C118829b f331443e;

    /* renamed from: f */
    private final C118830c f331444f;

    public C118831d(C21370a aVar, C118830c cVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f331441c = arrayDeque;
        this.f331444f = cVar;
        this.f331440b = aVar;
        C118829b bVar = new C118829b();
        this.f331443e = bVar;
        arrayDeque.addFirst(bVar);
    }

    /* renamed from: h */
    private final C59794fv m197228h(C118829b bVar) {
        C59793fu fuVar = (C59793fu) C59794fv.f161570i.createBuilder();
        int i = bVar.f331434c;
        fuVar.copyOnWrite();
        C59794fv fvVar = (C59794fv) fuVar.instance;
        fvVar.f161572a |= 64;
        fvVar.f161579h = i;
        long j = bVar.f331433b;
        fuVar.copyOnWrite();
        C59794fv fvVar2 = (C59794fv) fuVar.instance;
        fvVar2.f161572a |= 32;
        fvVar2.f161578g = j;
        long j2 = bVar.f331432a;
        fuVar.copyOnWrite();
        C59794fv fvVar3 = (C59794fv) fuVar.instance;
        fvVar3.f161572a |= 16;
        fvVar3.f161577f = j2;
        C118575h hVar = this.f331444f.f331436b;
        fuVar.copyOnWrite();
        C59794fv fvVar4 = (C59794fv) fuVar.instance;
        fvVar4.f161573b = hVar.f330812sk;
        fvVar4.f161572a |= 1;
        C118575h hVar2 = this.f331444f.f331437c;
        fuVar.copyOnWrite();
        C59794fv fvVar5 = (C59794fv) fuVar.instance;
        fvVar5.f161574c = hVar2.f330812sk;
        fvVar5.f161572a |= 2;
        int i2 = this.f331444f.f331438d;
        fuVar.copyOnWrite();
        C59794fv fvVar6 = (C59794fv) fuVar.instance;
        fvVar6.f161572a |= 8;
        fvVar6.f161576e = i2;
        C118569b bVar2 = this.f331444f.f331435a;
        fuVar.copyOnWrite();
        C59794fv fvVar7 = (C59794fv) fuVar.instance;
        fvVar7.f161575d = bVar2.f329776ks;
        fvVar7.f161572a |= 4;
        return (C59794fv) fuVar.build();
    }

    /* renamed from: i */
    private final void m197229i() {
        if (this.f331439a.get() > 0) {
            synchronized (this) {
                while (this.f331439a.get() > 0) {
                    C118829b bVar = new C118829b();
                    this.f331443e = bVar;
                    this.f331441c.addFirst(bVar);
                    this.f331439a.decrementAndGet();
                }
            }
        }
    }

    /* renamed from: a */
    public final long mo104019a() {
        return this.f331440b.mo26872d();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.p4552o.C59794fv mo104020b(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 <= 0) goto L_0x004f
            java.util.Deque r0 = r8.f331441c     // Catch:{ all -> 0x004c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x000c
            goto L_0x004f
        L_0x000c:
            r8.m197229i()     // Catch:{ all -> 0x004c }
            com.google.android.apps.gsa.y.a.b r0 = new com.google.android.apps.gsa.y.a.b     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            java.util.Deque r1 = r8.f331441c     // Catch:{ all -> 0x004c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004c }
            r2 = 0
        L_0x001b:
            if (r2 >= r9) goto L_0x0046
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004c }
            com.google.android.apps.gsa.y.a.b r3 = (com.google.android.apps.gsa.p8885y.p8886a.C118829b) r3     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0043
            int r4 = r0.f331434c     // Catch:{ all -> 0x004c }
            int r5 = r3.f331434c     // Catch:{ all -> 0x004c }
            int r4 = r4 + r5
            r0.f331434c = r4     // Catch:{ all -> 0x004c }
            long r4 = r0.f331433b     // Catch:{ all -> 0x004c }
            long r6 = r3.f331433b     // Catch:{ all -> 0x004c }
            long r4 = r4 + r6
            r0.f331433b = r4     // Catch:{ all -> 0x004c }
            long r4 = r0.f331432a     // Catch:{ all -> 0x004c }
            long r6 = r3.f331432a     // Catch:{ all -> 0x004c }
            long r3 = java.lang.Math.max(r4, r6)     // Catch:{ all -> 0x004c }
            r0.f331432a = r3     // Catch:{ all -> 0x004c }
        L_0x0043:
            int r2 = r2 + 1
            goto L_0x001b
        L_0x0046:
            com.google.common.o.fv r9 = r8.m197228h(r0)     // Catch:{ all -> 0x004c }
            monitor-exit(r8)
            return r9
        L_0x004c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x004f:
            monitor-exit(r8)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8885y.p8886a.C118831d.mo104020b(int):com.google.common.o.fv");
    }

    /* renamed from: c */
    public final synchronized C59794fv mo104021c() {
        return m197228h(this.f331442d);
    }

    /* renamed from: d */
    public final synchronized C59794fv mo104022d() {
        C59794fv c;
        c = mo104021c();
        C118829b bVar = this.f331442d;
        bVar.f331432a = 0;
        bVar.f331433b = 0;
        bVar.f331434c = 0;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo104023e() {
        this.f331441c.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo104024f(int i) {
        int size = this.f331441c.size() - i;
        for (int i2 = 0; i2 < size; i2++) {
            this.f331441c.removeLast();
        }
    }

    /* renamed from: g */
    public final void mo104025g(long j) {
        m197229i();
        synchronized (this) {
            this.f331442d.mo104016a(j);
            this.f331443e.mo104016a(j);
        }
    }
}
