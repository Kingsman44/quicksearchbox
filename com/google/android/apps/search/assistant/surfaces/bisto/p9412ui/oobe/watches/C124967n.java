package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63137c;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.n */
/* compiled from: PG */
public final /* synthetic */ class C124967n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C124977x f344814a;

    public /* synthetic */ C124967n(C124977x xVar) {
        this.f344814a = xVar;
    }

    public final Object apply(Object obj) {
        C124977x xVar = this.f344814a;
        byte[] bArr = (byte[]) obj;
        boolean z = false;
        if (bArr == null) {
            C59104x d = C124977x.f344835a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DataLayerInitHelper");
            ((C59052c) ((C59052c) d).mo56372aa(36383)).mo56386p("Data is null.");
        } else {
            try {
                C63138d dVar = (C63138d) C62942bv.parseFrom((C62942bv) C63138d.f170494j, bArr, C62921ba.m95368a());
                if ((dVar.f170496a & 64) != 0) {
                    C58976aa aaVar = C58975e.f156826a;
                    if (xVar.f344842f) {
                        boolean z2 = dVar.f170504i;
                    }
                    C63137c cVar = (C63137c) C63138d.f170494j.createBuilder(dVar);
                    boolean z3 = xVar.f344842f && dVar.f170504i;
                    cVar.copyOnWrite();
                    C63138d dVar2 = (C63138d) cVar.instance;
                    dVar2.f170496a |= 64;
                    dVar2.f170504i = z3;
                    dVar = (C63138d) cVar.build();
                }
                if ((dVar.f170496a & 1) != 0) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    C124978y yVar = xVar.f344844h;
                    yVar.copyOnWrite();
                    C124979z zVar = (C124979z) yVar.instance;
                    C124979z zVar2 = C124979z.f344847e;
                    dVar.getClass();
                    zVar.f344851c = dVar;
                    zVar.f344849a |= 2;
                    z = true;
                } else {
                    C59104x d2 = C124977x.f344835a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "DataLayerInitHelper");
                    ((C59052c) ((C59052c) d2).mo56372aa(36382)).mo56386p("No Model ID.");
                }
            } catch (C62974ct e) {
                C59104x d3 = C124977x.f344835a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "DataLayerInitHelper");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e)).mo56372aa(36381)).mo56386p("Error parsing proto.");
            }
        }
        return Boolean.valueOf(z);
    }
}
