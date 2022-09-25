package com.google.android.apps.gsa.search.shared.service.p6940d;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.shared.service.d.a */
/* compiled from: PG */
public final /* synthetic */ class C88479a implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C88244um f239186a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f239187b;

    public /* synthetic */ C88479a(C88244um umVar, SettableFuture settableFuture) {
        this.f239186a = umVar;
        this.f239187b = settableFuture;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um umVar = this.f239186a;
        SettableFuture settableFuture = this.f239187b;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == umVar) {
            settableFuture.mo57356n(serviceEventData);
        }
    }
}
