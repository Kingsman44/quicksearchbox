package com.google.android.libraries.search.p3005i.p3010e.p3011a;

import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5130a.C65708ag;
import com.google.protos.p5129p.p5130a.C65727l;
import p3186j$.util.Collection;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.i.e.a.e */
/* compiled from: PG */
public final class C38453e extends C65727l {

    /* renamed from: a */
    public static final C59071e f101774a = C59071e.m91332i("com.google.android.libraries.search.i.e.a.e");

    /* renamed from: b */
    public final C38469m f101775b;

    /* renamed from: c */
    public final AccountId f101776c;

    /* renamed from: d */
    final C38424a f101777d;

    /* renamed from: e */
    private final C60887da f101778e;

    public C38453e(C38469m mVar, C38424a aVar, AccountId accountId, C60887da daVar) {
        this.f101775b = mVar;
        this.f101777d = aVar;
        this.f101776c = accountId;
        this.f101778e = daVar;
    }

    /* renamed from: b */
    public final void mo41426b(C65708ag agVar, C70862aj ajVar) {
        C60870cx cxVar;
        C58528ij ijVar = (C58528ij) Collection.EL.stream(agVar.f178523b).map(C38449a.f101767a).distinct().collect(C58370cn.f155947b);
        C62971cq cqVar = agVar.f178523b;
        boolean z = agVar.f178524c;
        C58485gu guVar = (C58485gu) Collection.EL.stream(cqVar).map(new C38450b(this)).collect(C58370cn.f155946a);
        if (!z) {
            cxVar = C60856cj.m92900i(C58729pv.f156485a);
        } else {
            cxVar = C47636i.m84745d(guVar).mo51519b(new C38451c(this, ijVar), this.f101778e);
        }
        C38452d dVar = new C38452d(agVar, ijVar, ajVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(dVar), this.f101778e);
    }
}
