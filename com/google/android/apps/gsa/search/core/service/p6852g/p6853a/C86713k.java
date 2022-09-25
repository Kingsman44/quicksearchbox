package com.google.android.apps.gsa.search.core.service.p6852g.p6853a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6852g.C86730j;
import com.google.android.apps.gsa.shared.p7066m.C90118fp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.k */
/* compiled from: PG */
public final class C86713k implements C90964a {

    /* renamed from: a */
    public final Queue f234237a;

    public C86713k(C86124t tVar) {
        int a = (int) tVar.mo79743a(C90118fp.f250757c);
        C58838bb.m90885t(a > 0, "maxSize {%} must be > 0.", a);
        this.f234237a = new C58781rt(new C58425eo(a));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WorkHistory");
        fVar.mo85279c("WorkHistory_Length").mo85276a(C90752i.m148230d(Integer.valueOf(this.f234237a.size())));
        fVar.mo85292s(C90752i.m148229c("Enqueue time: +delegation (ms), +completion (ms), status, name"));
        for (C86730j l : this.f234237a) {
            fVar.mo85285l(l);
        }
    }
}
