package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.shared.speech.p7139a.C90522n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.s3.x */
/* compiled from: PG */
public final class C84335x implements C84332u {

    /* renamed from: a */
    private boolean f229524a;

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
        if (a != C66610ch.DONE_ERROR) {
            return null;
        }
        return new C90522n(ciVar.f181210c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo77830c(com.google.android.apps.gsa.shared.speech.p7139a.C90523o r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f229524a     // Catch:{ all -> 0x0033 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r3 = 27
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r3)     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return r1
        L_0x000d:
            boolean r0 = r3 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90520l     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90522n     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x001b
        L_0x0015:
            boolean r0 = r3.mo79846d()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
        L_0x001b:
            r0 = 1
            r2.f229524a = r0     // Catch:{ all -> 0x0033 }
            boolean r3 = r3.mo79846d()     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x002a
            r3 = 26
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x002f
        L_0x002a:
            r3 = 25
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r3)     // Catch:{ all -> 0x0033 }
        L_0x002f:
            monitor-exit(r2)
            return r0
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.C84335x.mo77830c(com.google.android.apps.gsa.shared.speech.a.o):boolean");
    }
}
