package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.au */
/* compiled from: PG */
final class C95343au implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f266743a;

    /* renamed from: b */
    final /* synthetic */ C95345aw f266744b;

    public C95343au(C95345aw awVar, String str) {
        this.f266744b = awVar;
        this.f266743a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95345aw.f266745a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoBluetoothDevice");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(14927)).mo56389s("Failed to get deviceinfo for %s", this.f266743a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C124548d dVar = (C124548d) obj;
        if (dVar != null) {
            this.f266744b.f266752f.set(dVar.mo106508g() != C124707e.INPUT_ONLY_MODE);
        }
    }
}
