package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.am */
/* compiled from: PG */
final class C89447am extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C89474bm f242465a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89447am(C89474bm bmVar, String str) {
        super(bmVar, str, 30);
        this.f242465a = bmVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124621an f = C89474bm.m145536f(c);
        long b = this.f242465a.f242500g.mo26870b();
        f.copyOnWrite();
        C124623ap apVar = (C124623ap) f.instance;
        C124623ap apVar2 = C124623ap.f343769w;
        apVar.f343771a |= 8192;
        apVar.f343785o = b;
        f.copyOnWrite();
        C124623ap apVar3 = (C124623ap) f.instance;
        apVar3.f343771a |= 4096;
        apVar3.f343784n = Integer.MAX_VALUE;
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
