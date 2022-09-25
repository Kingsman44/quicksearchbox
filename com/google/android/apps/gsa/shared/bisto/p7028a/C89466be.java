package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124641bg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124642bh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124643bi;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124713k;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.be */
/* compiled from: PG */
final class C89466be extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ Integer f242487a;

    /* renamed from: b */
    final /* synthetic */ C124713k f242488b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89466be(C89474bm bmVar, String str, C58528ij ijVar, Integer num, C124713k kVar) {
        super(bmVar, str, ijVar);
        this.f242487a = num;
        this.f242488b = kVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        if (this.f242487a != null) {
            C58976aa aaVar = C58975e.f156826a;
            C124641bg g = C89474bm.m145537g(c);
            int intValue = this.f242487a.intValue();
            g.copyOnWrite();
            C124642bh bhVar = (C124642bh) g.instance;
            C124642bh bhVar2 = C124642bh.f343852o;
            bhVar.f343854a |= 1;
            bhVar.f343855b = intValue;
            long j = this.f242492l;
            g.copyOnWrite();
            C124642bh bhVar3 = (C124642bh) g.instance;
            bhVar3.f343854a |= 4;
            bhVar3.f343857d = j;
            c.copyOnWrite();
            C124709g gVar2 = (C124709g) c.instance;
            C124642bh bhVar4 = (C124642bh) g.build();
            C124709g gVar3 = C124709g.f344049g;
            bhVar4.getClass();
            gVar2.f344054d = bhVar4;
            gVar2.f344051a |= 4;
        }
        if (this.f242488b != null) {
            C58976aa aaVar2 = C58975e.f156826a;
            C124643bi h = C89474bm.m145538h(c);
            C124713k kVar = this.f242488b;
            h.copyOnWrite();
            C124644bj bjVar = (C124644bj) h.instance;
            C124644bj bjVar2 = C124644bj.f343868n;
            bjVar.f343877h = kVar.f344071g;
            bjVar.f343870a |= 64;
            c.copyOnWrite();
            C124709g gVar4 = (C124709g) c.instance;
            C124644bj bjVar3 = (C124644bj) h.build();
            C124709g gVar5 = C124709g.f344049g;
            bjVar3.getClass();
            gVar4.f344053c = bjVar3;
            gVar4.f344051a |= 2;
        }
        return (C124709g) c.build();
    }
}
