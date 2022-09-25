package com.google.android.libraries.assistant.p1484g.p1502d;

import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.d.u */
/* compiled from: PG */
abstract class C18184u implements C18181r {

    /* renamed from: a */
    private final Optional f51676a;

    /* renamed from: b */
    private final Object f51677b = new Object();

    /* renamed from: c */
    private Optional f51678c = Optional.empty();

    /* renamed from: d */
    private final CopyOnWriteArraySet f51679d = new CopyOnWriteArraySet();

    public C18184u(Optional optional) {
        this.f51676a = optional;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r1.f51678c.isPresent() == false) goto L_0x000d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo23645a(boolean r2) {
        /*
            r1 = this;
            java.lang.Object r0 = r1.f51677b
            monitor-enter(r0)
            if (r2 == 0) goto L_0x000d
            j$.util.Optional r2 = r1.f51678c     // Catch:{ all -> 0x0025 }
            boolean r2 = r2.isPresent()     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0017
        L_0x000d:
            com.google.common.util.concurrent.cx r2 = r1.mo23642f()     // Catch:{ all -> 0x0025 }
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)     // Catch:{ all -> 0x0025 }
            r1.f51678c = r2     // Catch:{ all -> 0x0025 }
        L_0x0017:
            j$.util.Optional r2 = r1.f51678c     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0025 }
            com.google.common.util.concurrent.cx r2 = (com.google.common.util.concurrent.C60870cx) r2     // Catch:{ all -> 0x0025 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92901j(r2)     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0025:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1484g.p1502d.C18184u.mo23645a(boolean):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final Optional mo23646c() {
        return this.f51676a.map(C18182s.f51674a);
    }

    /* renamed from: d */
    public final Optional mo23647d() {
        return this.f51676a.map(C18183t.f51675a);
    }

    /* renamed from: e */
    public final void mo23648e(C18180q qVar) {
        this.f51679d.add(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C60870cx mo23642f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo23649g() {
        synchronized (this.f51677b) {
            this.f51678c = Optional.empty();
        }
    }

    /* renamed from: h */
    public final void mo23650h() {
        mo23649g();
        Iterator it = this.f51679d.iterator();
        while (it.hasNext()) {
            ((C18180q) it.next()).mo23644m();
        }
    }
}
