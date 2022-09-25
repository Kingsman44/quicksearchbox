package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6892c.C87299a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.core.webview.C87254a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.aj */
/* compiled from: PG */
public final class C116572aj extends C116780ib implements C87254a, C87299a {

    /* renamed from: a */
    public long f323290a = 0;

    /* renamed from: b */
    public boolean f323291b;

    /* renamed from: c */
    private final C68214a f323292c;

    public C116572aj(C68214a aVar, C68214a aVar2) {
        super(aVar, 177);
        this.f323292c = aVar2;
    }

    /* renamed from: a */
    public final long mo80947a() {
        return this.f323290a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo102779e() {
        return this.f323290a == 100 || this.f323291b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo102780g() {
        return ((C86792g) this.f323292c.mo27525b()).mo80447f().mo81992b().equals("search");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActiveSessionState");
        fVar.mo85279c("Current client session ID").mo85276a(C90752i.m148230d(Long.valueOf(this.f323290a)));
    }
}
