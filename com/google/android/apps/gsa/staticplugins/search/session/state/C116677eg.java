package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6771z.C85620a;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.eg */
/* compiled from: PG */
public final class C116677eg extends C116780ib {

    /* renamed from: a */
    public final C68214a f323579a;

    /* renamed from: b */
    public final C85620a f323580b;

    /* renamed from: c */
    public boolean f323581c;

    /* renamed from: d */
    public long f323582d;

    /* renamed from: e */
    public long f323583e = 0;

    /* renamed from: f */
    public C89062r f323584f = C89062r.f241369a;

    public C116677eg(C68214a aVar, C68214a aVar2, C85620a aVar3) {
        super(aVar, 178);
        this.f323579a = aVar2;
        this.f323580b = aVar3;
    }

    /* renamed from: e */
    public final void mo102831e() {
        this.f323580b.mo79101c();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NetworkMonitoringState");
        fVar.mo85279c("shouldBeMonitoring").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323581c)));
        fVar.mo85279c("sessionIdForMonitoring").mo85276a(C90752i.m148230d(Long.valueOf(this.f323582d)));
    }
}
