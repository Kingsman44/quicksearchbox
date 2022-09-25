package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.b */
/* compiled from: PG */
public final /* synthetic */ class C123821b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123910h f342056a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f342057b;

    public /* synthetic */ C123821b(C123910h hVar, C58480gp gpVar) {
        this.f342056a = hVar;
        this.f342057b = gpVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C123910h hVar = this.f342056a;
        C58485gu f = this.f342057b.mo55394f();
        if (f.isEmpty() || !hVar.f342260c.isPresent()) {
            return C60866ct.f164955a;
        }
        C59104x b = C123910h.f342257a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.GcmManager");
        ((C59052c) ((C59052c) b).mo56372aa(35189)).mo56386p("Find validity controller!");
        return ((C124167p) hVar.f342260c.get()).mo106310d(f);
    }
}
