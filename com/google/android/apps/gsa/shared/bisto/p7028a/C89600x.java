package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124641bg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124642bh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.x */
/* compiled from: PG */
final class C89600x extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ Boolean f242666a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89600x(C89474bm bmVar, String str, Boolean bool) {
        super(bmVar, str, (C58528ij) C58733pz.f156496a);
        this.f242666a = bool;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124641bg g = C89474bm.m145537g(c);
        Boolean bool = this.f242666a;
        if (bool == null) {
            g.copyOnWrite();
            C124642bh bhVar = (C124642bh) g.instance;
            C124642bh bhVar2 = C124642bh.f343852o;
            bhVar.f343859f = 0;
            bhVar.f343854a |= 16;
        } else if (bool.booleanValue()) {
            g.copyOnWrite();
            C124642bh bhVar3 = (C124642bh) g.instance;
            C124642bh bhVar4 = C124642bh.f343852o;
            bhVar3.f343859f = 1;
            bhVar3.f343854a |= 16;
        } else {
            g.copyOnWrite();
            C124642bh bhVar5 = (C124642bh) g.instance;
            C124642bh bhVar6 = C124642bh.f343852o;
            bhVar5.f343859f = 2;
            bhVar5.f343854a |= 16;
        }
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124642bh bhVar7 = (C124642bh) g.build();
        C124709g gVar3 = C124709g.f344049g;
        bhVar7.getClass();
        gVar2.f344054d = bhVar7;
        gVar2.f344051a |= 4;
        return (C124709g) c.build();
    }
}
