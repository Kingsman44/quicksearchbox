package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.d */
/* compiled from: PG */
public final /* synthetic */ class C87630d implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C87625ad f236887a;

    public /* synthetic */ C87630d(C87625ad adVar) {
        this.f236887a = adVar;
    }

    public final void run() {
        C87625ad adVar = this.f236887a;
        Query query = adVar.f236838ao;
        if (query != null && !query.equals(adVar.f236844au)) {
            if (adVar.f236844au.mo84407cn()) {
                Query query2 = adVar.f236838ao;
                query2.getClass();
                adVar.f236838ao = query2.mo84250M();
            }
            Query query3 = adVar.f236838ao;
            query3.getClass();
            C58976aa aaVar = C58975e.f156826a;
            if (TextUtils.equals(adVar.f236844au.f252768g, query3.f252768g) || query3.mo84420dA() || query3.mo84369cB() || (adVar.f236792V && query3.f252780s != adVar.f236844au.f252780s && !query3.mo84385cR())) {
                if (adVar.f236830ag) {
                    query3 = query3.mo84277aN().mo84265aB();
                }
                adVar.f236844au = query3;
                adVar.mo81800ag(C87625ad.m142450aq(adVar.f236831ah));
                adVar.mo81798ae(query3, true);
            }
        }
        adVar.f236838ao = null;
    }
}
