package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import com.google.android.gms.car.C143197dn;
import com.google.android.gms.car.C143198do;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.c */
/* compiled from: PG */
public final /* synthetic */ class C101373c implements C143198do {

    /* renamed from: a */
    public final /* synthetic */ C101378h f282892a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f282893b;

    public /* synthetic */ C101373c(C101378h hVar, C60870cx cxVar) {
        this.f282892a = hVar;
        this.f282893b = cxVar;
    }

    /* renamed from: a */
    public final void mo20040a(C143197dn dnVar) {
        C101378h hVar = this.f282892a;
        C60870cx cxVar = this.f282893b;
        C59104x d = C101378h.f282901a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarClientTokenFctryImpl");
        ((C59052c) ((C59052c) d).mo56372aa(20091)).mo56389s("ConnectableCarClientToken#onConnectionFailed: result=%s", dnVar);
        hVar.mo92272c(cxVar);
    }
}
