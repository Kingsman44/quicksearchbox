package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.core.webview.C87254a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.al */
/* compiled from: PG */
public final class C86815al extends C86898ct implements C87254a {

    /* renamed from: a */
    public long f234493a = 0;

    /* renamed from: b */
    public boolean f234494b;

    /* renamed from: c */
    private final C68214a f234495c;

    public C86815al(C68214a aVar, C68214a aVar2) {
        super(aVar, 71);
        this.f234495c = aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo80523a() {
        return this.f234493a == 100 || this.f234494b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo80524b() {
        return ((C86792g) this.f234495c.mo27525b()).mo80447f().mo81992b().equals("search");
    }

    /* renamed from: e */
    public final void mo80525e() {
        this.f234494b = true;
        mo80591ar();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActiveSessionState");
        fVar.mo85279c("Current client session ID").mo85276a(C90752i.m148230d(Long.valueOf(this.f234493a)));
    }
}
