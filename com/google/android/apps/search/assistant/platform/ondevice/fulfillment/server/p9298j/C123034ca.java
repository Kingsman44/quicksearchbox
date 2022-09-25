package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9262b.C122117b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p5030q.C65159dt;
import java.util.ArrayList;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ca */
/* compiled from: PG */
public final /* synthetic */ class C123034ca implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123036cc f340594a;

    public /* synthetic */ C123034ca(C123036cc ccVar) {
        this.f340594a = ccVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C123036cc ccVar = this.f340594a;
        Optional optional = (Optional) ccVar.f340597b.apply(obj);
        if (optional.isEmpty()) {
            return C60856cj.m92900i(obj);
        }
        C65159dt dtVar = (C65159dt) optional.get();
        if (ccVar.f340598c.isEmpty() || !dtVar.equals((C65159dt) C58557jl.m90131l(ccVar.f340598c))) {
            ccVar.f340598c.add(dtVar);
            int i = ccVar.f340599d;
            if (i == 3) {
                String b = C123036cc.m202369b(ccVar.f340598c);
                ((C59052c) ccVar.f340596a.mo105766e().mo56372aa(35135)).mo56389s("Failing because no more attempts left. Missing context: %s", b);
                return C60856cj.m92899h(new C122872ec("PopWrapperHelperImpl", String.format(Locale.ENGLISH, "Can't get POP response because of missing context %s", new Object[]{b})));
            }
            ccVar.f340599d = i + 1;
            ArrayList arrayList = new ArrayList();
            C122117b bVar = new C122117b(ccVar.f340600e);
            if (dtVar.f176341a || dtVar.f176342b) {
                ccVar.mo105843c("alarm", arrayList, bVar);
                ccVar.mo105843c("timer", arrayList, bVar);
            }
            if (dtVar.f176343c) {
                ccVar.mo105843c("media", arrayList, bVar);
            }
            if (dtVar.f176345e) {
                ccVar.mo105843c("call", arrayList, bVar);
            }
            if (arrayList.isEmpty()) {
                cxVar = C60856cj.m92899h(new C122872ec("PopWrapperHelperImpl", "Unsupported missing context in POP request."));
            } else {
                cxVar = C60856cj.m92896e(arrayList);
            }
            C123032bz bzVar = new C123032bz(ccVar);
            return C60922j.m93045h(cxVar, C47810es.m84966f(bzVar), C60826bg.f164896a);
        }
        String b2 = C123036cc.m202369b(ccVar.f340598c);
        ((C59052c) ccVar.f340596a.mo105766e().mo56372aa(35136)).mo56389s("Failing because of repeated missing context: %s", b2);
        return C60856cj.m92899h(new C122872ec("PopWrapperHelperImpl", String.format(Locale.ENGLISH, "Repeated missing context request %s", new Object[]{b2})));
    }
}
