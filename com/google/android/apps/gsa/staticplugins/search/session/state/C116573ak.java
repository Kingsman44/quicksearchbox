package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ak */
/* compiled from: PG */
public final class C116573ak implements C87143ik {

    /* renamed from: a */
    private final C116572aj f323293a;

    /* renamed from: b */
    private final C68214a f323294b;

    public C116573ak(C116572aj ajVar, C68214a aVar) {
        this.f323293a = ajVar;
        this.f323294b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323293a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C86792g) this.f323294b.mo27525b()).mo80627am())) {
            C116572aj ajVar = this.f323293a;
            C86792g gVar = (C86792g) this.f323294b.mo27525b();
            long a = gVar.mo80447f().mo81991a();
            boolean z = true;
            if (true != ajVar.mo102780g()) {
                a = 0;
            }
            if (a != ajVar.f323290a) {
                C58976aa aaVar = C58975e.f156826a;
                long j = ajVar.f323290a;
                ajVar.f323290a = a;
                ajVar.f323291b = false;
            } else {
                z = false;
            }
            if (ajVar.f323291b && gVar.mo80445c() != 0) {
                ajVar.f323291b = false;
            } else if (!z) {
                return;
            }
            this.f323293a.mo80591ar();
        }
    }
}
