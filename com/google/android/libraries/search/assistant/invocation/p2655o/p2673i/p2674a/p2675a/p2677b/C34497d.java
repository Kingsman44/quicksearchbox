package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import kotlinx.coroutines.C71816z;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.d */
/* compiled from: PG */
final class C34497d implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C34504k f91671a;

    /* renamed from: b */
    public final C71816z f91672b = new C71816z();

    public C34497d(C34504k kVar) {
        this.f91671a = kVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C69664n.m101061g(serviceEventData, "serviceEventData");
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.ON_SERVICE_CONNECTED) {
            this.f91672b.mo62909P(C69788q.f186170a);
        }
    }
}
