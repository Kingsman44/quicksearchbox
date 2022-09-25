package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.android.apps.gsa.p8867w.p8876f.C118792e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.q */
/* compiled from: PG */
public final class C96897q implements C118792e {

    /* renamed from: a */
    public final C42876ab f270880a;

    /* renamed from: b */
    public final C22871g f270881b;

    /* renamed from: c */
    public final C86124t f270882c;

    /* renamed from: d */
    public final C90851k f270883d;

    public C96897q(C42876ab abVar, C22871g gVar, C90851k kVar, C86124t tVar) {
        this.f270880a = abVar;
        this.f270881b = gVar;
        this.f270883d = kVar;
        this.f270882c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo90374a() {
        return this.f270881b.mo28209i(this.f270880a.mo46042d(), "GetSubscriptionEntities", C96895o.f270878a);
    }

    /* renamed from: b */
    public final C60870cx mo90375b(C58528ij ijVar) {
        return this.f270881b.mo28209i(this.f270880a.mo46039a(new C96893m(ijVar), this.f270883d.mo85210c("UpdateSubscriptionsEntities")), "TransformVoidToSubscriptionEntities", new C96894n(ijVar));
    }
}
