package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124641bg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124642bh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.p10712d.C142388dm;
import com.google.android.p10712d.C142407ee;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.ay */
/* compiled from: PG */
final class C89459ay extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C142388dm f242478a;

    /* renamed from: b */
    final /* synthetic */ C142407ee f242479b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89459ay(C89474bm bmVar, String str, C142388dm dmVar, C142407ee eeVar) {
        super(bmVar, str, 35);
        this.f242478a = dmVar;
        this.f242479b = eeVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124641bg g = C89474bm.m145537g(c);
        C142388dm dmVar = this.f242478a;
        if (dmVar != null) {
            g.copyOnWrite();
            C124642bh bhVar = (C124642bh) g.instance;
            C124642bh bhVar2 = C124642bh.f343852o;
            bhVar.f343865l = dmVar.f386382f;
            bhVar.f343854a |= 512;
        }
        C142407ee eeVar = this.f242479b;
        if (eeVar != null) {
            g.copyOnWrite();
            C124642bh bhVar3 = (C124642bh) g.instance;
            C124642bh bhVar4 = C124642bh.f343852o;
            bhVar3.f343866m = eeVar.f386418d;
            bhVar3.f343854a |= 1024;
        }
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124642bh bhVar5 = (C124642bh) g.build();
        C124709g gVar3 = C124709g.f344049g;
        bhVar5.getClass();
        gVar2.f344054d = bhVar5;
        gVar2.f344051a |= 4;
        return (C124709g) c.build();
    }
}
