package com.google.android.apps.search.googleapp.customtabs.p10152d;

import com.google.android.apps.search.googleapp.customtabs.p10151c.C133682d;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133691m;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133695q;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.p */
/* compiled from: PG */
final class C133755p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C133756q f364301a;

    public C133755p(C133756q qVar) {
        this.f364301a = qVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C133756q qVar = this.f364301a;
        if (qVar.f364308g) {
            qVar.f364307f.mo19974a(C37182a.f98199iG.mo40805c(C62722b.UNAVAILABLE));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C133746g gVar = (C133746g) obj;
        C133756q qVar = this.f364301a;
        if (qVar.f364308g) {
            qVar.f364307f.mo19974a(C37182a.f98199iG.mo40805c(C62722b.OK));
        }
        for (C133695q qVar2 : this.f364301a.f364305d) {
            C133691m mVar = (C133691m) qVar2.f364164a.mo17428b();
            C46459k.m82829b(mVar.f364151d.mo46040b(C47810es.m84966f(new C133682d(mVar, gVar)), C60826bg.f164896a), "Failed to update availability data", new Object[0]);
        }
    }
}
