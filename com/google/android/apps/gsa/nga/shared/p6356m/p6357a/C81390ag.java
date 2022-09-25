package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.C74723ca;
import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6278c.C80150a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6278c.C80151b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80633a;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80638b;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80641e;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.nga.shared.p6339f.C81042c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81047e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81048f;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81050h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.ag */
/* compiled from: PG */
public final class C81390ag {

    /* renamed from: a */
    public static final C58974d f222734a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f222735b;

    /* renamed from: c */
    public final C74723ca f222736c;

    /* renamed from: d */
    public final C58881cr f222737d;

    /* renamed from: e */
    public final C81042c f222738e;

    /* renamed from: f */
    public final C80642f f222739f;

    /* renamed from: g */
    public final C80641e f222740g;

    /* renamed from: h */
    private final C22871g f222741h;

    public C81390ag(C22871g gVar, C22871g gVar2, C74723ca caVar, C81385ab abVar, C81042c cVar, C80642f fVar, C80641e eVar) {
        this.f222735b = gVar;
        this.f222741h = gVar2;
        this.f222736c = caVar;
        Objects.requireNonNull(abVar);
        this.f222737d = C58886cw.m90973a(new C81388ae(abVar));
        this.f222738e = cVar;
        this.f222739f = fVar;
        this.f222740g = eVar;
    }

    /* renamed from: a */
    public static C80633a m129470a(C37672hs hsVar, cf cfVar, C81044b bVar) {
        C81050h hVar;
        C80633a aVar = (C80633a) C80638b.f221379o.createBuilder();
        C80471b bVar2 = C80471b.ROHAN_SODA;
        aVar.copyOnWrite();
        C80638b bVar3 = (C80638b) aVar.instance;
        bVar3.f221385e = bVar2.f220865d;
        bVar3.f221381a |= 8;
        aVar.copyOnWrite();
        C80638b bVar4 = (C80638b) aVar.instance;
        cfVar.getClass();
        bVar4.f221394n = cfVar;
        bVar4.f221381a |= 4096;
        C81047e eVar = (C81047e) C81048f.f222138d.createBuilder();
        if (bVar.f222118b == 5) {
            hVar = (C81050h) bVar.f222119c;
        } else {
            hVar = C81050h.f222144i;
        }
        eVar.copyOnWrite();
        C81048f fVar = (C81048f) eVar.instance;
        hVar.getClass();
        fVar.f222141b = hVar;
        fVar.f222140a = 4;
        C80150a aVar2 = (C80150a) C80151b.f219941c.createBuilder();
        aVar2.copyOnWrite();
        C80151b bVar5 = (C80151b) aVar2.instance;
        bVar5.f219943a |= 1;
        bVar5.f219944b = true;
        eVar.copyOnWrite();
        C80151b bVar6 = (C80151b) aVar2.build();
        bVar6.getClass();
        ((C81048f) eVar.instance).f222142c = bVar6;
        aVar.copyOnWrite();
        C80638b bVar7 = (C80638b) aVar.instance;
        C81048f fVar2 = (C81048f) eVar.build();
        fVar2.getClass();
        bVar7.f221384d = fVar2;
        bVar7.f221381a |= 4;
        aVar.copyOnWrite();
        C80638b bVar8 = (C80638b) aVar.instance;
        bVar8.f221381a |= 1;
        bVar8.f221382b = false;
        aVar.copyOnWrite();
        C80638b bVar9 = (C80638b) aVar.instance;
        bVar9.f221381a |= 2;
        bVar9.f221383c = true;
        aVar.copyOnWrite();
        C80638b bVar10 = (C80638b) aVar.instance;
        hsVar.getClass();
        bVar10.f221386f = hsVar;
        bVar10.f221381a |= 16;
        aVar.copyOnWrite();
        C80638b bVar11 = (C80638b) aVar.instance;
        bVar11.f221381a |= 64;
        bVar11.f221388h = true;
        return aVar;
    }

    /* renamed from: b */
    public final void mo75055b(C37672hs hsVar, int i) {
        this.f222738e.mo74837g(i);
        this.f222741h.mo28212l("[NGA] RohanEntryPoint.notifyInvocationError", new C81389af(this, hsVar, i));
    }
}
