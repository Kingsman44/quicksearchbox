package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.db */
/* compiled from: PG */
public final /* synthetic */ class C122830db implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340209a;

    /* renamed from: b */
    public final /* synthetic */ C122430bv f340210b;

    public /* synthetic */ C122830db(C122870ea eaVar, C122430bv bvVar) {
        this.f340209a = eaVar;
        this.f340210b = bvVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122870ea eaVar = this.f340209a;
        C122790cx cxVar = new C122790cx(eaVar, this.f340210b);
        return eaVar.mo105768e(C60856cj.m92905n(C47810es.m84965e(cxVar), eaVar.f340308i), "Failed to process PARAMS request");
    }
}
