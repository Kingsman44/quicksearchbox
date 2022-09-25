package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124615ah;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.ak */
/* compiled from: PG */
final class C89445ak extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C124615ah f242463a;

    /* renamed from: b */
    final /* synthetic */ C89474bm f242464b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89445ak(C89474bm bmVar, String str, C124615ah ahVar) {
        super(bmVar, str, 30);
        this.f242464b = bmVar;
        this.f242463a = ahVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124621an f = C89474bm.m145536f(c);
        int i = 0;
        if (!C124615ah.NONE_SENT.equals(this.f242463a)) {
            C124615ah a = C124615ah.m204285a(((C124623ap) f.instance).f343783m);
            if (a == null) {
                a = C124615ah.NONE_SENT;
            }
            if (a.equals(this.f242463a) && (i = ((C124623ap) f.instance).f343784n) != Integer.MAX_VALUE) {
                i++;
            }
        }
        C124615ah ahVar = this.f242463a;
        f.copyOnWrite();
        C124623ap apVar = (C124623ap) f.instance;
        C124623ap apVar2 = C124623ap.f343769w;
        apVar.f343783m = ahVar.f343746f;
        apVar.f343771a |= 2048;
        long b = this.f242464b.f242500g.mo26870b();
        f.copyOnWrite();
        C124623ap apVar3 = (C124623ap) f.instance;
        apVar3.f343771a |= 8192;
        apVar3.f343785o = b;
        f.copyOnWrite();
        C124623ap apVar4 = (C124623ap) f.instance;
        apVar4.f343771a |= 4096;
        apVar4.f343784n = i;
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124623ap apVar5 = (C124623ap) f.build();
        C124709g gVar3 = C124709g.f344049g;
        apVar5.getClass();
        gVar2.f344052b = apVar5;
        gVar2.f344051a |= 1;
        return (C124709g) c.build();
    }
}
