package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106556g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.o */
/* compiled from: PG */
public final /* synthetic */ class C106541o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C106544r f297093a;

    public /* synthetic */ C106541o(C106544r rVar) {
        this.f297093a = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C106544r rVar = this.f297093a;
        ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23114)).mo56389s("HeadsetState(%s): stopMonitoring", C106556g.m177338a(rVar.f297110n));
        if (rVar.f297108l) {
            rVar.f297098b.unregisterReceiver(rVar.f297101e);
            rVar.f297108l = false;
        }
        rVar.f297107k = null;
        return C118826c.f331423b;
    }
}
