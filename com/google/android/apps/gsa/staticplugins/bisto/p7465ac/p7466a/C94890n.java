package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.content.IntentFilter;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.n */
/* compiled from: PG */
public final /* synthetic */ class C94890n implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94892p f265414a;

    public /* synthetic */ C94890n(C94892p pVar) {
        this.f265414a = pVar;
    }

    public final void run() {
        C94892p pVar = this.f265414a;
        C58976aa aaVar = C58975e.f156826a;
        C94891o oVar = new C94891o(pVar);
        pVar.f265425j = oVar;
        pVar.f265417b.registerReceiver(oVar, new IntentFilter("com.google.android.apps.gsa.bisto.GACS_DEVICE_COMMAND"));
    }
}
