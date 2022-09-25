package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.af */
/* compiled from: PG */
final class C117718af implements C117722aj {

    /* renamed from: a */
    final /* synthetic */ C117724al f326719a;

    public C117718af(C117724al alVar) {
        this.f326719a = alVar;
    }

    /* renamed from: a */
    public final void mo103434a(C87726bh bhVar) {
        this.f326719a.f326760m = bhVar != C87726bh.IDLE;
        if (!this.f326719a.f326761n.isEmpty()) {
            C117724al alVar = this.f326719a;
            alVar.f326754g.add(alVar.f326761n);
            this.f326719a.f326761n = new ArrayList();
        }
    }
}
