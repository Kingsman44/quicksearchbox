package com.google.p4648g.p4649a;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.p5463a.C69530n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.g.a.d */
/* compiled from: PG */
public final class C61637d implements C61634a {

    /* renamed from: a */
    public final C71788b f166535a;

    /* renamed from: b */
    public final ReentrantLock f166536b = new ReentrantLock();

    /* renamed from: c */
    public C69530n f166537c = new C69530n();

    public C61637d(C71788b bVar) {
        C69664n.m101061g(bVar, "mutex");
        this.f166535a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo58155a(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.p4648g.p4649a.C61635b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.g.a.b r0 = (com.google.p4648g.p4649a.C61635b) r0
            int r1 = r0.f166532d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166532d = r1
            goto L_0x0018
        L_0x0013:
            com.google.g.a.b r0 = new com.google.g.a.b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f166530b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f166532d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x003a
            if (r2 == r3) goto L_0x0032
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0032:
            java.lang.Object r0 = r0.f166529a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p5462h.C69714l.m101134b(r9)
            goto L_0x0098
        L_0x003a:
            p5462h.C69714l.m101134b(r9)
            goto L_0x007f
        L_0x003e:
            java.lang.Object r2 = r0.f166529a
            com.google.g.a.d r2 = (com.google.p4648g.p4649a.C61637d) r2
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x0046 }
            goto L_0x006d
        L_0x0046:
            r9 = move-exception
            goto L_0x0085
        L_0x0048:
            p5462h.C69714l.m101134b(r9)
            java.util.concurrent.locks.ReentrantLock r9 = r8.f166536b
            r9.lock()
            kotlinx.coroutines.j.b r2 = r8.f166535a     // Catch:{ all -> 0x0099 }
            r2.mo63026c(r6)     // Catch:{ all -> 0x0099 }
            kotlinx.coroutines.cs r2 = new kotlinx.coroutines.cs     // Catch:{ all -> 0x0099 }
            r2.<init>(r6)     // Catch:{ all -> 0x0099 }
            h.a.n r7 = r8.f166537c     // Catch:{ all -> 0x0099 }
            r7.mo61321j(r2)     // Catch:{ all -> 0x0099 }
            r9.unlock()
            r0.f166529a = r8     // Catch:{ all -> 0x0083 }
            r0.f166532d = r5     // Catch:{ all -> 0x0083 }
            java.lang.Object r9 = r2.mo62869o(r0)     // Catch:{ all -> 0x0083 }
            if (r9 == r1) goto L_0x0082
            r2 = r8
        L_0x006d:
            kotlinx.coroutines.dg r9 = kotlinx.coroutines.C71671dg.f191128a
            com.google.g.a.c r3 = new com.google.g.a.c
            r3.<init>(r2, r6)
            r0.f166529a = r6
            r0.f166532d = r4
            java.lang.Object r9 = kotlinx.coroutines.C71803m.m105040a(r9, r3, r0)
            if (r9 != r1) goto L_0x007f
            return r1
        L_0x007f:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0082:
            return r1
        L_0x0083:
            r9 = move-exception
            r2 = r8
        L_0x0085:
            kotlinx.coroutines.dg r4 = kotlinx.coroutines.C71671dg.f191128a
            com.google.g.a.c r5 = new com.google.g.a.c
            r5.<init>(r2, r6)
            r0.f166529a = r9
            r0.f166532d = r3
            java.lang.Object r0 = kotlinx.coroutines.C71803m.m105040a(r4, r5, r0)
            if (r0 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r0 = r9
        L_0x0098:
            throw r0
        L_0x0099:
            r0 = move-exception
            r9.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4648g.p4649a.C61637d.mo58155a(h.c.g):java.lang.Object");
    }
}
