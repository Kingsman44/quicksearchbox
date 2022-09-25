package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.c */
/* compiled from: PG */
public final /* synthetic */ class C107136c implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C107144k f298213a;

    public /* synthetic */ C107136c(C107144k kVar) {
        this.f298213a = kVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C107144k kVar = this.f298213a;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a.ordinal() == 99 && !kVar.mo95801f().mo56113h()) {
            kVar.f298232k.mo95793b();
            kVar.f298232k.f298207b = false;
        }
    }
}
