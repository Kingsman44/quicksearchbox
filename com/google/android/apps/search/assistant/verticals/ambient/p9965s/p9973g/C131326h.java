package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9973g;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10001g.C131666e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.g.h */
/* compiled from: PG */
public final class C131326h implements C131258a {

    /* renamed from: a */
    public static final C58528ij f359024a = new C58759qy(39);

    /* renamed from: f */
    private static final C58528ij f359025f = new C58759qy(C50794cr.HOTEL_CHECK_IN);

    /* renamed from: b */
    public final C58974d f359026b;

    /* renamed from: c */
    public final C131666e f359027c;

    /* renamed from: d */
    public final C131251t f359028d;

    /* renamed from: e */
    public final C60887da f359029e;

    /* renamed from: g */
    private final boolean f359030g;

    public C131326h(boolean z, C130603a aVar, C131666e eVar, C131251t tVar, C60887da daVar) {
        this.f359030g = z;
        this.f359026b = aVar.mo109740b(this);
        this.f359027c = eVar;
        this.f359028d = tVar;
        this.f359029e = daVar;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(((C58759qy) f359025f).f156534a);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        C123712af afVar;
        C123746bm bmVar2 = (C123746bm) obj;
        if (!this.f359030g) {
            ((C58970a) ((C58970a) this.f359026b.mo56224b()).mo56372aa(39203)).mo56386p("Hotel feature is disabled.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        List<C123744bk> list = (List) Collection.EL.stream(bmVar2.f341820a).filter(C131319a.f359017a).collect(Collectors.toCollection(C131320b.f359018a));
        C58480gp e = C58485gu.m89837e();
        HashMap hashMap = new HashMap();
        for (C123744bk bkVar : list) {
            if (bkVar.f341808c == 38) {
                afVar = (C123712af) bkVar.f341809d;
            } else {
                afVar = C123712af.f341704k;
            }
            String str = afVar.f341713h;
            if (str.isEmpty()) {
                e.mo55395g(bkVar);
            } else {
                if (((String) C58557jl.m90131l(C58869cf.m90936b(new C58903m(':')).mo56155i(bkVar.f341812g))).equals("loc")) {
                    hashMap.put(str, bkVar);
                }
                Map.EL.putIfAbsent(hashMap, str, bkVar);
            }
        }
        e.mo55396h(hashMap.values());
        C58485gu f = e.mo55394f();
        ((C58970a) ((C58970a) this.f359026b.mo56224b()).mo56372aa(39201)).mo56393w("#deduplicateByGroupingId() Proactive data size {%s} deduped size {%s} check-in cards.", list.size(), ((C58724pq) f).f156474d);
        return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(f).map(new C131321c(this)).collect(Collectors.toCollection(C131320b.f359018a)))).mo51515h(C131322d.f359020a, this.f359029e);
    }
}
