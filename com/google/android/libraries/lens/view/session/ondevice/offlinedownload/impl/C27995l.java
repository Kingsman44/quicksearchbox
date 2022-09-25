package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.gms.tasks.C146039s;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.l */
/* compiled from: PG */
public final /* synthetic */ class C27995l implements C146039s {

    /* renamed from: a */
    public final /* synthetic */ OfflineDownloadManagerImpl f76197a;

    public /* synthetic */ C27995l(OfflineDownloadManagerImpl offlineDownloadManagerImpl) {
        this.f76197a = offlineDownloadManagerImpl;
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        OfflineDownloadManagerImpl offlineDownloadManagerImpl = this.f76197a;
        ((C58970a) ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56226d()).mo56382g(exc)).mo56372aa(50095)).mo56386p("Failed to download the on-device native library..");
        offlineDownloadManagerImpl.mo33447t(C25327c.FAILED);
    }
}
