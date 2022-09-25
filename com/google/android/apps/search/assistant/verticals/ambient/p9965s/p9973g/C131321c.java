package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9973g;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10001g.C131666e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.g.c */
/* compiled from: PG */
public final /* synthetic */ class C131321c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131326h f359019a;

    public /* synthetic */ C131321c(C131326h hVar) {
        this.f359019a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C131326h hVar = this.f359019a;
        C123744bk bkVar = (C123744bk) obj;
        ((C58970a) ((C58970a) hVar.f359026b.mo56224b()).mo56372aa(39202)).mo56386p("#Generate hotel check in data.");
        C131666e eVar = hVar.f359027c;
        if (bkVar.f341808c == 38) {
            cxVar = eVar.mo110249a((C123712af) bkVar.f341809d, bkVar.f341812g, bkVar.f341810e);
        } else {
            C59104x d = C131666e.f359749a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SSHotelCheckInIH");
            ((C59052c) ((C59052c) d).mo56372aa(39167)).mo56386p("proactive data doesn't contain hotel check in data.");
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C131325g gVar = new C131325g(hVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(gVar), hVar.f359029e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
