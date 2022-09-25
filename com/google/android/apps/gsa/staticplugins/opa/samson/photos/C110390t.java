package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.p4715m.p4716a.p4720b.p4721a.C62691s;
import com.google.p4715m.p4716a.p4720b.p4721a.C62692t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.t */
/* compiled from: PG */
public final /* synthetic */ class C110390t implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110318ad f307668a;

    public /* synthetic */ C110390t(C110318ad adVar) {
        this.f307668a = adVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        String g;
        C110318ad adVar = this.f307668a;
        String b = adVar.f307477d.mo79727b();
        C73845bq bqVar = (C73845bq) adVar.f307476c.mo6453a();
        if (b == null || bqVar == null || bqVar.mo65330d() == null || (g = adVar.f307478e.mo79673g()) == null) {
            return null;
        }
        String str = b + "|" + bqVar.mo65330d();
        C62691s sVar = (C62691s) C62692t.f169255d.createBuilder();
        sVar.copyOnWrite();
        C62692t tVar = (C62692t) sVar.instance;
        tVar.f169257a |= 1;
        tVar.f169258b = g;
        sVar.copyOnWrite();
        C62692t tVar2 = (C62692t) sVar.instance;
        tVar2.f169257a |= 2;
        tVar2.f169259c = str;
        return (C62692t) sVar.build();
    }
}
