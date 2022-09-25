package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124641bg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124642bh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124643bi;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.aj */
/* compiled from: PG */
final class C89444aj extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C124715m f242462a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89444aj(C89474bm bmVar, String str, C124715m mVar) {
        super(bmVar, str, 6);
        this.f242462a = mVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124641bg g = C89474bm.m145537g(c);
        C124715m mVar = this.f242462a;
        C124715m a = C124715m.m204378a(((C124642bh) g.instance).f343856c);
        if (a == null) {
            a = C124715m.UNKNOWN_CONNECTIVITY_STATUS;
        }
        if (!mVar.equals(a)) {
            C58976aa aaVar = C58975e.f156826a;
            C124715m mVar2 = this.f242462a;
            g.copyOnWrite();
            C124642bh bhVar = (C124642bh) g.instance;
            bhVar.f343856c = mVar2.f344081h;
            bhVar.f343854a |= 2;
            c.copyOnWrite();
            C124709g gVar2 = (C124709g) c.instance;
            C124642bh bhVar2 = (C124642bh) g.build();
            C124709g gVar3 = C124709g.f344049g;
            bhVar2.getClass();
            gVar2.f344054d = bhVar2;
            gVar2.f344051a |= 4;
        }
        long j = this.f242492l;
        g.copyOnWrite();
        C124642bh bhVar3 = (C124642bh) g.instance;
        bhVar3.f343854a |= 8;
        bhVar3.f343858e = j;
        if (this.f242462a.equals(C124715m.NOT_CONNECTED)) {
            C124643bi h = C89474bm.m145538h(c);
            h.copyOnWrite();
            C124644bj bjVar = (C124644bj) h.instance;
            C124644bj bjVar2 = C124644bj.f343868n;
            bjVar.f343870a |= 4;
            bjVar.f343873d = false;
            c.copyOnWrite();
            C124709g gVar4 = (C124709g) c.instance;
            C124644bj bjVar3 = (C124644bj) h.build();
            C124709g gVar5 = C124709g.f344049g;
            bjVar3.getClass();
            gVar4.f344053c = bjVar3;
            gVar4.f344051a |= 2;
        }
        c.copyOnWrite();
        C124709g gVar6 = (C124709g) c.instance;
        C124642bh bhVar4 = (C124642bh) g.build();
        C124709g gVar7 = C124709g.f344049g;
        bhVar4.getClass();
        gVar6.f344054d = bhVar4;
        gVar6.f344051a |= 4;
        return (C124709g) c.build();
    }
}
