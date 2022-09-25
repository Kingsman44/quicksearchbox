package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.p2982x.C38234aq;
import com.google.android.libraries.search.p2904c.p2982x.C38235ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.x.a.z */
/* compiled from: PG */
final class C38217z implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C38166ad f101294a;

    public C38217z(C38166ad adVar) {
        this.f101294a = adVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38166ad.f101128a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
        ((C59052c) ((C59052c) d).mo56372aa(53017)).mo56386p("#audio# Failed to get FirstByteReadResult.");
        this.f101294a.mo41296b();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37397bb bbVar = (C37397bb) obj;
        C59104x b = C38166ad.f101128a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
        ((C59052c) ((C59052c) b).mo56372aa(53018)).mo56386p("#audio# completeWithFirstByteReadResultAndStopListeningStatus Setting FirstByteReadResult.");
        C38166ad adVar = this.f101294a;
        C38234aq aqVar = (C38234aq) C38235ar.f101329c.createBuilder();
        aqVar.copyOnWrite();
        C38235ar arVar = (C38235ar) aqVar.instance;
        bbVar.getClass();
        arVar.f101332b = bbVar;
        arVar.f101331a = 5;
        adVar.mo41302h((C38235ar) aqVar.build());
        this.f101294a.mo41296b();
    }
}
