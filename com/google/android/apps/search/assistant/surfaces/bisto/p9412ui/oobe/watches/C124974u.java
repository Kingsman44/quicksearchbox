package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.u */
/* compiled from: PG */
public final /* synthetic */ class C124974u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124977x f344823a;

    /* renamed from: b */
    public final /* synthetic */ String f344824b;

    /* renamed from: c */
    public final /* synthetic */ String f344825c;

    public /* synthetic */ C124974u(C124977x xVar, String str, String str2) {
        this.f344823a = xVar;
        this.f344824b = str;
        this.f344825c = str2;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C124977x xVar = this.f344823a;
        String str = this.f344824b;
        String str2 = this.f344825c;
        String str3 = (String) obj;
        if (xVar.f344843g) {
            cxVar = xVar.mo106757a(str2, str3);
        } else {
            C59104x b = C124977x.f344835a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DataLayerInitHelper");
            ((C59052c) ((C59052c) b).mo56372aa(36376)).mo56386p("Sending PSK with delay");
            C124966m mVar = new C124966m(xVar, str2, str3);
            cxVar = C60856cj.m92902k(C47810es.m84965e(mVar), 2000, TimeUnit.MILLISECONDS, xVar.f344839c);
        }
        return C47633f.m84733g(cxVar).mo51515h(new C124970q(xVar), C60826bg.f164896a).mo51516i(new C124971r(xVar, str), xVar.f344840d).mo51516i(new C124972s(xVar, str), xVar.f344840d);
    }
}
