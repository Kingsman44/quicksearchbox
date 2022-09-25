package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.ag */
/* compiled from: PG */
final class C89441ag extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ Map f242458a;

    /* renamed from: b */
    final /* synthetic */ C89474bm f242459b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89441ag(C89474bm bmVar, String str, Map map) {
        super(bmVar, str, 24);
        this.f242459b = bmVar;
        this.f242458a = map;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124621an f = C89474bm.m145536f(c);
        f.copyOnWrite();
        C124623ap apVar = C124623ap.f343769w;
        ((C124623ap) f.instance).mo106562a().clear();
        Map map = this.f242458a;
        f.copyOnWrite();
        ((C124623ap) f.instance).mo106562a().putAll(map);
        long b = this.f242459b.f242500g.mo26870b();
        f.copyOnWrite();
        C124623ap apVar2 = (C124623ap) f.instance;
        apVar2.f343771a |= 256;
        apVar2.f343780j = b;
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
