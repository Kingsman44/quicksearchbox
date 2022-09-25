package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl;

import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.r */
/* compiled from: PG */
public final /* synthetic */ class C81863r implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81864s f223853a;

    /* renamed from: b */
    public final /* synthetic */ C81848c f223854b;

    public /* synthetic */ C81863r(C81864s sVar, C81848c cVar) {
        this.f223853a = sVar;
        this.f223854b = cVar;
    }

    public final void run() {
        C81864s sVar = this.f223853a;
        C81848c cVar = this.f223854b;
        synchronized (sVar.f223855a) {
            C58976aa aaVar = C58975e.f156826a;
            C81865t tVar = sVar.f223855a;
            tVar.f223867l = cVar;
            if (!((Boolean) ((C83352b) tVar.f223863h).mo76654b()).booleanValue()) {
                sVar.f223855a.mo75377a(false);
            }
        }
        sVar.f223855a.f223868m.mo75369a(7);
    }
}
