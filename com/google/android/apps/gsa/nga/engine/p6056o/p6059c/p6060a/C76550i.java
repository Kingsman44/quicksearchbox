package com.google.android.apps.gsa.nga.engine.p6056o.p6059c.p6060a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.a.i */
/* compiled from: PG */
public final class C76550i implements C76591c {

    /* renamed from: a */
    public final C76591c f211784a;

    /* renamed from: b */
    public final Optional f211785b;

    /* renamed from: c */
    private final C22871g f211786c;

    public C76550i(C22871g gVar, C83251g gVar2, C76591c cVar) {
        this.f211784a = cVar;
        this.f211786c = gVar;
        Optional e = cVar.mo71711a().mo72253e();
        Objects.requireNonNull(gVar2);
        this.f211785b = e.map(new C76548g(gVar2));
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        return this.f211784a.mo71711a();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        return this.f211786c.mo28210j((C60870cx) mo71711a().mo72255f().get(), "[NGA] FulfillerSync.fulfill", new C76549h(this, nVar, bgVar));
    }
}
