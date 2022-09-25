package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.shared.speech.p7139a.C90522n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.s3.k */
/* compiled from: PG */
public final class C84293k implements C84332u {

    /* renamed from: a */
    private int f229397a = 0;

    /* renamed from: a */
    public final synchronized int mo77828a() {
        return 1000;
    }

    /* renamed from: b */
    public final synchronized C90523o mo77829b(C66611ci ciVar) {
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a != C66610ch.DONE_ERROR) {
            return null;
        }
        return new C90522n(ciVar.f181210c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo77830c(com.google.android.apps.gsa.shared.speech.p7139a.C90523o r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f229397a     // Catch:{ all -> 0x0037 }
            r1 = 3
            r2 = 0
            if (r0 < r1) goto L_0x000e
            r4 = 27
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)
            return r2
        L_0x000e:
            boolean r0 = r4 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90520l     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0016
            boolean r0 = r4 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90522n     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x001c
        L_0x0016:
            boolean r0 = r4.mo79846d()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
        L_0x001c:
            int r0 = r3.f229397a     // Catch:{ all -> 0x0037 }
            r1 = 1
            int r0 = r0 + r1
            r3.f229397a = r0     // Catch:{ all -> 0x0037 }
            boolean r4 = r4.mo79846d()     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x002e
            r4 = 26
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r4)     // Catch:{ all -> 0x0037 }
            goto L_0x0033
        L_0x002e:
            r4 = 25
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r4)     // Catch:{ all -> 0x0037 }
        L_0x0033:
            monitor-exit(r3)
            return r1
        L_0x0035:
            monitor-exit(r3)
            return r2
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.C84293k.mo77830c(com.google.android.apps.gsa.shared.speech.a.o):boolean");
    }
}
