package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90605m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.ae */
/* compiled from: PG */
public final /* synthetic */ class C93126ae implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259761a;

    public /* synthetic */ C93126ae(C93150bb bbVar) {
        this.f259761a = bbVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93150bb bbVar = this.f259761a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C59104x b = C93150bb.f259800a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(13404)).mo56386p("#getImageCaptionMessageFuture, tts present");
            C84352a aVar = bbVar.f259803d;
            Query b2 = bbVar.f259808i.mo87473b();
            C90605m mVar = new C90605m();
            mVar.mo84746b((C63088z) axVar.mo56107c());
            return aVar.mo77889c(b2, mVar.mo84745a(), C93128ag.f259763a);
        }
        C59104x d = C93150bb.f259800a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
        ((C59052c) ((C59052c) d).mo56372aa(13403)).mo56386p("#getImageCaptionMessageFuture, tts not present");
        return C118826c.f331423b;
    }
}
