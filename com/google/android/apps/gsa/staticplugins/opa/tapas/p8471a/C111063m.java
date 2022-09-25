package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113246a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113501m;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3825an.p3830c.p3831a.C49261ag;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.m */
/* compiled from: PG */
public final /* synthetic */ class C111063m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C111071u f309276a;

    /* renamed from: b */
    public final /* synthetic */ C49301bt f309277b;

    /* renamed from: c */
    public final /* synthetic */ C48582b f309278c;

    /* renamed from: d */
    public final /* synthetic */ C54758f f309279d;

    /* renamed from: e */
    public final /* synthetic */ C54759g f309280e;

    /* renamed from: f */
    public final /* synthetic */ C58495hd f309281f;

    public /* synthetic */ C111063m(C111071u uVar, C49301bt btVar, C48582b bVar, C54758f fVar, C54759g gVar, C58495hd hdVar) {
        this.f309276a = uVar;
        this.f309277b = btVar;
        this.f309278c = bVar;
        this.f309279d = fVar;
        this.f309280e = gVar;
        this.f309281f = hdVar;
    }

    public final Object apply(Object obj) {
        C111071u uVar = this.f309276a;
        C49301bt btVar = this.f309277b;
        C48582b bVar = this.f309278c;
        C54758f fVar = this.f309279d;
        C54759g gVar = this.f309280e;
        C58495hd hdVar = this.f309281f;
        C111070t tVar = (C111070t) obj;
        Optional b = tVar.mo99024b();
        String str = btVar.f127426b;
        C49261ag agVar = btVar.f127427c;
        if (agVar == null) {
            agVar = C49261ag.f127334e;
        }
        String str2 = agVar.f127336a;
        C54773u uVar2 = gVar.f143681a;
        if (uVar2 == null) {
            uVar2 = C54773u.f143704c;
        }
        C113501m b2 = uVar.mo99041b(b, str, str2, bVar, fVar, uVar2.f143706a, hdVar, tVar.mo99023a());
        C54773u uVar3 = gVar.f143681a;
        if (uVar3 == null) {
            uVar3 = C54773u.f143704c;
        }
        ((C113246a) b2).f313596f = Optional.m71637of(uVar3);
        return b2.mo99919a();
    }
}
