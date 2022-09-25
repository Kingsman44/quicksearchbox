package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24442ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.r */
/* compiled from: PG */
final class C28001r implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56226d()).mo56382g(th)).mo56372aa(50066)).mo56389s("download failed for ocr %s", th.getMessage());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        for (C24440ab abVar : (List) obj) {
            if (abVar == null || abVar.f66921c.size() <= 0) {
                ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56226d()).mo56372aa(50067)).mo56386p("Downloaded in offline translate failed. Model may be misconfigured.");
            } else {
                for (C24442ad adVar : abVar.f66921c) {
                    C58974d dVar = OfflineDownloadManagerImpl.f76145a;
                    String str = adVar.f66928b;
                    String str2 = adVar.f66929c;
                }
            }
        }
    }
}
