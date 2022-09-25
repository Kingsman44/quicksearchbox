package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124698dj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.h */
/* compiled from: PG */
public final /* synthetic */ class C124760h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124774v f344170a;

    /* renamed from: b */
    public final /* synthetic */ C124698dj f344171b;

    public /* synthetic */ C124760h(C124774v vVar, C124698dj djVar) {
        this.f344170a = vVar;
        this.f344171b = djVar;
    }

    public final C60870cx apply(Object obj) {
        C124774v vVar = this.f344170a;
        C124698dj djVar = this.f344171b;
        C124679cr crVar = (C124679cr) obj;
        C59104x b = C124774v.f344195a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) b).mo56372aa(36297)).mo56389s("Updating PR to: %b", Boolean.valueOf(djVar.f344018c));
        C124719q qVar = C124719q.GACS_DEVICE;
        C124719q a = C124719q.m204380a(crVar.f343961d);
        if (a == null) {
            a = C124719q.UNKNOWN_DEVICE_CATEGORY;
        }
        if (!qVar.equals(a)) {
            C59104x d = C124774v.f344195a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoSearchService");
            ((C59052c) ((C59052c) d).mo56372aa(36298)).mo56386p("Non-Gacs PR update request");
            return C60856cj.m92900i(crVar);
        }
        C60870cx cxVar = C60866ct.f164955a;
        if (crVar.f343963f) {
            if ((crVar.f343958a & 128) != 0) {
                C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
                String str = crVar.f343966i;
                dfVar.copyOnWrite();
                C49903dg dgVar = (C49903dg) dfVar.instance;
                str.getClass();
                dgVar.f129714a |= 1;
                dgVar.f129715b = str;
                C49875cf cfVar = C49875cf.ASSISTANT_SDK;
                dfVar.copyOnWrite();
                C49903dg dgVar2 = (C49903dg) dfVar.instance;
                dgVar2.f129716c = cfVar.f129621v;
                dgVar2.f129714a |= 2;
                C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
                int i = true != djVar.f344018c ? 3 : 2;
                cnVar.copyOnWrite();
                C49891cv cvVar = (C49891cv) cnVar.instance;
                cvVar.f129666d = i - 1;
                cvVar.f129663a |= 2;
                dfVar.copyOnWrite();
                C49903dg dgVar3 = (C49903dg) dfVar.instance;
                C49891cv cvVar2 = (C49891cv) cnVar.build();
                cvVar2.getClass();
                dgVar3.f129719f = cvVar2;
                dgVar3.f129714a |= 32;
                cxVar = vVar.mo106608i((C49903dg) dfVar.build());
            } else {
                cxVar = C60856cj.m92899h(new IllegalArgumentException("No AssistantDeviceId for ".concat(String.valueOf(djVar.f344017b))));
            }
        }
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C124756d(vVar, djVar)), vVar.f344196b);
    }
}
