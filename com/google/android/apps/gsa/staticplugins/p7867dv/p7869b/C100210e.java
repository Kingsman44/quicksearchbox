package com.google.android.apps.gsa.staticplugins.p7867dv.p7869b;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dv.b.e */
/* compiled from: PG */
public final /* synthetic */ class C100210e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C100231z f280252a;

    /* renamed from: b */
    public final /* synthetic */ Suggestion f280253b;

    public /* synthetic */ C100210e(C100231z zVar, Suggestion suggestion) {
        this.f280252a = zVar;
        this.f280253b = suggestion;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C100231z zVar = this.f280252a;
        Suggestion suggestion = this.f280253b;
        if (((Boolean) obj).booleanValue()) {
            Query a = zVar.f280289c.mo81002a();
            C58976aa aaVar = C58975e.f156826a;
            zVar.f280290d.mo78761C(a, zVar.f280291e.mo81014a(), zVar.f280289c.mo81003b(), zVar.f280291e.mo81016c(), zVar.f280297k);
        }
        zVar.f280298l.remove(Integer.valueOf(suggestion.f108912m));
    }
}
