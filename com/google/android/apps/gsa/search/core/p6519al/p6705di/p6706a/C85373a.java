package com.google.android.apps.gsa.search.core.p6519al.p6705di.p6706a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6705di.C85372a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.di.a.a */
/* compiled from: PG */
public final class C85373a extends C86731k {

    /* renamed from: c */
    private final C60870cx f231163c;

    /* renamed from: d */
    private final C86361a f231164d;

    /* renamed from: e */
    private final C89356b f231165e;

    public C85373a(C60870cx cxVar, C86361a aVar, C89356b bVar) {
        super("textsearch", "textsearch::prewarmTextSearchGraph", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231163c = cxVar;
        this.f231164d = aVar;
        this.f231165e = bVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85372a) obj).mo78897a(this.f231163c, this.f231164d, this.f231165e);
        return C118826c.f331423b;
    }
}
