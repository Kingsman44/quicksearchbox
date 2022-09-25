package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9969d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131246o;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9999e.C131658a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.d.g */
/* compiled from: PG */
public final /* synthetic */ class C131299g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131302j f358969a;

    public /* synthetic */ C131299g(C131302j jVar) {
        this.f358969a = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C131302j jVar = this.f358969a;
        C123744bk bkVar = (C123744bk) obj;
        ((C58970a) ((C58970a) jVar.f358974b.mo56224b()).mo56372aa(39189)).mo56386p("#Generate flight landing data.");
        C131658a aVar = jVar.f358975c;
        if (bkVar.f341808c == 37) {
            boolean z = bkVar.f341814i;
            int b = C131246o.m213739b(bkVar.f341812g, bkVar.f341810e);
            cxVar = aVar.f359735d.mo110203a((C123789r) bkVar.f341809d, b, z, C50794cr.FLIGHT_LANDING).mo110197a();
        } else {
            C59104x d = C131658a.f359732a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SSFlightLandingIH");
            ((C59052c) ((C59052c) d).mo56372aa(39154)).mo56386p("proactive data doesn't contain flight landing data.");
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        return C47633f.m84733g(cxVar).mo51516i(new C131297e(jVar, bkVar), jVar.f358977e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
