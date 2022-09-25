package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124641bg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124642bh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.y */
/* compiled from: PG */
final class C89601y extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ Boolean f242667a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89601y(C89474bm bmVar, String str, Boolean bool) {
        super(bmVar, str, (C58528ij) C58733pz.f156496a);
        this.f242667a = bool;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124641bg g = C89474bm.m145537g(c);
        if (this.f242667a.booleanValue()) {
            g.copyOnWrite();
            C124642bh bhVar = (C124642bh) g.instance;
            C124642bh bhVar2 = C124642bh.f343852o;
            bhVar.f343860g = 2;
            bhVar.f343854a |= 32;
        } else {
            g.copyOnWrite();
            C124642bh bhVar3 = (C124642bh) g.instance;
            C124642bh bhVar4 = C124642bh.f343852o;
            bhVar3.f343860g = 1;
            bhVar3.f343854a |= 32;
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
