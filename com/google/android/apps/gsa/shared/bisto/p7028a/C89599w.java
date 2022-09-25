package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124643bi;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.w */
/* compiled from: PG */
final class C89599w extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ String f242665a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89599w(C89474bm bmVar, String str, String str2) {
        super(bmVar, str, (C58528ij) C58733pz.f156496a);
        this.f242665a = str2;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124643bi h = C89474bm.m145538h(c);
        String str = this.f242665a;
        h.copyOnWrite();
        C124644bj bjVar = (C124644bj) h.instance;
        C124644bj bjVar2 = C124644bj.f343868n;
        str.getClass();
        bjVar.f343870a |= 2048;
        bjVar.f343882m = str;
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124644bj bjVar3 = (C124644bj) h.build();
        C124709g gVar3 = C124709g.f344049g;
        bjVar3.getClass();
        gVar2.f344053c = bjVar3;
        gVar2.f344051a |= 2;
        return (C124709g) c.build();
    }
}
