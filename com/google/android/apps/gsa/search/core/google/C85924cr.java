package com.google.android.apps.gsa.search.core.google;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85982d;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6990an.C89213d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60602vz;
import com.google.common.p4552o.amo;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.google.cr */
/* compiled from: PG */
public final class C85924cr implements C85983e {

    /* renamed from: a */
    private final C68214a f232310a;

    /* renamed from: b */
    private final C68214a f232311b;

    public C85924cr(C68214a aVar, C68214a aVar2) {
        this.f232310a = aVar;
        this.f232311b = aVar2;
    }

    /* renamed from: a */
    public final void mo79558a(Query query, C85981c cVar) {
        if (query.mo84392cY()) {
            mo79559b(query, cVar, false, true);
        }
        String bn = query.mo84355bn();
        C58976aa aaVar = C58975e.f156826a;
        C85982d.m138242a(cVar, bn);
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        mo79558a(query, cVar);
    }

    /* renamed from: b */
    public final void mo79559b(Query query, C85981c cVar, boolean z, boolean z2) {
        C60456qs qsVar = query.f252783v;
        if (qsVar == null || (qsVar.f163604a & 4) == 0) {
            C58976aa aaVar = C58975e.f156826a;
            cVar.f232495c.remove("gs_lp");
            Map map = cVar.f232499g;
            if (map != null) {
                map.remove("gs_lp");
                return;
            }
            return;
        }
        apd apd = qsVar.f163607d;
        if (apd == null) {
            apd = apd.f159555aA;
        }
        amt amt = (amt) apd.toBuilder();
        if (z) {
            amt.copyOnWrite();
            apd apd2 = (apd) amt.instance;
            apd2.f159612d = 4;
            apd2.f159583a |= 1;
        }
        C89213d.m145119a(amt);
        String encodeToString = Base64.encodeToString(((apd) amt.build()).toByteArray(), 11);
        C58976aa aaVar2 = C58975e.f156826a;
        cVar.mo79638d("gs_lp", encodeToString);
        if (z2) {
            ((C88533b) this.f232311b.mo27525b()).mo82172c(query.f252749G, 148, qsVar, (C89037bh) this.f232310a.mo27525b(), query.mo84474eb(), (amo) null, (C60602vz) null);
        }
    }
}
