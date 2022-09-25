package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.fq */
/* compiled from: PG */
public final class C87055fq extends C86898ct {

    /* renamed from: a */
    public final BitFlags f235195a = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: b */
    public Query f235196b = Query.f252741b;

    public C87055fq(C68214a aVar) {
        super(aVar, 53);
    }

    /* renamed from: a */
    public final boolean mo80721a() {
        return BitFlags.m148144f(this.f235195a.f253762b, 1);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ResultsUiState");
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f235195a.toString()));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f235196b);
        String b = this.f235195a.mo85048b();
        return "ResultsUiState[query=" + valueOf + ", flags=" + b + "]";
    }
}
