package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import android.content.IntentFilter;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C95881a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95937g f268458a;

    public /* synthetic */ C95881a(C95937g gVar) {
        this.f268458a = gVar;
    }

    public final void run() {
        C95937g gVar = this.f268458a;
        C58976aa aaVar = C58975e.f156826a;
        C95936f fVar = new C95936f(gVar);
        gVar.f268629h = fVar;
        gVar.f268627f.registerReceiver(fVar, new IntentFilter("com.google.android.apps.gsa.bisto.ART_OPEN_MIC"));
        gVar.f268627f.registerReceiver(fVar, new IntentFilter("com.google.android.apps.gsa.bisto.ART_CLOSE_MIC"));
    }
}
