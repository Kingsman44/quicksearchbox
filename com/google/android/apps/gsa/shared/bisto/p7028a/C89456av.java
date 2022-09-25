package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.av */
/* compiled from: PG */
final class C89456av extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ String f242473a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89456av(C89474bm bmVar, String str, String str2) {
        super(bmVar, str, (C58528ij) C58733pz.f156496a);
        this.f242473a = str2;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124621an f = C89474bm.m145536f(c);
        String str = this.f242473a;
        f.copyOnWrite();
        C124623ap apVar = (C124623ap) f.instance;
        C124623ap apVar2 = C124623ap.f343769w;
        str.getClass();
        apVar.f343771a |= C89885b.S3REQUEST_VALUE;
        apVar.f343789s = str;
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
