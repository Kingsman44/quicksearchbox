package com.google.android.apps.gsa.publicsearch;

import android.os.RemoteException;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.publicsearch.w */
/* compiled from: PG */
public final /* synthetic */ class C84224w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84200aa f229222a;

    public /* synthetic */ C84224w(C84200aa aaVar) {
        this.f229222a = aaVar;
    }

    public final void run() {
        C84200aa aaVar = this.f229222a;
        try {
            aaVar.f229196c.asBinder().linkToDeath(aaVar, 0);
        } catch (RemoteException e) {
            C59104x c = C84200aa.f229194a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PublicSession");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7112)).mo56386p("Unable to linkToDeath!");
        }
        aaVar.f229195b.mo81932c();
    }
}
