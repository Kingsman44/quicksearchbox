package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60470rb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ai */
/* compiled from: PG */
public final /* synthetic */ class C96078ai implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C96078ai f268997a = new C96078ai();

    private /* synthetic */ C96078ai() {
    }

    public final Object apply(Object obj) {
        int i;
        C86053n nVar = (C86053n) obj;
        C59104x b = C96082am.f269003a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AuthTokenCheckerSeq");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(16943);
        C60470rb rbVar = nVar.f232633b;
        if (rbVar == null) {
            i = -1;
        } else {
            i = rbVar.f163657h;
        }
        cVar.mo56396z("Token status=%d null=%b", i, nVar.f232632a == null);
        return nVar.f232633b == C60470rb.USER_RECOVERABLE_ERROR ? C58833ax.m90833j(nVar.f232634c) : C58836b.f156633a;
    }
}
