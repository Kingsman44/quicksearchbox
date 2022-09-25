package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gn */
/* compiled from: PG */
public final class C116738gn extends C116780ib {

    /* renamed from: a */
    public final C85089a f323801a;

    /* renamed from: b */
    public C58833ax f323802b = C58836b.f156633a;

    public C116738gn(C68214a aVar, C85089a aVar2) {
        super(aVar, 195);
        this.f323801a = aVar2;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("RecentlyState");
        fVar.mo85279c("has last query").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323802b.mo56113h())));
        if (this.f323802b.mo56113h()) {
            fVar.mo85279c("last query").mo85276a(C90752i.m148234h(this.f323802b.mo56107c()));
        }
    }
}
