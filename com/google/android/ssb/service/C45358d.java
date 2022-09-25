package com.google.android.ssb.service;

import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.ssb.service.d */
/* compiled from: PG */
final class C45358d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f118597a;

    /* renamed from: b */
    final /* synthetic */ SsbService f118598b;

    public C45358d(SsbService ssbService, boolean z) {
        this.f118598b = ssbService;
        this.f118597a = z;
    }

    public final void run() {
        boolean z;
        SsbService ssbService = this.f118598b;
        boolean z2 = this.f118597a;
        ((C59052c) ((C59052c) SsbService.f118566a.mo56224b()).mo56372aa(54364)).mo56389s("requestHotwordForNavigation shouldStart: %b", Boolean.valueOf(z2));
        if (((C89994f) ssbService.f118573h.mo27525b()).mo83822k() && !ssbService.f118567b.f118615j.get()) {
            C45363i iVar = ssbService.f118567b;
            synchronized (iVar.f118609d) {
                z = iVar.f118610e.f118552b;
            }
            if ((z2 && !z) || (!z2 && ssbService.f118583r)) {
                if (z2) {
                    if (!ssbService.f118583r) {
                        ssbService.bindService(new Intent("com.google.android.googlequicksearchbox.HOTWORD_SERVICE").setPackage("com.google.android.googlequicksearchbox"), ssbService.f118581p, 1);
                        if (!ssbService.f118583r) {
                            ((C59052c) ((C59052c) SsbService.f118566a.mo56226d()).mo56372aa(54359)).mo56386p("Hotword service is not available.");
                            return;
                        }
                        return;
                    }
                    ssbService.mo49362d(true);
                } else if (ssbService.f118583r) {
                    ssbService.mo49362d(false);
                    ssbService.unbindService(ssbService.f118581p);
                    ssbService.f118583r = false;
                    ssbService.f118567b.mo49379f(false);
                }
            }
        }
    }
}
