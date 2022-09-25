package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89016an;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89046bq;
import com.google.android.apps.gsa.shared.p6968aa.C89050f;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.io.File;
import java.net.URL;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.libraries.gsa.c.a.bk */
/* compiled from: PG */
public final class C22239bk extends C22254f {

    /* renamed from: o */
    private static final C59071e f61402o = C59071e.m91332i("com.google.android.libraries.gsa.c.a.bk");

    /* renamed from: a */
    public final C90021c f61403a;

    /* renamed from: e */
    public final C58833ax f61404e;

    /* renamed from: f */
    public final C58833ax f61405f;

    /* renamed from: g */
    public final C58833ax f61406g;

    /* renamed from: h */
    public final C22214am f61407h;

    /* renamed from: i */
    public final C22266r f61408i;

    /* renamed from: j */
    public final C22871g f61409j;

    /* renamed from: k */
    public final C58833ax f61410k;

    /* renamed from: l */
    public final C58833ax f61411l;

    /* renamed from: m */
    public final C89016an f61412m;

    /* renamed from: n */
    public volatile C89046bq f61413n = null;

    public C22239bk(C90021c cVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C22266r rVar, C22214am amVar, C22871g gVar, C68214a aVar, C58833ax axVar5, C58833ax axVar6, C89052h hVar, C89016an anVar) {
        super(axVar2, aVar, hVar);
        this.f61403a = cVar;
        this.f61404e = axVar;
        this.f61405f = axVar3;
        this.f61406g = axVar4;
        this.f61407h = amVar;
        this.f61408i = rVar;
        this.f61409j = gVar;
        this.f61410k = axVar5;
        this.f61411l = axVar6;
        this.f61412m = anVar;
    }

    /* renamed from: W */
    public final String mo27493W() {
        return "HttpEngineImpl";
    }

    /* renamed from: e */
    public final C60870cx mo27494e(String str, int i, int i2) {
        return this.f61409j.mo28210j(this.f61408i.mo27457a(), "Get gRPC channel builder", new C22232bd(this, str, i, i2));
    }

    /* renamed from: f */
    public final C60870cx mo27495f(C89020ar arVar, C89068x xVar, C89061q qVar) {
        C58976aa aaVar = C58975e.f156826a;
        URL url = arVar.f241257f;
        C60870cx d = C89057m.m144852d(mo27496g(arVar, xVar, qVar));
        C90476a aVar = C91018d.f254254a;
        return new C89050f(d);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HttpEngineImpl");
        fVar.mo85286m(this.f61408i);
    }

    /* renamed from: h */
    public final C60870cx mo27497h(int i) {
        return C60856cj.m92900i(C58833ax.m90833j(this.f61408i.mo27464i(i)));
    }

    /* renamed from: i */
    public final void mo27498i(File file) {
        this.f61408i.mo27459c(file);
    }

    /* renamed from: j */
    public final void mo27499j() {
        this.f61408i.mo27460e();
    }

    /* renamed from: k */
    public final void mo27500k(C89046bq bqVar) {
        this.f61413n = bqVar;
    }

    /* renamed from: m */
    public final C60870cx mo27501m(String str, int i, C70334de deVar, String str2, int i2) {
        C60870cx g = C60922j.m93044g(mo27494e(str, i, i2), new C22236bh(str2, deVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: g */
    public final C60870cx mo27496g(C89020ar arVar, C89068x xVar, C89061q qVar) {
        arVar.getClass();
        xVar.getClass();
        if (arVar.f241262k && !xVar.mo27477f()) {
            C59104x d = f61402o.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HttpEngineImpl");
            ((C59052c) ((C59052c) d).mo56372aa(48488)).mo56386p("Cannot follow redirects on with a non-cloneable upload stream.");
            int i = C90755l.f253831a;
        }
        return new C89050f(C60846c.m92879h(this.f61409j.mo28202b("HttpEngineImplStartRequest", new C22231bc(this, qVar, arVar, xVar)), Throwable.class, new C22246br(arVar.f241274w), C60826bg.f164896a));
    }
}
