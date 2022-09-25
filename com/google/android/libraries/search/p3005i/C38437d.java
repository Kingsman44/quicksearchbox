package com.google.android.libraries.search.p3005i;

import android.content.Context;
import com.google.android.apps.gsa.p8867w.p8878h.C118795a;
import com.google.android.apps.gsa.p8867w.p8878h.C118796b;
import com.google.android.libraries.geller.portable.p1821a.C21907az;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.phenotype.C46990dc;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protos.p5129p.p5131b.C65771bb;
import com.google.protos.p5129p.p5131b.C65772bc;
import com.google.protos.p5129p.p5131b.C65773bd;
import com.google.protos.p5129p.p5131b.C65807ck;
import com.google.protos.p5129p.p5131b.C65808cl;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.i.d */
/* compiled from: PG */
public final class C38437d {

    /* renamed from: a */
    public final C21907az f101737a;

    /* renamed from: b */
    private final Optional f101738b;

    /* renamed from: c */
    private final C65771bb f101739c;

    /* renamed from: d */
    private final Context f101740d;

    /* renamed from: e */
    private final C60887da f101741e;

    /* renamed from: com.google.android.libraries.search.i.d$a */
    /* compiled from: PG */
    public interface C38438a {
        /* renamed from: gU */
        C46990dc mo41422gU();

        /* renamed from: gV */
        C46990dc mo41423gV();
    }

    public C38437d(Context context, C60887da daVar, Optional optional, C21907az azVar, C65771bb bbVar) {
        this.f101740d = context;
        this.f101741e = daVar;
        this.f101738b = optional;
        this.f101737a = azVar;
        this.f101739c = bbVar;
    }

    /* renamed from: a */
    public final C60870cx mo41421a(AccountId accountId) {
        C60870cx cxVar;
        C65807ck ckVar = (C65807ck) C65808cl.f178897d.createBuilder();
        if (!this.f101739c.equals(C65771bb.f178806a)) {
            C62940bt btVar = C65773bd.f178809d;
            C65772bc bcVar = (C65772bc) C65773bd.f178808c.createBuilder();
            C65771bb bbVar = this.f101739c;
            bcVar.copyOnWrite();
            C65773bd bdVar = (C65773bd) bcVar.instance;
            bdVar.f178812b = bbVar;
            bdVar.f178811a |= 1;
            ckVar.mo58885m(btVar, (C65773bd) bcVar.build());
        }
        C38438a aVar = (C38438a) C47245e.m84045a(this.f101740d, C38438a.class, accountId);
        C60870cx g = C60922j.m93044g(aVar.mo41422gU().mo50962a(), C47810es.m84963c(C38405a.f101660a), this.f101741e);
        C60870cx g2 = C60922j.m93044g(aVar.mo41423gV().mo50962a(), C47810es.m84963c(C38405a.f101660a), this.f101741e);
        if (this.f101738b.isPresent()) {
            C118796b bVar = (C118796b) this.f101738b.get();
            cxVar = C60856cj.m92904m(C47810es.m84978r(new C118795a(bVar)), bVar.f331358b);
        } else {
            cxVar = C60856cj.m92900i(C58733pz.f156496a);
        }
        C60870cx cxVar2 = cxVar;
        return C60922j.m93044g(C60856cj.m92895d(g, g2, cxVar2).mo57334a(C47810es.m84978r(new C38423b(this, g, g2, cxVar2, ckVar)), this.f101741e), C47810es.m84963c(C38435c.f101736a), this.f101741e);
    }
}
