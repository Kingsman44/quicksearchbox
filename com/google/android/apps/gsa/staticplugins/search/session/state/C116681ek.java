package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6596bk.C84882a;
import com.google.android.apps.gsa.search.core.p6519al.p6670cs.C85202a;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116533b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ek */
/* compiled from: PG */
public final class C116681ek extends C116780ib {

    /* renamed from: a */
    public final C68214a f323591a;

    /* renamed from: b */
    public final C22871g f323592b;

    /* renamed from: c */
    public final C84882a f323593c;

    /* renamed from: d */
    public final C85202a f323594d;

    /* renamed from: e */
    public final C116533b f323595e;

    /* renamed from: f */
    public final C68214a f323596f;

    /* renamed from: g */
    public final C68214a f323597g;

    /* renamed from: h */
    C86577w f323598h;

    /* renamed from: i */
    Query f323599i = Query.f252741b;

    /* renamed from: j */
    public C60870cx f323600j;

    /* renamed from: k */
    public final C84466a f323601k;

    public C116681ek(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C116533b bVar, C22871g gVar, C84882a aVar5, C84466a aVar6, C85202a aVar7) {
        super(aVar, 192);
        this.f323591a = aVar2;
        this.f323596f = aVar3;
        this.f323597g = aVar4;
        this.f323595e = bVar;
        this.f323592b = gVar;
        this.f323593c = aVar5;
        this.f323601k = aVar6;
        this.f323594d = aVar7;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NonSearchPageState");
        Query query = this.f323599i;
        if (query != null) {
            fVar.mo85288o("current commit query", query);
        }
        boolean z = true;
        fVar.mo85279c("has graph runner").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323598h != null)));
        C86577w wVar = this.f323598h;
        if (!(wVar == null || wVar.mo80180a() == null)) {
            fVar.mo85279c("is graph runner finished?").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323598h.mo80180a().isDone())));
            fVar.mo85279c("is graph runner cancelled?").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323598h.mo80180a().isCancelled())));
        }
        C91005e c = fVar.mo85279c("has start work request");
        if (this.f323600j == null) {
            z = false;
        }
        c.mo85276a(C90752i.m148228b(Boolean.valueOf(z)));
        if (this.f323600j != null) {
            fVar.mo85279c("is start request finished?").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323600j.isDone())));
            fVar.mo85279c("is start request cancelled?").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323600j.isCancelled())));
        }
    }
}
