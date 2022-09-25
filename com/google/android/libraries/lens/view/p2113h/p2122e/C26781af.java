package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.vision.C28168j;
import com.google.android.libraries.lens.view.vision.C28181w;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.lens.view.h.e.af */
/* compiled from: PG */
final class C26781af implements C28168j {

    /* renamed from: a */
    final /* synthetic */ C26784ai f72969a;

    public C26781af(C26784ai aiVar) {
        this.f72969a = aiVar;
    }

    /* renamed from: a */
    public final void mo30749a(C28097c cVar) {
        C28181w wVar = this.f72969a.f72975C;
        long j = cVar.f76484b;
        C58495hd hdVar = cVar.f76493k;
        hdVar.getClass();
        synchronized (wVar.f76694a) {
            SettableFuture settableFuture = (SettableFuture) wVar.f76694a.mo3678e(j);
            if (settableFuture != null) {
                wVar.f76694a.mo3683j(j);
                settableFuture.mo57356n(hdVar);
            }
        }
        this.f72969a.mo32154x(new C26780ae(this, cVar));
    }
}
