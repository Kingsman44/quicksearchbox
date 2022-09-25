package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111792a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59450aa;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g */
/* compiled from: PG */
public final class C112996g {

    /* renamed from: a */
    public static final C59071e f313135a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g");

    /* renamed from: b */
    public static final C121537f f313136b = C121537f.m200840b("surfaceShared/SuggestionDataService", C121511c.f337208a);

    /* renamed from: c */
    public final C112991b f313137c;

    /* renamed from: d */
    public final C68214a f313138d;

    /* renamed from: e */
    public final C86124t f313139e;

    /* renamed from: f */
    public final C68214a f313140f;

    /* renamed from: g */
    public final C68214a f313141g;

    /* renamed from: h */
    public final C112990a f313142h;

    /* renamed from: i */
    public final C68214a f313143i;

    /* renamed from: j */
    public final C111792a f313144j;

    /* renamed from: k */
    public C59450aa f313145k = C59450aa.f157704d;

    /* renamed from: l */
    public Optional f313146l = Optional.empty();

    /* renamed from: m */
    private final C21370a f313147m;

    /* renamed from: n */
    private final C68214a f313148n;

    /* renamed from: o */
    private final C48674ai f313149o;

    /* renamed from: p */
    private final C19167ba f313150p;

    /* renamed from: q */
    private final C90851k f313151q;

    public C112996g(C112991b bVar, C19167ba baVar, C21370a aVar, C68214a aVar2, C90851k kVar, C68214a aVar3, C48674ai aiVar, C86124t tVar, C68214a aVar4, C68214a aVar5, C112990a aVar6, C68214a aVar7, C111792a aVar8) {
        this.f313137c = bVar;
        this.f313147m = aVar;
        this.f313148n = aVar2;
        this.f313151q = kVar;
        this.f313138d = aVar3;
        this.f313149o = aiVar;
        this.f313139e = tVar;
        this.f313150p = baVar;
        this.f313140f = aVar4;
        this.f313141g = aVar5;
        this.f313142h = aVar6;
        this.f313143i = aVar7;
        this.f313144j = aVar8;
    }

    /* renamed from: d */
    private final void m186994d(C60870cx cxVar, String str, long j, C121492b bVar, C121492b bVar2) {
        C60856cj.m92911t(cxVar, new C112995f(this, str, j, bVar, bVar2), this.f313151q.mo85211d("uiThreadExecutor"));
    }

    /* renamed from: a */
    public final C113408es mo99807a(C113408es esVar) {
        if (this.f313139e.mo79746e(C90063do.f249293am) || this.f313146l.isEmpty()) {
            return esVar;
        }
        C113408es esVar2 = (C113408es) this.f313146l.get();
        String p = esVar2.mo100118a().mo100033p();
        String str = this.f313142h.f313121d;
        if (p == null || str == null || !str.startsWith(p)) {
            return esVar;
        }
        C58528ij d = esVar.mo100121d();
        ArrayList arrayList = new ArrayList(esVar.mo100053o());
        C58485gu o = esVar2.mo100053o();
        int size = o.size();
        for (int i = 0; i < size; i++) {
            C113415ez ezVar = (C113415ez) o.get(i);
            if (d.contains(ezVar.mo100211k())) {
                arrayList.add(ezVar);
            }
        }
        C113407er b = esVar.mo100119b();
        b.mo100096f(C113339cj.m187495c(C113339cj.m187496d(arrayList)));
        return b.mo100091a();
    }

    /* renamed from: b */
    public final void mo99808b(C113408es esVar, String str, long j, C121492b bVar) {
        C121492b a = f313136b.mo105233a("fetchLatencyForfallbackSuggestions");
        if (this.f313142h.f313120c.get() > 0) {
            this.f313142h.f313120c.decrementAndGet();
        }
        if (esVar.mo100132m().isPresent()) {
            List<C60870cx> list = (List) esVar.mo100132m().get();
            this.f313142h.f313120c.set(list.size());
            for (C60870cx d : list) {
                m186994d(d, str, j, f313136b.mo105233a("waitForSlowSources"), bVar);
            }
        }
        if (this.f313142h.f313120c.get() == 0 && this.f313142h.f313119b.get() < j) {
            if (str.isEmpty()) {
                this.f313137c.mo99366jG(esVar.mo100118a().mo100016a(), str, j);
                return;
            }
            C113407er b = esVar.mo100119b();
            C113414ey R = C113415ez.m187750R();
            String str2 = str;
            R.mo100164i(str2);
            R.mo100175t(C48672ag.UNKNOWN);
            R.mo100180y(10000);
            R.mo100177v(C48580an.FALLBACK);
            R.mo100167l(10000);
            ((C113386e) R).f313967o = Optional.m71637of(C113300by.QUERY_TEXT);
            b.mo100096f(C113339cj.m187495c(C113339cj.m187496d(C58485gu.m89846n(R.mo100156a()))));
            m186994d(C60856cj.m92900i(b.mo100091a()), str2, j, a, bVar);
        }
    }

    /* renamed from: c */
    public final void mo99809c(String str, Optional optional, C51331dt dtVar) {
        String str2 = this.f313142h.f313121d;
        if (str2 == null || !str2.equals(str) || !optional.isEmpty()) {
            this.f313142h.f313121d = str;
            C121537f fVar = f313136b;
            C121492b a = fVar.mo105233a("updateSuggestionsForPrefix");
            C121492b a2 = fVar.mo105233a("tapasRenderLatency");
            long c = this.f313147m.mo26871c();
            this.f313142h.f313118a.set(c);
            this.f313142h.f313120c.set(1);
            C113405ep a3 = ((C113190cu) this.f313148n.mo27525b()).mo99904b(str, this.f313150p, dtVar, this.f313149o).mo100001a();
            long a4 = a3.mo100016a();
            ((C113388b) this.f313140f.mo27525b()).mo99670e(a4, str);
            ((C113389c) this.f313141g.mo27525b()).mo99630e(a4, "Prefix updated");
            C112992c cVar = new C112992c(this, optional, a3);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(cVar), this.f313151q.mo85210c("lightweightExecutor"));
            fVar.mo105244m("firstFetch", n);
            m186994d(n, str, c, a, a2);
            return;
        }
        ((C59052c) ((C59052c) f313135a.mo56226d()).mo56372aa(27897)).mo56386p("updateSuggestionsForPrefix same prefix");
    }
}
