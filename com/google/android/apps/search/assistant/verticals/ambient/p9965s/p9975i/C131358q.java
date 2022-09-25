package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.gms.pay.p10852a.C145579a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.q */
/* compiled from: PG */
public final class C131358q {

    /* renamed from: a */
    public final C58974d f359090a;

    /* renamed from: b */
    public final C145579a f359091b;

    /* renamed from: c */
    public final C60888db f359092c;

    /* renamed from: d */
    public final Context f359093d;

    /* renamed from: e */
    public final Optional f359094e;

    /* renamed from: f */
    private final Supplier f359095f;

    public C131358q(C130603a aVar, C145579a aVar2, Context context, C60888db dbVar, Supplier supplier, Optional optional) {
        this.f359090a = aVar.mo109740b(this);
        this.f359091b = aVar2;
        this.f359092c = dbVar;
        this.f359095f = supplier;
        this.f359093d = context;
        this.f359094e = optional;
    }

    /* renamed from: a */
    public final C60870cx mo110151a(Optional optional, Collection collection) {
        C131355n nVar = new C131355n(this, optional, collection);
        C60870cx h = C60922j.m93045h((C60870cx) this.f359095f.get(), C47810es.m84966f(nVar), this.f359092c);
        C131356o oVar = C131356o.f359088a;
        return C60922j.m93044g(h, C47810es.m84963c(oVar), this.f359092c);
    }
}
