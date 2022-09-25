package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103382f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28746bx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.hu */
/* compiled from: PG */
public final class C104110hu implements C103382f, C86051l {

    /* renamed from: a */
    public final C28746bx f289618a;

    /* renamed from: b */
    public final C103943bp f289619b;

    /* renamed from: c */
    public final C104040fe f289620c;

    /* renamed from: d */
    public final C104126w f289621d;

    /* renamed from: e */
    private final C22871g f289622e;

    /* renamed from: f */
    private final C68214a f289623f;

    public C104110hu(C22871g gVar, C28746bx bxVar, C103943bp bpVar, C104040fe feVar, C68214a aVar, C104126w wVar) {
        this.f289622e = gVar;
        this.f289618a = bxVar;
        this.f289619b = bpVar;
        this.f289620c = feVar;
        this.f289623f = aVar;
        this.f289621d = wVar;
    }

    /* renamed from: d */
    private final void m172065d() {
        C90875ai.m148465b(new C104107hr(this), this.f289622e.mo28202b("[NGA] WebrefFileGroupsRefresher.refresh", new C104109ht(this)), this.f289622e, "[NGA] WebrefFileGroupsRefresher.refresh").mo85223a(new C104108hs(this));
    }

    /* renamed from: c */
    public final void mo93774c() {
        ((C86054o) this.f289623f.mo27525b()).mo79675i(this);
        m172065d();
    }

    /* renamed from: e */
    public final void mo93775e() {
        ((C86054o) this.f289623f.mo27525b()).mo79681o(this);
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        m172065d();
    }

    /* renamed from: iR */
    public final void mo79704iR(Account[] accountArr) {
    }
}
