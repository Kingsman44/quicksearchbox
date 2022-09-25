package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.p2982x.C38236as;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.x.a.az */
/* compiled from: PG */
final class C38188az implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C38192bc f101205a;

    public C38188az(C38192bc bcVar) {
        this.f101205a = bcVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38192bc.f101211a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSender");
        ((C59052c) ((C59052c) d).mo56372aa(53050)).mo56386p("#audio# Failed to get StopListeningStatus.");
        this.f101205a.mo41319f(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37418bw bwVar = (C37418bw) obj;
        C38192bc bcVar = this.f101205a;
        C38236as asVar = (C38236as) C38237at.f101333c.createBuilder();
        asVar.copyOnWrite();
        C38237at atVar = (C38237at) asVar.instance;
        bwVar.getClass();
        atVar.f101336b = bwVar;
        atVar.f101335a = 5;
        bcVar.mo41321h((C38237at) asVar.build());
        this.f101205a.mo41317d();
    }
}
