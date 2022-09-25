package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6636cb.C85069a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4552o.amo;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fn */
/* compiled from: PG */
public final class C116711fn extends C116780ib {

    /* renamed from: a */
    public final C85069a f323665a;

    /* renamed from: b */
    public boolean f323666b;

    /* renamed from: c */
    public double f323667c;

    /* renamed from: d */
    public amo f323668d;

    public C116711fn(C68214a aVar, C85069a aVar2) {
        super(aVar, 189);
        this.f323665a = aVar2;
    }

    /* renamed from: e */
    public final boolean mo102839e(double d) {
        if (Math.abs(this.f323667c - d) <= 0.01d) {
            return false;
        }
        this.f323667c = d;
        this.f323665a.mo78688b(d);
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ProgressState");
        fVar.mo85279c("ShouldShowProgress").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323666b)));
        fVar.mo85279c("Progress").mo85276a(C90752i.m148230d(Double.valueOf(this.f323667c)));
    }
}
