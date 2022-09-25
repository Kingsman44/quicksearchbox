package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C86997dw;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.r */
/* compiled from: PG */
public final class C86966r extends C86898ct implements C86997dw {

    /* renamed from: a */
    public C89062r f234900a = C89062r.f241369a;

    public C86966r(C68214a aVar) {
        super(aVar, 1);
    }

    /* renamed from: e */
    public final void mo80613e(C89062r rVar) {
        if (!this.f234900a.equals(rVar)) {
            this.f234900a = rVar;
            mo80591ar();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ConnectivityState");
        fVar.mo85288o("connectivityInfo", this.f234900a);
    }
}
