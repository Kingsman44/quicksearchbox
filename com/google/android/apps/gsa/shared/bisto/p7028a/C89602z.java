package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124616ai;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124617aj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.z */
/* compiled from: PG */
final class C89602z extends C89473bl {
    public C89602z(C89474bm bmVar, String str) {
        super(bmVar, str, 11);
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124721s sVar = C124721s.UNKNOWN_DEVICE_TYPE;
        C124617aj ajVar = ((C124709g) c.instance).f344055e;
        if (ajVar == null) {
            ajVar = C124617aj.f343747l;
        }
        C124721s a = C124721s.m204382a(ajVar.f343751c);
        if (a == null) {
            a = C124721s.UNKNOWN_DEVICE_TYPE;
        }
        if (sVar.equals(a)) {
            C124616ai e = C89474bm.m145535e(c);
            C124721s sVar2 = C124721s.GENERIC_SCALED;
            e.copyOnWrite();
            C124617aj ajVar2 = (C124617aj) e.instance;
            ajVar2.f343751c = sVar2.f344111g;
            ajVar2.f343749a |= 2;
            c.copyOnWrite();
            C124709g gVar2 = (C124709g) c.instance;
            C124617aj ajVar3 = (C124617aj) e.build();
            ajVar3.getClass();
            gVar2.f344055e = ajVar3;
            gVar2.f344051a |= 8;
        }
        return (C124709g) c.build();
    }
}
