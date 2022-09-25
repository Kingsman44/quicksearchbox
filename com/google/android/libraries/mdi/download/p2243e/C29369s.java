package com.google.android.libraries.mdi.download.p2243e;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.mdi.download.e.s */
/* compiled from: PG */
final class C29369s implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C29353c f79600a;

    /* renamed from: b */
    final /* synthetic */ C29348ab f79601b;

    public C29369s(C29348ab abVar, C29353c cVar) {
        this.f79601b = abVar;
        this.f79600a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C29045l.m53938j(th, "%s: Download Future failed", "DownloaderImp");
        this.f79600a.mo34575b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C60870cx a = this.f79600a.mo34574a();
        C29368r rVar = new C29368r();
        C60856cj.m92911t(a, C47810es.m84974n(rVar), this.f79601b.f79555c);
    }
}
