package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8501a;

import com.google.android.apps.gsa.shared.p7066m.C90035cn;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112465aj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48647h;
import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C111295j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C111296k f309702a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f309703b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f309704c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f309705d;

    public /* synthetic */ C111295j(C111296k kVar, C60870cx cxVar, C113405ep epVar, C60870cx cxVar2) {
        this.f309702a = kVar;
        this.f309703b = cxVar;
        this.f309704c = epVar;
        this.f309705d = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C111296k kVar = this.f309702a;
        C60870cx cxVar = this.f309703b;
        C113405ep epVar = this.f309704c;
        C60870cx cxVar2 = this.f309705d;
        try {
            if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
                C58976aa aaVar = C58975e.f156826a;
                return C60856cj.m92900i(C113408es.f314036b);
            }
            Map map = (Map) C60856cj.m92909r(cxVar2);
            Optional map2 = ((C112471ap) kVar.f309709c.mo27525b()).mo99543n(C48634bw.APP_DONATION_SIGNAL).map(C112465aj.f311982a);
            C113407er p = C113408es.m187705p();
            if (map2.isEmpty()) {
                C59104x d = C111296k.f309706a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasDonationSource");
                ((C59052c) ((C59052c) d).mo56372aa(27145)).mo56386p("Donation signal not present");
                return C60856cj.m92900i(p.mo100091a());
            }
            C49337n nVar = ((C48647h) map2.get()).f125733b;
            if (nVar == null) {
                nVar = C49337n.f127527b;
            }
            Collection collection = nVar.f127529a;
            if (!kVar.f309712f.mo79746e(C90035cn.f248378c) || !epVar.mo100024h().equals(C48674ai.GEMINI)) {
                collection = (List) Collection.EL.stream(collection).filter(C111288c.f309692a).collect(C58370cn.f155946a);
            }
            C60870cx o = C60856cj.m92906o((C58485gu) Collection.EL.stream(collection).map(new C111289d(kVar, epVar)).filter(new C111290e(epVar)).map(new C111291f(kVar, map)).collect(C58370cn.f155946a));
            C111292g gVar = new C111292g(p);
            return C60922j.m93044g(o, C47810es.m84963c(gVar), kVar.f309716j);
        } catch (ExecutionException e) {
            C59104x d2 = C111296k.f309706a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "TapasDonationSource");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(27146)).mo56386p("#fetchSuggestionsInternal: Exception");
            return C60856cj.m92899h(e);
        }
    }
}
