package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.concurrent.C60845bz;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.u */
/* compiled from: PG */
final class C28004u implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ OfflineDownloadManagerImpl f76205a;

    public C28004u(OfflineDownloadManagerImpl offlineDownloadManagerImpl) {
        this.f76205a = offlineDownloadManagerImpl;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56226d()).mo56382g(th)).mo56372aa(50074)).mo56386p("Failed to read queued language packs");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C58800sl lA = C58495hd.m89898l(this.f76205a.f76155b).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            Locale locale = (Locale) entry.getKey();
            if (locale != null) {
                if (((C28005v) entry.getValue()) == C28005v.DOWNLOAD_TYPE_FOREGROUND) {
                    this.f76205a.f76164k.mo19974a(C37194a.f98528bl.mo40812e(C59898bg.f161867w, OfflineDownloadManagerImpl.m52118s(C28136y.m52430a(locale))));
                    this.f76205a.mo33451x(locale);
                } else {
                    this.f76205a.mo33440m(locale);
                }
            }
        }
    }
}
