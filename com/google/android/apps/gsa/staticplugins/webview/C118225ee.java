package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86384af;
import com.google.android.apps.gsa.search.core.p6820r.C86386ah;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86376a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86378c;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ee */
/* compiled from: PG */
public final class C118225ee implements C86387ai {

    /* renamed from: a */
    private final C89356b f328202a;

    /* renamed from: b */
    private final C86376a f328203b;

    /* renamed from: c */
    private final C86378c f328204c;

    /* renamed from: d */
    private final C68214a f328205d;

    /* renamed from: e */
    private final C86602c f328206e;

    /* renamed from: f */
    private final C86372a f328207f;

    /* renamed from: g */
    private final C86124t f328208g;

    /* renamed from: h */
    private final long f328209h;

    /* renamed from: i */
    private final C85454d f328210i;

    public C118225ee(C89356b bVar, C86376a aVar, C86378c cVar, C86372a aVar2, long j, C68214a aVar3, C86602c cVar2, C86124t tVar, C85454d dVar) {
        this.f328202a = bVar;
        this.f328203b = aVar;
        this.f328204c = cVar;
        this.f328205d = aVar3;
        this.f328206e = cVar2;
        this.f328207f = aVar2;
        this.f328208g = tVar;
        this.f328209h = j;
        this.f328210i = dVar;
    }

    /* renamed from: a */
    public final C86384af mo80158a(C60870cx cxVar, C60870cx cxVar2) {
        C68214a aVar = this.f328205d;
        Objects.requireNonNull(aVar);
        C118224ed edVar = new C118224ed(aVar);
        C86602c cVar = this.f328206e;
        C86372a aVar2 = this.f328207f;
        C86124t tVar = this.f328208g;
        C89356b bVar = this.f328202a;
        cxVar.getClass();
        cxVar2.getClass();
        C86376a aVar3 = this.f328203b;
        Long valueOf = Long.valueOf(this.f328209h);
        C86378c cVar2 = this.f328204c;
        C85454d dVar = this.f328210i;
        C68225k.m98529a(edVar, C58881cr.class);
        C68225k.m98529a(cVar, C86602c.class);
        C68225k.m98529a(aVar2, C86372a.class);
        C68225k.m98529a(tVar, C86124t.class);
        C68225k.m98529a(bVar, C89356b.class);
        C68225k.m98529a(cxVar, C60870cx.class);
        C68225k.m98529a(cxVar2, C60870cx.class);
        C68225k.m98529a(aVar3, C86376a.class);
        C68225k.m98529a(valueOf, Long.class);
        C68225k.m98529a(cVar2, C86378c.class);
        C68225k.m98529a(dVar, C85454d.class);
        C118164c cVar3 = new C118164c(edVar, cVar, aVar2, bVar, cxVar, cxVar2, aVar3, valueOf, cVar2);
        return new C86386ah(cVar3.f327992a.mo60297gq(), cVar3.f327999b.mo60297gq());
    }

    /* renamed from: b */
    public final void mo80159b(Query query) {
        this.f328204c.mo80156a(query);
    }
}
