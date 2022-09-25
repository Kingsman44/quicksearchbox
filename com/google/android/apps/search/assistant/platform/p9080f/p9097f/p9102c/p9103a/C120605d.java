package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9102c.p9103a;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C120605d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C59071e f335455a;

    /* renamed from: b */
    public final /* synthetic */ C120580d f335456b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f335457c;

    public /* synthetic */ C120605d(C59071e eVar, C120580d dVar, C60870cx cxVar) {
        this.f335455a = eVar;
        this.f335456b = dVar;
        this.f335457c = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C59071e eVar = this.f335455a;
        C120580d dVar = this.f335456b;
        C60870cx cxVar = this.f335457c;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(35532)).mo56386p("ON-DEVICE(failure): Using online result");
        dVar.mo104850f(C120578b.ONLINE);
        return C47633f.m84733g(cxVar).mo51516i(C120604c.f335454a, C60826bg.f164896a);
    }
}
