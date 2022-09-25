package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6816p.C86255j;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116533b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fh */
/* compiled from: PG */
public final class C116705fh extends C116780ib {

    /* renamed from: a */
    public final C68214a f323645a;

    /* renamed from: b */
    public final C68214a f323646b;

    /* renamed from: c */
    public final C68214a f323647c;

    /* renamed from: d */
    public final C68214a f323648d;

    /* renamed from: e */
    public final C116533b f323649e;

    /* renamed from: f */
    public final C68214a f323650f;

    /* renamed from: g */
    public final C68214a f323651g;

    /* renamed from: h */
    public Query f323652h;

    /* renamed from: i */
    private final C68214a f323653i;

    /* renamed from: j */
    private final C68214a f323654j;

    public C116705fh(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C116533b bVar, C68214a aVar9) {
        super(aVar, 187);
        this.f323645a = aVar2;
        this.f323653i = aVar4;
        this.f323654j = aVar5;
        this.f323646b = aVar3;
        this.f323647c = aVar6;
        this.f323650f = aVar7;
        this.f323651g = aVar8;
        this.f323649e = bVar;
        this.f323648d = aVar9;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaToSrpTransitionState");
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        Query query = this.f323652h;
        if (query == null || !query.mo84426dG()) {
            ((C86255j) this.f323654j.mo27525b()).mo79956e(0);
        } else {
            ((C86255j) this.f323654j.mo27525b()).mo79956e(((C116572aj) this.f323653i.mo27525b()).f323290a);
        }
        this.f323652h = null;
    }
}
