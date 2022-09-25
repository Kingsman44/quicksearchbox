package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.ew */
/* compiled from: PG */
public final class C87029ew implements C87143ik {

    /* renamed from: a */
    private final C87028ev f235082a;

    /* renamed from: b */
    private final C86842bk f235083b;

    /* renamed from: c */
    private final C86842bk f235084c;

    public C87029ew(C87028ev evVar, C68214a aVar, C68214a aVar2) {
        this.f235082a = evVar;
        this.f235083b = new C86842bk(aVar);
        this.f235084c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235082a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f235083b.mo80534b(icVar);
        this.f235084c.mo80534b(icVar);
        boolean z = this.f235083b.f234552a;
        if (z || this.f235084c.f234552a) {
            C87028ev evVar = this.f235082a;
            C86842bk bkVar = this.f235084c;
            if (z || bkVar.f234552a) {
                if (!evVar.f235077f.mo84383cP(((C87052fn) bkVar.mo80533a()).f235177m)) {
                    evVar.f235077f = Query.f252741b;
                    Query query = null;
                    evVar.f235078g = null;
                    if (!((C87052fn) evVar.f235073b.mo27525b()).f235177m.mo84435dP()) {
                        Query query2 = ((C87052fn) evVar.f235073b.mo27525b()).f235177m;
                        if (!evVar.f235077f.mo84383cP(query2) && evVar.mo80644g(query2)) {
                            evVar.f235077f = query2;
                            evVar.f235078g = null;
                            query = evVar.f235077f;
                        }
                    }
                    if (query != null) {
                        evVar.f235075d.mo28211k(evVar.f235074c.mo78693c(query), "Pumpkin producer graph callback", new C87027eu(evVar, query));
                    }
                }
            }
        }
    }
}
