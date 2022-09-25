package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.r */
/* compiled from: PG */
final class C89594r extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ boolean f242660a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89594r(C89474bm bmVar, String str, boolean z) {
        super(bmVar, str, (C58528ij) C58733pz.f156496a);
        this.f242660a = z;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124621an f = C89474bm.m145536f(c);
        if (this.f242660a) {
            int i = ((C124623ap) f.instance).f343773c;
            f.copyOnWrite();
            C124623ap apVar = (C124623ap) f.instance;
            apVar.f343771a |= 2;
            apVar.f343773c = i + 1;
        } else {
            int max = Math.max(0, ((C124623ap) f.instance).f343773c - 1);
            f.copyOnWrite();
            C124623ap apVar2 = (C124623ap) f.instance;
            apVar2.f343771a |= 2;
            apVar2.f343773c = max;
        }
        long j = this.f242492l;
        f.copyOnWrite();
        C124623ap apVar3 = (C124623ap) f.instance;
        apVar3.f343771a |= 4;
        apVar3.f343774d = j;
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124623ap apVar4 = (C124623ap) f.build();
        C124709g gVar3 = C124709g.f344049g;
        apVar4.getClass();
        gVar2.f344052b = apVar4;
        gVar2.f344051a |= 1;
        return (C124709g) c.build();
    }
}
