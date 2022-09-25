package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6771z.C85620a;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.dq */
/* compiled from: PG */
public final class C86991dq extends C86898ct {

    /* renamed from: a */
    public final C68214a f234967a;

    /* renamed from: b */
    public final C85620a f234968b;

    /* renamed from: c */
    public boolean f234969c;

    /* renamed from: d */
    public long f234970d;

    /* renamed from: e */
    public long f234971e = 0;

    /* renamed from: f */
    public C89062r f234972f = C89062r.f241369a;

    public C86991dq(C68214a aVar, C68214a aVar2, C85620a aVar3) {
        super(aVar, 72);
        this.f234967a = aVar2;
        this.f234968b = aVar3;
    }

    /* renamed from: a */
    public final void mo80626a() {
        this.f234968b.mo79101c();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NetworkMonitoringState");
        fVar.mo85279c("shouldBeMonitoring").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234969c)));
        fVar.mo85279c("sessionIdForMonitoring").mo85276a(C90752i.m148230d(Long.valueOf(this.f234970d)));
    }
}
