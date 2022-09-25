package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.search.Query;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fr */
/* compiled from: PG */
public final class C116715fr implements C87143ik {

    /* renamed from: a */
    private final C116714fq f323683a;

    /* renamed from: b */
    private final C86842bk f323684b;

    /* renamed from: c */
    private final C86842bk f323685c;

    public C116715fr(C116714fq fqVar, C68214a aVar, C68214a aVar2) {
        this.f323683a = fqVar;
        this.f323684b = new C86842bk(aVar);
        this.f323685c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323683a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f323684b.mo80534b(icVar);
        this.f323685c.mo80534b(icVar);
        boolean z = this.f323684b.f234552a;
        if (z || this.f323685c.f234552a) {
            C116714fq fqVar = this.f323683a;
            C86842bk bkVar = this.f323685c;
            if (z || bkVar.f234552a) {
                if (!fqVar.f323678b.mo84383cP(((C116735gk) bkVar.mo80533a()).f323784p)) {
                    fqVar.f323678b = Query.f252741b;
                    fqVar.f323679c = null;
                }
            }
        }
    }
}
