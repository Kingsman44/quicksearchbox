package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.mdi.download.hj */
/* compiled from: PG */
final class C29639hj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C28742bt f80258a;

    public C29639hj(C28742bt btVar) {
        this.f80258a = btVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f80258a.mo33125b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C29690f fVar = (C29690f) obj;
        try {
            this.f80258a.mo33124a(fVar);
        } catch (Exception e) {
            C29045l.m53946r(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", fVar.f80411b);
        }
    }
}
