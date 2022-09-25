package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.gh */
/* compiled from: PG */
public final class C87085gh {

    /* renamed from: a */
    public static final C59071e f235301a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.gh");

    /* renamed from: b */
    public final C68214a f235302b;

    /* renamed from: c */
    public final C68214a f235303c;

    /* renamed from: d */
    public final C68214a f235304d;

    /* renamed from: e */
    public final C68214a f235305e;

    /* renamed from: f */
    private final C22871g f235306f;

    public C87085gh(C22871g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f235306f = gVar;
        this.f235302b = aVar;
        this.f235303c = aVar2;
        this.f235304d = aVar3;
        this.f235305e = aVar4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80732a(Query query, C86232bo boVar) {
        new C90873ag(boVar.mo79893q(), this.f235306f, "Pass back action data", new C87079gb(this, query)).mo85223a(C87080gc.f235294a);
        new C90873ag(boVar.mo79871G(), this.f235306f, "Pass back SRP metadata", new C87081gd(this, query)).mo85223a(C87082ge.f235297a);
        new C90873ag(boVar.mo79896t(), this.f235306f, "Pass back Clockwork result", new C87083gf(this, query)).mo85223a(C87084gg.f235300a);
    }
}
