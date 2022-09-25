package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;

/* renamed from: com.google.android.apps.gsa.tasks.n */
/* compiled from: PG */
final class C118555n implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C118556o f329152a;

    /* renamed from: b */
    private final C118557p f329153b;

    public C118555n(C118556o oVar, C118557p pVar) {
        this.f329152a = oVar;
        this.f329153b = pVar;
    }

    /* renamed from: c */
    private final void m196830c() {
        synchronized (this.f329152a.f329155b) {
            if (this.f329152a.f329155b.peek() == this.f329153b) {
                this.f329152a.f329155b.remove();
                C118557p pVar = (C118557p) this.f329152a.f329155b.peek();
                if (pVar != null) {
                    this.f329152a.mo103749b(pVar);
                } else {
                    C118556o oVar = this.f329152a;
                    int i = oVar.f329157d;
                    if (i > 1) {
                        oVar.f329158e.f329167g.mo103740d(oVar.f329154a, (long) i);
                        this.f329152a.f329158e.f329167g.mo103737a();
                    }
                    this.f329152a.f329156c.mo57356n(C118826c.f331422a);
                }
            }
        }
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        m196830c();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        m196830c();
    }
}
