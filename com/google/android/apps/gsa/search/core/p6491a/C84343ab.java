package com.google.android.apps.gsa.search.core.p6491a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.search.core.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C84343ab implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C84345ad f229556a;

    /* renamed from: b */
    public final /* synthetic */ Query f229557b;

    public /* synthetic */ C84343ab(C84345ad adVar, Query query) {
        this.f229556a = adVar;
        this.f229557b = query;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C84345ad adVar = this.f229556a;
        Query query = this.f229557b;
        if (!query.mo84412cs() || !((C86124t) adVar.f229562c.mo27525b()).mo79746e(C90086ek.f250344bP)) {
            ((C87052fn) adVar.f229560a.mo27525b()).mo80462q(query);
        } else {
            ((C87052fn) adVar.f229560a.mo27525b()).mo80462q(query.mo84286aW(QueryTriggerType.FOLLOW_ON));
        }
        return C118826c.f331422a;
    }
}
