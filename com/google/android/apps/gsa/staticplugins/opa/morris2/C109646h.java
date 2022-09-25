package com.google.android.apps.gsa.staticplugins.opa.morris2;

import android.content.IntentFilter;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h */
/* compiled from: PG */
public final /* synthetic */ class C109646h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109710m f305361a;

    public /* synthetic */ C109646h(C109710m mVar) {
        this.f305361a = mVar;
    }

    public final void run() {
        C109710m mVar = this.f305361a;
        mVar.f305638m.mo98021b();
        if (mVar.f305631f.mo79746e(C90051dc.f248887bp)) {
            C58976aa aaVar = C58975e.f156826a;
            mVar.f305644s = new C109706j(mVar);
            mVar.f305627b.registerReceiver(mVar.f305644s, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }
}
