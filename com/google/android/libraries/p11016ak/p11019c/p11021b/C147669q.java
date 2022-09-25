package com.google.android.libraries.p11016ak.p11019c.p11021b;

import com.google.android.libraries.p11016ak.C147733o;
import com.google.android.libraries.p11016ak.C147734p;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5285d.p5290b.p5291a.p5292a.C68169be;
import p5285d.p5290b.p5291a.p5292a.C68172bh;
import p5285d.p5290b.p5291a.p5292a.C68193f;

/* renamed from: com.google.android.libraries.ak.c.b.q */
/* compiled from: PG */
public final /* synthetic */ class C147669q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C147673u f398529a;

    public /* synthetic */ C147669q(C147673u uVar) {
        this.f398529a = uVar;
    }

    public final Object apply(Object obj) {
        C147734p pVar = (C147734p) obj;
        C68193f fVar = this.f398529a.f398535a;
        C68169be beVar = ((C68172bh) fVar.f184520f.get(pVar.f398656d)).f184476b;
        if (beVar == null) {
            beVar = C68169be.f184463c;
        }
        int i = beVar.f184465a;
        C147733o oVar = (C147733o) pVar.toBuilder();
        oVar.copyOnWrite();
        ((C147734p) oVar.instance).f398654b = C147734p.emptyProtobufList();
        oVar.mo124427a((List) Collection.EL.stream(pVar.f398654b).map(new C147672t(i)).collect(Collectors.toList()));
        return (C147734p) oVar.build();
    }
}
