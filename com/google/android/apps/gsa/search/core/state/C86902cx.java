package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6872d.C86917ak;
import com.google.android.apps.gsa.search.core.state.p6872d.C86923aq;
import com.google.android.apps.gsa.search.core.state.p6872d.C86965q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.cx */
/* compiled from: PG */
public final class C86902cx implements C87143ik {

    /* renamed from: a */
    private final C86923aq f234676a;

    /* renamed from: b */
    private final C68214a f234677b;

    public C86902cx(C86923aq aqVar, C68214a aVar) {
        this.f234676a = aqVar;
        this.f234677b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234676a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C86965q) this.f234677b.mo27525b()).f235452J)) {
            C86923aq aqVar = this.f234676a;
            C86965q qVar = (C86965q) this.f234677b.mo27525b();
            C86917ak akVar = (C86917ak) aqVar.f234751a.mo27525b();
            if (akVar.f234729b != ((C86965q) akVar.f234728a.mo27525b()).f234898a) {
                akVar.f234729b = ((C86965q) akVar.f234728a.mo27525b()).f234898a;
                if (!aqVar.f234753c.getBoolean("launcher_shortcut_enabled", false)) {
                    C58976aa aaVar = C58975e.f156826a;
                    aqVar.f234752b.mo78507a();
                }
            }
        }
    }
}
