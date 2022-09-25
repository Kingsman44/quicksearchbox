package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24449d;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.i */
/* compiled from: PG */
public final /* synthetic */ class C27992i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ OfflineDownloadManagerImpl f76191a;

    /* renamed from: b */
    public final /* synthetic */ C24449d f76192b;

    public /* synthetic */ C27992i(OfflineDownloadManagerImpl offlineDownloadManagerImpl, C24449d dVar) {
        this.f76191a = offlineDownloadManagerImpl;
        this.f76192b = dVar;
    }

    public final void run() {
        OfflineDownloadManagerImpl offlineDownloadManagerImpl = this.f76191a;
        C24449d dVar = this.f76192b;
        if (dVar.mo29900e() == null) {
            ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56226d()).mo56372aa(50099)).mo56386p("download event locale is null, unable to notify UI");
            return;
        }
        Locale e = dVar.mo29900e();
        String a = C28136y.m52430a(e);
        int b = dVar.mo29897b();
        if (b == 0) {
            ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56225c()).mo56372aa(50098)).mo56389s("Unrecognized DownloadEventType: %s.", dVar);
        } else if (b != 1) {
            int i = 2;
            if (b == 2) {
                offlineDownloadManagerImpl.f76166m.mo30247b(1, a, 2, offlineDownloadManagerImpl.mo33452y(e), true);
                offlineDownloadManagerImpl.mo33448u(e, C25327c.DOWNLOADED);
            } else if (b == 4) {
                if (dVar.mo29896a() != 4) {
                    i = 3;
                }
                offlineDownloadManagerImpl.f76166m.mo30247b(i, a, 2, offlineDownloadManagerImpl.mo33452y(e), true);
                offlineDownloadManagerImpl.mo33448u(e, C25327c.FAILED);
            }
        } else {
            offlineDownloadManagerImpl.mo33448u(e, C25327c.DOWNLOADING);
        }
    }
}
