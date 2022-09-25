package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.p2982x.C38234aq;
import com.google.android.libraries.search.p2904c.p2982x.C38235ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.x.a.aa */
/* compiled from: PG */
final class C38163aa implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C38166ad f101123a;

    public C38163aa(C38166ad adVar) {
        this.f101123a = adVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38166ad.f101128a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
        ((C59052c) ((C59052c) d).mo56372aa(53019)).mo56386p("#audio# Failed to get StopListeningStatus.");
        this.f101123a.mo41299e(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37666hm hmVar = (C37666hm) obj;
        C38166ad adVar = this.f101123a;
        C38234aq aqVar = (C38234aq) C38235ar.f101329c.createBuilder();
        aqVar.copyOnWrite();
        C38235ar arVar = (C38235ar) aqVar.instance;
        hmVar.getClass();
        arVar.f101332b = hmVar;
        arVar.f101331a = 4;
        adVar.mo41302h((C38235ar) aqVar.build());
        this.f101123a.mo41298d();
    }
}
