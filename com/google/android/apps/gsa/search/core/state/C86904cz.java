package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.cz */
/* compiled from: PG */
public final class C86904cz implements C87143ik {

    /* renamed from: a */
    private final C86903cy f234684a;

    /* renamed from: b */
    private final C68214a f234685b;

    public C86904cz(C86903cy cyVar, C68214a aVar) {
        this.f234684a = cyVar;
        this.f234685b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234684a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        if (icVar.mo80754a(((C87052fn) this.f234685b.mo27525b()).f235452J)) {
            C86903cy cyVar = this.f234684a;
            C87052fn fnVar = (C87052fn) this.f234685b.mo27525b();
            if (!cyVar.f234678a.mo84383cP(fnVar.f235177m)) {
                cyVar.f234678a = fnVar.f235177m;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = fnVar.f235187w;
            fnVar.f235187w = false;
            if (z2) {
                cyVar.mo80562b();
            } else if (!z) {
                return;
            }
            this.f234684a.mo80591ar();
        }
    }
}
