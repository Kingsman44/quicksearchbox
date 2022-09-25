package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9102c.p9103a;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C120603b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C59071e f335451a;

    /* renamed from: b */
    public final /* synthetic */ C120580d f335452b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f335453c;

    public /* synthetic */ C120603b(C59071e eVar, C120580d dVar, C60870cx cxVar) {
        this.f335451a = eVar;
        this.f335452b = dVar;
        this.f335453c = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C59071e eVar = this.f335451a;
        C120580d dVar = this.f335452b;
        C60870cx cxVar = this.f335453c;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(35530)).mo56386p("#hybridFulfill: On-device fulfillment encountered an exception. Using online result");
        dVar.mo104845a(C120578b.ONLINE, true);
        return cxVar;
    }
}
