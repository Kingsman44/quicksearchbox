package com.google.android.apps.gsa.search.core.p6511ah;

import com.google.android.apps.gsa.hotword.c.y;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.search.core.ah.a */
/* compiled from: PG */
final class C84494a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C84496c f229957a;

    public C84494a(C84496c cVar) {
        this.f229957a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((y) obj) == y.b && this.f229957a.f229960b.mo79746e(C90082eg.f250054dk)) {
            C84496c cVar = this.f229957a;
            C92408n.m151743e(cVar.f229961c, (C91097g) ((C58847bk) cVar.f229962d).f156646a, EventForDump.m147676e(10, "re-enroll always-on"));
        }
    }
}
