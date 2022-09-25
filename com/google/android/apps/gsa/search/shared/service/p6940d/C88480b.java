package com.google.android.apps.gsa.search.shared.service.p6940d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.shared.service.d.b */
/* compiled from: PG */
public final /* synthetic */ class C88480b implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f239188a;

    public /* synthetic */ C88480b(SettableFuture settableFuture) {
        this.f239188a = settableFuture;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        SettableFuture settableFuture = this.f239188a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.UNBIND_BACKGROUND_CLIENT) {
            settableFuture.mo57356n(C118826c.f331422a);
        }
    }
}
