package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.au */
/* compiled from: PG */
final class C89455au extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C124629av f242472a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89455au(C89474bm bmVar, String str, C58528ij ijVar, C124629av avVar) {
        super(bmVar, str, ijVar);
        this.f242472a = avVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124628au auVar = (C124628au) this.f242472a.toBuilder();
        C124625ar a = C124625ar.m204290a(this.f242472a.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        if (a.equals(C124625ar.UNKNOWN_INTERNAL_OTA_STATE)) {
            auVar.copyOnWrite();
            C124629av avVar = (C124629av) auVar.instance;
            avVar.f343814a &= -17;
            avVar.f343819f = 0;
        }
        C124621an f = C89474bm.m145536f(c);
        f.copyOnWrite();
        C124623ap apVar = (C124623ap) f.instance;
        C124629av avVar2 = (C124629av) auVar.build();
        C124623ap apVar2 = C124623ap.f343769w;
        avVar2.getClass();
        apVar.f343776f = avVar2;
        apVar.f343771a |= 16;
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
