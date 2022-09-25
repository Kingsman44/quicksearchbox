package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.cm */
/* compiled from: PG */
public final class C116629cm implements C87143ik {

    /* renamed from: a */
    private final C116628cl f323459a;

    /* renamed from: b */
    private final C68214a f323460b;

    public C116629cm(C116628cl clVar, C68214a aVar) {
        this.f323459a = clVar;
        this.f323460b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323459a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        if (icVar.mo80754a(((C116735gk) this.f323460b.mo27525b()).f235452J)) {
            C116628cl clVar = this.f323459a;
            C116735gk gkVar = (C116735gk) this.f323460b.mo27525b();
            if (!clVar.f323450a.mo84383cP(gkVar.f323784p)) {
                clVar.f323450a = gkVar.f323784p;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = gkVar.f323737C;
            gkVar.f323737C = false;
            if (z2) {
                clVar.mo102808g();
            } else if (!z) {
                return;
            }
            this.f323459a.mo80591ar();
        }
    }
}
