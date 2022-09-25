package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.ae */
/* compiled from: PG */
public final /* synthetic */ class C123814ae implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123819aj f342041a;

    /* renamed from: b */
    public final /* synthetic */ List f342042b;

    public /* synthetic */ C123814ae(C123819aj ajVar, List list) {
        this.f342041a = ajVar;
        this.f342042b = list;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C123819aj ajVar = this.f342041a;
        List<C60870cx> list = this.f342042b;
        C58480gp e = C58485gu.m89837e();
        for (C60870cx r : list) {
            e.mo55396h((Iterable) C60856cj.m92909r(r));
        }
        C59104x b = C123819aj.f342047a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.TipsDataController");
        ((C59052c) ((C59052c) b).mo56372aa(35242)).mo56386p("Success to write to pcp database.");
        if (ajVar.f342054h.isPresent()) {
            return ((C124167p) ajVar.f342054h.get()).mo106310d(e.mo55394f());
        }
        return C60866ct.f164955a;
    }
}
