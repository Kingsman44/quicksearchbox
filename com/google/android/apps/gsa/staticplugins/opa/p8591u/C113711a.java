package com.google.android.apps.gsa.staticplugins.opa.p8591u;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.u.a */
/* compiled from: PG */
public final class C113711a implements C87682aj {

    /* renamed from: a */
    public boolean f314914a;

    /* renamed from: b */
    public long f314915b;

    /* renamed from: c */
    private final Context f314916c;

    public C113711a(Context context, C107710u uVar) {
        this.f314916c = context;
        uVar.mo96220c(this, C88244um.SET_FINAL_RECOGNIZED_TEXT);
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.SET_FINAL_RECOGNIZED_TEXT && this.f314914a) {
            Intent intent = new Intent("com.google.android.systemui.OPA_ELMYRA_QUERY_SUBMITTED");
            intent.putExtra("latency_id", this.f314915b);
            intent.addFlags(268435456);
            this.f314916c.sendBroadcast(intent, "com.android.systemui.permission.SELF");
        }
    }
}
