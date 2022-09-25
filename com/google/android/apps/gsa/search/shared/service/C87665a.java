package com.google.android.apps.gsa.search.shared.service;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;

/* renamed from: com.google.android.apps.gsa.search.shared.service.a */
/* compiled from: PG */
final class C87665a implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C87690b f236968a;

    public C87665a(C87690b bVar) {
        this.f236968a = bVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a != C88244um.HAND_OVER) {
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            if (a2 != C88244um.START_ACTIVITY || !((Intent) serviceEventData.mo81912b(Intent.class)).getBooleanExtra("EXTRA_IS_HANDING_OVER", false)) {
                return;
            }
        }
        this.f236968a.f237040d = true;
    }
}
