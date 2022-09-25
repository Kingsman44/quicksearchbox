package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.connectivity.C25749c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.f */
/* compiled from: PG */
public final /* synthetic */ class C27989f implements C25749c {

    /* renamed from: a */
    public final /* synthetic */ OfflineDownloadManagerImpl f76186a;

    public /* synthetic */ C27989f(OfflineDownloadManagerImpl offlineDownloadManagerImpl) {
        this.f76186a = offlineDownloadManagerImpl;
    }

    /* renamed from: a */
    public final void mo30486a(boolean z) {
        OfflineDownloadManagerImpl offlineDownloadManagerImpl = this.f76186a;
        ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56224b()).mo56372aa(50088)).mo56389s("connectivityChanged: %b", Boolean.valueOf(z));
        if (z && offlineDownloadManagerImpl.f76161h.mo30907k()) {
            C60870cx cxVar = offlineDownloadManagerImpl.f76167n;
            cxVar.getClass();
            C60845bz n = C47810es.m84974n(new C28004u(offlineDownloadManagerImpl));
            C60856cj.m92911t(cxVar, C47810es.m84974n(n), offlineDownloadManagerImpl.f76160g);
        }
    }
}
