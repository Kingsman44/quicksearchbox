package com.google.android.apps.gsa.staticplugins.p7755cw;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6650ci.C85125e;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88632e;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.cw.a */
/* compiled from: PG */
public final class C99220a extends C86734a implements C85125e {

    /* renamed from: a */
    private final C90931ca f277582a;

    /* renamed from: b */
    private final C88632e f277583b;

    public C99220a(C90931ca caVar, C88632e eVar) {
        super(C118575h.WORKER_REFRESH_ZERO_PREFIX_SUGGESTIONS, "refreshzeroprefixsuggestions");
        this.f277582a = caVar;
        this.f277583b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo78723a(int i, int i2, String str, long j) {
        C58976aa aaVar = C58975e.f156826a;
        C88632e eVar = this.f277583b;
        eVar.f239600d = i;
        eVar.f239599c = i2;
        if (str != null) {
            eVar.f239597a = str;
            if (j != 0) {
                eVar.f239598b = j;
            }
        }
        return this.f277582a.mo85138c(eVar);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
