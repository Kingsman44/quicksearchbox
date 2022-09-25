package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.at */
/* compiled from: PG */
final class C89454at extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ boolean f242471a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89454at(C89474bm bmVar, C58528ij ijVar, boolean z) {
        super(bmVar, "wired", ijVar);
        this.f242471a = z;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124621an f = C89474bm.m145536f(c);
        boolean z = this.f242471a;
        f.copyOnWrite();
        C124623ap apVar = (C124623ap) f.instance;
        C124623ap apVar2 = C124623ap.f343769w;
        apVar.f343771a |= 65536;
        apVar.f343788r = z;
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124623ap apVar3 = (C124623ap) f.build();
        C124709g gVar3 = C124709g.f344049g;
        apVar3.getClass();
        gVar2.f344052b = apVar3;
        gVar2.f344051a |= 1;
        return (C124709g) c.build();
    }
}
