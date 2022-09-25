package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.e */
/* compiled from: PG */
public final /* synthetic */ class C27988e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ OfflineDownloadManagerImpl f76185a;

    public /* synthetic */ C27988e(OfflineDownloadManagerImpl offlineDownloadManagerImpl) {
        this.f76185a = offlineDownloadManagerImpl;
    }

    public final void run() {
        OfflineDownloadManagerImpl offlineDownloadManagerImpl = this.f76185a;
        if (offlineDownloadManagerImpl.f76165l.mo29460c()) {
            offlineDownloadManagerImpl.f76157d = C25327c.DOWNLOADED;
        } else {
            offlineDownloadManagerImpl.f76157d = C25327c.DOWNLOADABLE;
        }
        ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56224b()).mo56372aa(50096)).mo56389s("Fetched the on-device native library download state: %s", offlineDownloadManagerImpl.f76157d);
    }
}
