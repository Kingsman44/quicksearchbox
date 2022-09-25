package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95495l;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124659by;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124670ci;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124674cm;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124675cn;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124681ct;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124683cv;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124698dj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124700dl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124729a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9408a.p9409a.C124750a;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37165c;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37168f;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37170h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.v */
/* compiled from: PG */
final class C124774v extends C124670ci {

    /* renamed from: a */
    public static final C59071e f344195a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.v");

    /* renamed from: b */
    public final Executor f344196b;

    /* renamed from: c */
    public final Executor f344197c;

    /* renamed from: d */
    public final C124729a f344198d;

    /* renamed from: e */
    public final C124755c f344199e;

    /* renamed from: f */
    private final C37165c f344200f;

    /* renamed from: g */
    private final C124659by f344201g;

    /* renamed from: h */
    private final C124750a f344202h;

    /* renamed from: i */
    private final C95495l f344203i;

    public C124774v(C124750a aVar, Executor executor, Executor executor2, C124755c cVar, C37165c cVar2, C124729a aVar2, C124659by byVar, C95495l lVar) {
        this.f344202h = aVar;
        this.f344196b = executor;
        this.f344197c = executor2;
        this.f344199e = cVar;
        this.f344200f = cVar2;
        this.f344198d = aVar2;
        this.f344201g = byVar;
        this.f344203i = lVar;
    }

    /* renamed from: j */
    private final C60870cx m204443j(acv acv) {
        C37165c cVar = this.f344200f;
        C37168f fVar = new C37168f();
        fVar.mo40666b(acv);
        fVar.mo40667c(getClass().getSimpleName());
        return cVar.mo40669a(fVar.mo40665a());
    }

    /* renamed from: b */
    public final synchronized C70862aj mo106582b(C70862aj ajVar) {
        C59104x b = f344195a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) b).mo56372aa(36300)).mo56386p("Starting connection to S3");
        return new C124773u(this, this.f344202h.f344153a.mo59701b(ajVar), ajVar);
    }

    /* renamed from: c */
    public final void mo106583c(C124681ct ctVar, C70862aj ajVar) {
        C59104x b = f344195a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) b).mo56372aa(36301)).mo56389s("Disable Assistant %s", ctVar.f343975b);
        C47633f i = C47633f.m84733g(this.f344198d.mo106598d(ctVar.f343975b)).mo51516i(new C124757e(this, ctVar), this.f344197c);
        C124763k kVar = new C124763k(ajVar, ctVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(kVar), this.f344197c);
    }

    /* renamed from: d */
    public final void mo106584d(C124683cv cvVar, C70862aj ajVar) {
        C59104x b = f344195a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) b).mo56372aa(36302)).mo56389s("Download DCI %s", cvVar.f343979b);
        this.f344203i.mo89391a(cvVar.f343979b);
        C124659by byVar = this.f344201g;
        C124674cm cmVar = (C124674cm) C124675cn.f343946e.createBuilder();
        String str = cvVar.f343979b;
        cmVar.copyOnWrite();
        C124675cn cnVar = (C124675cn) cmVar.instance;
        str.getClass();
        cnVar.f343948a |= 1;
        cnVar.f343949b = str;
        String g = C124525f.m203991g(Locale.getDefault());
        cmVar.copyOnWrite();
        C124675cn cnVar2 = (C124675cn) cmVar.instance;
        cnVar2.f343948a |= 2;
        cnVar2.f343950c = g;
        cmVar.copyOnWrite();
        C124675cn cnVar3 = (C124675cn) cmVar.instance;
        cnVar3.f343948a |= 4;
        cnVar3.f343951d = true;
        C60856cj.m92911t(byVar.mo106576b((C124675cn) cmVar.build()), C47810es.m84974n(new C124764l(ajVar)), this.f344197c);
    }

    /* renamed from: e */
    public final void mo106585e(C124698dj djVar, C70862aj ajVar) {
        C47633f i = C47633f.m84733g(this.f344198d.mo106598d(djVar.f344017b)).mo51516i(new C124760h(this, djVar), this.f344196b);
        C124762j jVar = new C124762j(ajVar, djVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(jVar), this.f344196b);
    }

    /* renamed from: f */
    public final void mo106586f(C124700dl dlVar, C70862aj ajVar) {
        C47633f i = C47633f.m84733g(this.f344198d.mo106598d(dlVar.f344022b)).mo51516i(new C124761i(this, dlVar), this.f344196b);
        C124767o oVar = new C124767o(ajVar, dlVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(oVar), this.f344196b);
    }

    /* renamed from: g */
    public final void mo106587g(C70862aj ajVar) {
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128946b |= 8388608;
        acv.f128934M = true;
        C60856cj.m92911t(m204443j((acv) acu.build()), C47810es.m84974n(new C124765m(ajVar)), this.f344196b);
    }

    /* renamed from: h */
    public final void mo106588h(C70862aj ajVar) {
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 1073741824;
        acv.f128970z = true;
        C60856cj.m92911t(m204443j((acv) acu.build()), C47810es.m84974n(new C124766n(ajVar)), this.f344196b);
    }

    /* renamed from: i */
    public final C60870cx mo106608i(C49903dg dgVar) {
        acw acw = (acw) acx.f128971H.createBuilder();
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        daVar.mo53372c(dgVar);
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        C37170h hVar = new C37170h();
        hVar.mo40678c(getClass().getSimpleName());
        hVar.mo40677b((acx) acw.build());
        return this.f344200f.mo40670b(hVar.mo40676a());
    }
}
