package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C96756aa implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C86124t f270639a;

    public /* synthetic */ C96756aa(C86124t tVar) {
        this.f270639a = tVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C86124t tVar = this.f270639a;
        if (tVar.mo79746e(C90126fx.f251158dY)) {
            return C96761af.PRE_MIGRATION;
        }
        if (tVar.mo79746e(C90126fx.f251156dW)) {
            return C96761af.ENABLED;
        }
        return C96761af.DISABLE_ALL;
    }
}
