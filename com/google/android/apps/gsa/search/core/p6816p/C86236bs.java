package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.p4449cd.p4453d.C57960f;

/* renamed from: com.google.android.apps.gsa.search.core.p.bs */
/* compiled from: PG */
public final class C86236bs implements C90964a {

    /* renamed from: a */
    public final C86221bd f233063a;

    /* renamed from: b */
    private final C58833ax f233064b;

    public C86236bs(C86221bd bdVar, C57960f fVar) {
        this.f233064b = C58833ax.m90833j(fVar);
        this.f233063a = bdVar;
    }

    /* renamed from: a */
    public final void mo79903a() {
        this.f233063a.mo79839j();
        C58833ax axVar = this.f233064b;
        if (axVar.mo56113h()) {
            ((C57960f) axVar.mo56107c()).mo54566a();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CacheEntry");
        fVar.mo85285l(this.f233063a);
        if (this.f233064b.mo56113h()) {
            fVar.mo85279c("TaskGraphExecutionContext").mo85276a(C90752i.m148229c(((C57960f) this.f233064b.mo56107c()).toString()));
        }
    }
}
