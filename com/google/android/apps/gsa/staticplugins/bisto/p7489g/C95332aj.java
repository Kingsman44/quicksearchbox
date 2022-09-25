package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.aj */
/* compiled from: PG */
public final /* synthetic */ class C95332aj implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C95345aw f266722a;

    public /* synthetic */ C95332aj(C95345aw awVar) {
        this.f266722a = awVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C95345aw awVar = this.f266722a;
        Void voidR = (Void) obj;
        C124548d b = ((C89492cd) awVar.f266754h.mo27525b()).mo83401b(awVar.f266748b);
        if (b != null && b.mo106497ak()) {
            boolean b2 = awVar.f266755i.mo88940b(b);
            C59104x b3 = C95345aw.f266745a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "BistoBluetoothDevice");
            ((C59052c) ((C59052c) b3).mo56372aa(14936)).mo56389s("Setting hotword enablement: %b", Boolean.valueOf(b2));
            awVar.f266753g.mo89296i(awVar, b2);
        }
        ((C89492cd) awVar.f266754h.mo27525b()).mo83363E(awVar.f266748b);
        awVar.f266753g.mo89289b(awVar);
        return null;
    }
}
