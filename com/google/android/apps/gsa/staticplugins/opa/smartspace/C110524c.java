package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c */
/* compiled from: PG */
public final /* synthetic */ class C110524c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110664e f308131a;

    public /* synthetic */ C110524c(C110664e eVar) {
        this.f308131a = eVar;
    }

    public final C60870cx apply(Object obj) {
        C110664e eVar = this.f308131a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) C110664e.f308358a.mo56224b()).mo56372aa(26455)).mo56386p("ZeroStateClientResponse not found in OpaStore. Start WHEN_IS partial sync.");
            return eVar.f308359b.mo98750c(C53121cd.WHEN_IS);
        }
        C58485gu b = eVar.f308360c.mo98847b((C53422nh) axVar.mo56107c());
        if (b.isEmpty()) {
            ((C59052c) ((C59052c) C110664e.f308358a.mo56225c()).mo56372aa(26454)).mo56386p("No valid EventOccurrence found in OpaStore. Start WHEN_IS partial sync.");
            return eVar.f308359b.mo98750c(C53121cd.WHEN_IS);
        }
        ((C59052c) ((C59052c) C110664e.f308358a.mo56224b()).mo56372aa(26453)).mo56386p("Found validEventOccurrences in OpaStore. Skip WHEN_IS partial sync.");
        eVar.f308360c.mo98848c(b);
        return C118826c.f331423b;
    }
}
