package com.google.android.apps.gsa.search.core.p6491a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.a.ad */
/* compiled from: PG */
public final class C84345ad implements C84380z {

    /* renamed from: a */
    public final C68214a f229560a;

    /* renamed from: b */
    public final C68214a f229561b;

    /* renamed from: c */
    public final C68214a f229562c;

    /* renamed from: d */
    private final C22871g f229563d;

    public C84345ad(C22871g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f229563d = gVar;
        this.f229560a = aVar;
        this.f229561b = aVar2;
        this.f229562c = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo77880a(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f229563d.mo28201a("commit voice query", new C84343ab(this, query));
    }

    /* renamed from: b */
    public final void mo77881b(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        this.f229563d.mo28212l("handle legacy assistant response", new C84344ac(this, query));
    }

    /* renamed from: c */
    public final void mo77882c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f229563d.mo28212l("clear action state", new C84342aa(this));
    }
}
