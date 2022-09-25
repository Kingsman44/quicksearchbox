package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9974h;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10002h.C131672e;
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

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.h.c */
/* compiled from: PG */
public final /* synthetic */ class C131329c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131334h f359033a;

    public /* synthetic */ C131329c(C131334h hVar) {
        this.f359033a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C131334h hVar = this.f359033a;
        C123744bk bkVar = (C123744bk) obj;
        ((C58970a) ((C58970a) hVar.f359040b.mo56224b()).mo56372aa(39204)).mo56386p("#Generate hotel check-out data.");
        C131672e eVar = hVar.f359041c;
        if (bkVar.f341808c == 39) {
            cxVar = eVar.mo110251a((C123714ah) bkVar.f341809d, bkVar.f341812g, bkVar.f341810e);
        } else {
            C59104x d = C131672e.f359763a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SSHotelCheckOutIH");
            ((C59052c) ((C59052c) d).mo56372aa(39174)).mo56386p("Proactive data doesn't contain hotel check out data.");
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C131327a aVar = new C131327a(hVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(aVar), hVar.f359043e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
