package com.google.android.apps.gsa.staticplugins.p7441bb;

import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.android.apps.gsa.shared.p6968aa.p6969a.C89002b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60470rb;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;

/* renamed from: com.google.android.apps.gsa.staticplugins.bb.c */
/* compiled from: PG */
final class C94486c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70897l f264173a;

    /* renamed from: b */
    final /* synthetic */ C70334de f264174b;

    /* renamed from: c */
    final /* synthetic */ C94487d f264175c;

    public C94486c(C94487d dVar, C70897l lVar, C70334de deVar) {
        this.f264175c = dVar;
        this.f264173a = lVar;
        this.f264174b = deVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C94490g.f264181a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GusAgsaClient");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20132)).mo56386p("Can't get authorization header");
        C94487d dVar = this.f264175c;
        if (dVar.f264176a.f264184d) {
            dVar.mo27480d("Can't get authorization header", th);
        }
        this.f264175c.mo88488e(this.f264173a, this.f264174b);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C86053n nVar = (C86053n) obj;
        C70897l lVar = this.f264173a;
        if (nVar == null) {
            this.f264175c.mo27480d("Authorization header not present", (Throwable) null);
        } else if (C60470rb.SUCCESS != nVar.f232633b || (str = nVar.f232632a) == null) {
            C58976aa aaVar = C58975e.f156826a;
            C94487d dVar = this.f264175c;
            if (dVar.f264176a.f264184d) {
                dVar.mo27480d("Authorization header not present", (Throwable) null);
            }
        } else {
            C89002b.m144698a(this.f264174b, "Authorization", "Bearer ".concat(str));
            lVar = new C94489f(this.f264175c.f264176a, this.f264173a, str);
        }
        this.f264175c.mo88488e(lVar, this.f264174b);
    }
}
