package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124726x;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124727y;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.as */
/* compiled from: PG */
final class C89453as extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C63088z f242470a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89453as(C89474bm bmVar, String str, C63088z zVar) {
        super(bmVar, str, (C58528ij) C58733pz.f156496a);
        this.f242470a = zVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124726x xVar;
        C124708f c = C89474bm.m145533c(gVar);
        C124709g gVar2 = (C124709g) c.instance;
        if ((gVar2.f344051a & 16) != 0) {
            C124727y yVar = gVar2.f344056f;
            if (yVar == null) {
                yVar = C124727y.f344118c;
            }
            xVar = (C124726x) yVar.toBuilder();
        } else {
            xVar = (C124726x) C124727y.f344118c.createBuilder();
        }
        C63088z zVar = this.f242470a;
        xVar.copyOnWrite();
        C124727y yVar2 = (C124727y) xVar.instance;
        yVar2.f344120a |= 1;
        yVar2.f344121b = zVar;
        c.copyOnWrite();
        C124709g gVar3 = (C124709g) c.instance;
        C124727y yVar3 = (C124727y) xVar.build();
        yVar3.getClass();
        gVar3.f344056f = yVar3;
        gVar3.f344051a |= 16;
        return (C124709g) c.build();
    }
}
