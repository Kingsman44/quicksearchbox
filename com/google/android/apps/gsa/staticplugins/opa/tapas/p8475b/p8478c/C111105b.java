package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8478c;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.c.b */
/* compiled from: PG */
public final /* synthetic */ class C111105b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C111110g f309346a;

    /* renamed from: b */
    public final /* synthetic */ String f309347b;

    public /* synthetic */ C111105b(C111110g gVar, String str) {
        this.f309346a = gVar;
        this.f309347b = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C111110g gVar = this.f309346a;
        String str = this.f309347b;
        Geller a = gVar.f309354c.a();
        if (a != null) {
            return gVar.f309353b.mo28209i(a.mo27210u(str, new C58759qy(C65753ak.ASSISTANT_HISTORY)), "extract assistant history snapshot from geller snapshot", new C111104a(gVar));
        }
        C59104x d = C111110g.f309352a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AssistantHistoryFetcher");
        ((C59052c) ((C59052c) d).mo56372aa(27104)).mo56386p("Geller is null.");
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = gVar.f309355d.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }
}
