package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.p2982x.C38236as;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.x.a.ba */
/* compiled from: PG */
final class C38190ba implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C38192bc f101207a;

    public C38190ba(C38192bc bcVar) {
        this.f101207a = bcVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38192bc.f101211a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSender");
        ((C59052c) ((C59052c) d).mo56372aa(53051)).mo56386p("#audio# Failed to get FirstByteReadResult.");
        this.f101207a.mo41318e();
        this.f101207a.mo41315b();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37397bb bbVar = (C37397bb) obj;
        C38192bc bcVar = this.f101207a;
        C38236as asVar = (C38236as) C38237at.f101333c.createBuilder();
        asVar.copyOnWrite();
        C38237at atVar = (C38237at) asVar.instance;
        bbVar.getClass();
        atVar.f101336b = bbVar;
        atVar.f101335a = 4;
        bcVar.mo41321h((C38237at) asVar.build());
        this.f101207a.mo41315b();
    }
}
