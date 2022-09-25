package com.google.android.libraries.search.location.web;

import com.google.android.libraries.search.location.p3029a.C38657ca;
import com.google.android.libraries.search.location.p3029a.C38658cb;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43942s;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.location.web.f */
/* compiled from: PG */
public final class C38723f implements C43945v, C38657ca {

    /* renamed from: a */
    private final C43942s f102247a;

    /* renamed from: b */
    private final C60887da f102248b;

    /* renamed from: c */
    private final Object f102249c = new Object();

    /* renamed from: d */
    private volatile C60870cx f102250d;

    public C38723f(C43904a aVar, C38658cb cbVar, C60887da daVar) {
        this.f102247a = new C43942s(aVar);
        this.f102248b = daVar;
        cbVar.mo41544a(this);
        aVar.mo46410c().mo46896b(new C38722e(this, cbVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        mo41584c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41543a(com.google.android.libraries.search.location.p3029a.C38633by r3) {
        /*
            r2 = this;
            com.google.android.libraries.search.location.a.by r0 = com.google.android.libraries.search.location.p3029a.C38633by.DO_NOT_USE
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r2.f102249c
            monitor-enter(r3)
            com.google.common.util.concurrent.cx r0 = r2.f102250d     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0036 }
            boolean r0 = com.google.android.libraries.p1623at.p1632e.C19559g.m37305d(r0)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x002d
        L_0x001b:
            com.google.common.util.concurrent.da r0 = r2.f102248b     // Catch:{ all -> 0x0036 }
            com.google.android.libraries.search.location.web.d r1 = new com.google.android.libraries.search.location.web.d     // Catch:{ all -> 0x0036 }
            r1.<init>(r2)     // Catch:{ all -> 0x0036 }
            java.lang.Runnable r1 = com.google.apps.tiktok.tracing.C47810es.m84977q(r1)     // Catch:{ all -> 0x0036 }
            com.google.common.util.concurrent.cx r0 = r0.mo19398a(r1)     // Catch:{ all -> 0x0036 }
            r2.f102250d = r0     // Catch:{ all -> 0x0036 }
            r0 = 0
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0039
            r2.mo41584c()
            return
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.location.web.C38723f.mo41543a(com.google.android.libraries.search.location.a.by):void");
    }

    /* renamed from: b */
    public final void mo41583b() {
        synchronized (this.f102249c) {
            if (this.f102250d != null) {
                this.f102250d.cancel(true);
                this.f102250d = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo41584c() {
        mo41583b();
        this.f102247a.mo46948a();
    }
}
