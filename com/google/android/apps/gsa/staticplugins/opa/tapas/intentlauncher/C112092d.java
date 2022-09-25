package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.d */
/* compiled from: PG */
final class C112092d implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C112101i f311297a;

    public C112092d(C112101i iVar) {
        this.f311297a = iVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a.ordinal() == 24) {
            this.f311297a.mo99394a().mo99359d();
        }
    }
}
