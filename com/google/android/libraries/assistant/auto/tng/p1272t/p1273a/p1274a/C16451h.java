package com.google.android.libraries.assistant.auto.tng.p1272t.p1273a.p1274a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.p1272t.p1273a.C16443a;
import com.google.android.libraries.assistant.auto.tng.p1272t.p1273a.p1275b.C16452a;
import com.google.apps.tiktok.experiments.phenotype.C46990dc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.t.a.a.h */
/* compiled from: PG */
public final class C16451h implements C16443a {

    /* renamed from: a */
    private static final C59071e f48358a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.t.a.a.h");

    /* renamed from: b */
    private final C46990dc f48359b;

    /* renamed from: c */
    private final C46990dc f48360c;

    /* renamed from: d */
    private final Map f48361d;

    public C16451h(C46990dc dcVar, C46990dc dcVar2, Map map) {
        this.f48359b = dcVar;
        this.f48360c = dcVar2;
        this.f48361d = map;
    }

    /* renamed from: b */
    public static C58485gu m33404b(Map map) {
        return (C58485gu) Collection.EL.stream(map.entrySet()).filter(C16444a.f48349a).map(C16445b.f48350a).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public static List m33405c(C60870cx cxVar) {
        try {
            return (List) C60856cj.m92909r(cxVar);
        } catch (Exception e) {
            C59104x d = f48358a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ExperimentTokenFetcher");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(46307)).mo56386p("Can't get server tokens");
            return C58485gu.m89845m();
        }
    }

    /* renamed from: a */
    public final C60870cx mo22922a(C12989g gVar) {
        C60870cx cxVar;
        C60870cx a = this.f48359b.mo50962a();
        C16446c cVar = C16446c.f48351a;
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(cVar), C60826bg.f164896a);
        C60870cx a2 = this.f48360c.mo50962a();
        C16447d dVar = C16447d.f48352a;
        C60870cx g2 = C60922j.m93044g(a2, C47810es.m84963c(dVar), C60826bg.f164896a);
        if (this.f48361d.containsKey(gVar)) {
            cxVar = ((C16452a) ((C69464a) this.f48361d.get(gVar)).mo17428b()).mo20172a();
        } else {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        }
        return C47638k.m84751b(g, g2, cxVar).mo51520a(new C16448e(g2, g, cxVar), C60826bg.f164896a);
    }
}
