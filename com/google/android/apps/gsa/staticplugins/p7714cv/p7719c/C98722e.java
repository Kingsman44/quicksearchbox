package com.google.android.apps.gsa.staticplugins.p7714cv.p7719c;

import com.google.android.apps.gsa.p6487s3.C84332u;
import com.google.android.apps.gsa.shared.speech.p7139a.C90522n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.c.e */
/* compiled from: PG */
public final class C98722e implements C84332u {

    /* renamed from: a */
    private final C58881cr f275761a;

    /* renamed from: b */
    private final C21370a f275762b;

    /* renamed from: c */
    private int f275763c = -1;

    /* renamed from: d */
    private final long f275764d;

    /* renamed from: e */
    private int f275765e;

    public C98722e(C58881cr crVar, C21370a aVar) {
        this.f275761a = crVar;
        this.f275762b = aVar;
        this.f275764d = aVar.mo26870b();
    }

    /* renamed from: a */
    public final synchronized int mo77828a() {
        return 0;
    }

    /* renamed from: b */
    public final synchronized C90523o mo77829b(C66611ci ciVar) {
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a == C66610ch.DONE_ERROR) {
            return new C90522n(ciVar.f181210c);
        }
        this.f275763c = 0;
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo77830c(com.google.android.apps.gsa.shared.speech.p7139a.C90523o r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f275763c     // Catch:{ all -> 0x0068 }
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r8 = 27
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r8)     // Catch:{ all -> 0x0068 }
            monitor-exit(r7)
            return r1
        L_0x000d:
            r2 = -1
            if (r0 != r2) goto L_0x0028
            com.google.common.base.cr r0 = r7.f275761a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ all -> 0x0068 }
            com.google.al.c.c.b.aw r0 = (com.google.p395al.p408c.p414c.p416b.C8480aw) r0     // Catch:{ all -> 0x0068 }
            int r0 = r0.f29437a     // Catch:{ all -> 0x0068 }
            r7.f275763c = r0     // Catch:{ all -> 0x0068 }
            com.google.common.base.cr r0 = r7.f275761a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ all -> 0x0068 }
            com.google.al.c.c.b.aw r0 = (com.google.p395al.p408c.p414c.p416b.C8480aw) r0     // Catch:{ all -> 0x0068 }
            int r0 = r0.f29438b     // Catch:{ all -> 0x0068 }
            r7.f275765e = r0     // Catch:{ all -> 0x0068 }
        L_0x0028:
            long r3 = r7.f275764d     // Catch:{ all -> 0x0068 }
            int r0 = r7.f275765e     // Catch:{ all -> 0x0068 }
            long r5 = (long) r0     // Catch:{ all -> 0x0068 }
            long r3 = r3 + r5
            com.google.android.libraries.f.a r0 = r7.f275762b     // Catch:{ all -> 0x0068 }
            long r5 = r0.mo26870b()     // Catch:{ all -> 0x0068 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            r8 = 28
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r8)     // Catch:{ all -> 0x0068 }
            monitor-exit(r7)
            return r1
        L_0x003f:
            boolean r0 = r8 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90520l     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0047
            boolean r0 = r8 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90522n     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x004d
        L_0x0047:
            boolean r0 = r8.mo79846d()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0066
        L_0x004d:
            int r0 = r7.f275763c     // Catch:{ all -> 0x0068 }
            int r0 = r0 + r2
            r7.f275763c = r0     // Catch:{ all -> 0x0068 }
            boolean r8 = r8.mo79846d()     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x005e
            r8 = 26
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r8)     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x005e:
            r8 = 25
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r8)     // Catch:{ all -> 0x0068 }
        L_0x0063:
            monitor-exit(r7)
            r8 = 1
            return r8
        L_0x0066:
            monitor-exit(r7)
            return r1
        L_0x0068:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98722e.mo77830c(com.google.android.apps.gsa.shared.speech.a.o):boolean");
    }
}
