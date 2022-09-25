package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.staticplugins.p7565bu.C96814ag;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.az */
/* compiled from: PG */
final class C96781az implements C28746bx {

    /* renamed from: a */
    private final C28746bx f270681a;

    /* renamed from: b */
    private final C28746bx f270682b;

    /* renamed from: c */
    private final C28746bx f270683c;

    /* renamed from: d */
    private final C96762ag f270684d;

    public C96781az(C96762ag agVar, C96814ag agVar2, C96786e eVar, C84469a aVar) {
        Optional e = agVar.mo90342e();
        this.f270684d = agVar;
        if (aVar.mo78035i()) {
            this.f270681a = eVar.mo90346a(agVar.mo90340c(), agVar.mo90344g(), new C96785d(agVar)).mo34762a();
        } else {
            this.f270681a = agVar2.mo90362a(agVar.mo90340c());
        }
        C96780ay ayVar = C96780ay.f270680a;
        this.f270683c = ayVar;
        if (agVar.mo90341d().isPresent() || !e.isPresent()) {
            this.f270682b = ayVar;
        } else {
            this.f270682b = (C28746bx) e.get();
        }
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C96761af afVar = C96761af.PRE_MIGRATION;
        int ordinal = ((C96761af) this.f270684d.mo90338a().mo6453a()).ordinal();
        if (ordinal == 0) {
            return this.f270682b.mo19336b(fdVar);
        }
        if (ordinal == 1) {
            return this.f270681a.mo19336b(fdVar);
        }
        if (ordinal == 2) {
            return C60866ct.f164955a;
        }
        C59104x c = C96783ba.f270686a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SimpleGddUtils");
        ((C59052c) ((C59052c) c).mo56372aa(20914)).mo56386p("SimpleGddConfig.Status not handled explicitly, this should not happen.");
        return C60866ct.f164955a;
    }
}
