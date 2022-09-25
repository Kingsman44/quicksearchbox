package com.google.android.apps.gsa.staticplugins.p7388al;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.ab */
/* compiled from: PG */
public final /* synthetic */ class C93925ab implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93927ad f262296a;

    public /* synthetic */ C93925ab(C93927ad adVar) {
        this.f262296a = adVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93927ad adVar = this.f262296a;
        if (((C89062r) obj).mo83040a()) {
            return adVar.f262299b.mo28209i(adVar.f262301d.a(C39226b.TAG_CLASSIC_SERVICES_WIFI), "getWifiConnectionInfoFuture", C93926ac.f262297a);
        }
        ((C59052c) ((C59052c) C93927ad.f262298a.mo56224b()).mo56372aa(19361)).mo56386p("No connected network");
        return C60866ct.f164955a;
    }
}
