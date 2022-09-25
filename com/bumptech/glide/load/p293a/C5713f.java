package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5955n;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bumptech.glide.load.a.f */
/* compiled from: PG */
public final class C5713f {

    /* renamed from: a */
    final Map f17204a = new HashMap();

    /* renamed from: b */
    public final ReferenceQueue f17205b = new ReferenceQueue();

    /* renamed from: c */
    public volatile boolean f17206c;

    /* renamed from: d */
    public volatile C5711d f17207d;

    public C5713f() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C5684b());
        newSingleThreadExecutor.execute(new C5705c(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bumptech.glide.load.p293a.C5671an mo12221a(com.bumptech.glide.load.C5955n r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.f17204a     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.a.e r2 = (com.bumptech.glide.load.p293a.C5712e) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.a.an r0 = (com.bumptech.glide.load.p293a.C5671an) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo12223c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p293a.C5713f.mo12221a(com.bumptech.glide.load.n):com.bumptech.glide.load.a.an");
    }

    /* renamed from: b */
    public final synchronized void mo12222b(C5955n nVar, C5671an anVar) {
        C5712e eVar = (C5712e) this.f17204a.put(nVar, new C5712e(nVar, anVar, this.f17205b));
        if (eVar != null) {
            eVar.f17203c = null;
            eVar.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12223c(C5712e eVar) {
        synchronized (this) {
            this.f17204a.remove(eVar.f17201a);
            if (eVar.f17202b) {
                C5679av avVar = eVar.f17203c;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo12224d(C5955n nVar) {
        C5712e eVar = (C5712e) this.f17204a.remove(nVar);
        if (eVar != null) {
            eVar.f17203c = null;
            eVar.clear();
        }
    }
}
