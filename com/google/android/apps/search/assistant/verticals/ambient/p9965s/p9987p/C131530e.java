package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9987p;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131246o;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9994b.C131598a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.p.e */
/* compiled from: PG */
public final /* synthetic */ class C131530e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131533h f359401a;

    public /* synthetic */ C131530e(C131533h hVar) {
        this.f359401a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C131533h hVar = this.f359401a;
        C123744bk bkVar = (C123744bk) obj;
        ((C58970a) ((C58970a) hVar.f359406b.mo56224b()).mo56372aa(39303)).mo56386p("#Generate local calendar data.");
        C131598a aVar = hVar.f359407c;
        if (bkVar.f341808c == 14) {
            C123787p pVar = (C123787p) bkVar.f341809d;
            if (!aVar.mo110207b(pVar)) {
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                boolean z = bkVar.f341814i;
                cxVar = aVar.f359556d.mo110203a(pVar, C131246o.m213738a(pVar), z, C50794cr.CALENDAR).mo110197a();
            }
        } else {
            ((C58970a) ((C58970a) aVar.f359553a.mo56226d()).mo56372aa(39113)).mo56386p("proactive data doesn't contain local calendar data.");
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        return C47633f.m84733g(cxVar).mo51516i(new C131528c(hVar, bkVar), hVar.f359409e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
