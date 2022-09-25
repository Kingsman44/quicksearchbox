package com.google.android.apps.gsa.search.core.p6519al.p6705di.p6706a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6705di.C85372a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.di.a.b */
/* compiled from: PG */
public final class C85374b extends C86731k {

    /* renamed from: c */
    private final Query f231166c;

    /* renamed from: d */
    private final long f231167d;

    /* renamed from: e */
    private final C86498a f231168e;

    /* renamed from: f */
    private final C60870cx f231169f;

    /* renamed from: g */
    private final C86361a f231170g;

    /* renamed from: h */
    private final C89356b f231171h;

    public C85374b(Query query, long j, C86498a aVar, C60870cx cxVar, C86361a aVar2, C89356b bVar) {
        super("textsearch", "textsearch::startTextSearch", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_TEXT);
        this.f231166c = query;
        this.f231167d = j;
        this.f231168e = aVar;
        this.f231169f = cxVar;
        this.f231170g = aVar2;
        this.f231171h = bVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85372a) obj).mo78898b(this.f231166c, this.f231167d, this.f231168e, this.f231169f, this.f231170g, this.f231171h);
        return C118826c.f331423b;
    }
}
