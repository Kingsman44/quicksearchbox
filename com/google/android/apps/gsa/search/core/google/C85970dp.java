package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58837ba;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.search.core.google.dp */
/* compiled from: PG */
public final class C85970dp implements C85983e {

    /* renamed from: a */
    public final C58881cr f232479a;

    public C85970dp(C58881cr crVar) {
        this.f232479a = crVar;
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        StringBuilder sb = new StringBuilder((String) this.f232479a.mo6453a());
        String e = C58837ba.m90856e(query.mo84347bf("opa-screenful-user-agent-suffix"));
        if (e != null) {
            sb.append(' ');
            sb.append(e);
        }
        String e2 = C58837ba.m90856e(query.mo84347bf("user-agent-suffix"));
        if (e2 != null) {
            sb.append(' ');
            sb.append(e2);
        }
        cVar.mo79637c(cVar.f232497e, "User-Agent", sb.toString());
    }
}
