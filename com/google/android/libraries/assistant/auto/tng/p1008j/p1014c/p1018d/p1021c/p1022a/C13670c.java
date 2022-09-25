package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13658d;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13702o;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13703p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C13670c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13673f f41722a;

    public /* synthetic */ C13670c(C13673f fVar) {
        this.f41722a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C13673f fVar = this.f41722a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C59104x d = C13673f.f41726a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ProjectedVecTransport");
            ((C59052c) ((C59052c) d).mo56372aa(44918)).mo56386p("CapabilitySharingRequest is not available.");
            return C60866ct.f164955a;
        }
        C13675h hVar = fVar.f41728c;
        C13702o oVar = (C13702o) C13703p.f41793f.createBuilder();
        C13658d dVar = (C13658d) optional.get();
        oVar.copyOnWrite();
        C13703p pVar = (C13703p) oVar.instance;
        dVar.getClass();
        pVar.f41797c = dVar;
        pVar.f41796b = 4;
        C60870cx a = hVar.mo21211a((C13703p) oVar.build());
        C13671d dVar2 = new C13671d(fVar);
        return C60922j.m93044g(a, C47810es.m84963c(dVar2), fVar.f41729d);
    }
}
