package com.google.android.apps.gsa.searchnow;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.debug.C91022f;

/* renamed from: com.google.android.apps.gsa.searchnow.ak */
/* compiled from: PG */
final class C88859ak implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C88861am f240568a;

    /* renamed from: b */
    private boolean f240569b;

    public C88859ak(C88861am amVar) {
        this.f240568a = amVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 13) {
            this.f240568a.mo82650k();
            this.f240568a.mo82649j();
            if (!this.f240569b) {
                ((C91022f) this.f240568a.f240615p.mo27525b()).mo85301a(this.f240568a);
                this.f240569b = true;
            }
        } else if (ordinal == 35) {
            C88861am amVar = this.f240568a;
            if (amVar.f240581K) {
                amVar.f240602c.mo76884f();
            }
        }
    }
}
