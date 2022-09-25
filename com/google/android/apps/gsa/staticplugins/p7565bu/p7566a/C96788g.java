package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60470rb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.g */
/* compiled from: PG */
public final /* synthetic */ class C96788g implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C96788g f270700a = new C96788g();

    private /* synthetic */ C96788g() {
    }

    public final C60870cx apply(Object obj) {
        C86053n nVar = (C86053n) obj;
        Optional ofNullable = Optional.ofNullable(nVar.f232632a);
        if (ofNullable.isPresent()) {
            return C60856cj.m92900i((String) ofNullable.get());
        }
        C58976aa aaVar = C58975e.f156826a;
        C60470rb rbVar = nVar.f232633b;
        return C60856cj.m92899h(new IllegalStateException("No user, or user signed out"));
    }
}
