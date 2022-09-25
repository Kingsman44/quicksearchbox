package com.google.android.libraries.search.p3005i.p3007b;

import com.google.android.libraries.search.p3005i.C38422al;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5124m.p5125a.C65599b;
import com.google.protos.p5129p.p5131b.C65813cq;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.i.b.e */
/* compiled from: PG */
public final class C38428e implements C38424a {

    /* renamed from: a */
    public static final C59071e f101717a = C59071e.m91332i("com.google.android.libraries.search.i.b.e");

    /* renamed from: b */
    public final C58528ij f101718b;

    /* renamed from: c */
    private final C46423aj f101719c;

    /* renamed from: d */
    private final C46128f f101720d;

    /* renamed from: e */
    private final C47117b f101721e;

    /* renamed from: f */
    private final C60887da f101722f;

    public C38428e(C38422al alVar, C46128f fVar, C47117b bVar, C60887da daVar, C65599b bVar2) {
        Objects.requireNonNull(alVar);
        this.f101719c = new C46423aj(new C38426c(alVar), daVar);
        this.f101720d = fVar;
        this.f101721e = bVar;
        this.f101722f = daVar;
        this.f101718b = (C58528ij) Collection.EL.stream(bVar2.f178301a).map(C38427d.f101716a).collect(C58370cn.f155947b);
    }

    /* renamed from: a */
    public final C60870cx mo41418a(AccountId accountId, String str, C58528ij ijVar, C65813cq cqVar) {
        C60870cx a = this.f101720d.mo50214a(accountId);
        C60870cx b = this.f101721e.mo51025b(accountId);
        C60870cx b2 = this.f101719c.mo50395b();
        return C60856cj.m92895d(a, b, b2).mo57335b(C47810es.m84965e(new C38425b(this, ijVar, a, b, b2, str, cqVar)), this.f101722f);
    }
}
