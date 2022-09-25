package com.google.android.libraries.search.silk.p3162a.p3180r;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.silk.p3205a.p3208ab.C41711a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61512j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab.C56626b;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4874ap.p4877b.p4878a.C63699j;
import com.google.protos.p4874ap.p4877b.p4878a.C63700k;
import com.google.protos.p4874ap.p4877b.p4878a.C63701l;
import com.google.protos.p4874ap.p4877b.p4878a.C63703n;
import com.google.protos.p4874ap.p4877b.p4878a.C63704o;
import com.google.protos.p4874ap.p4877b.p4878a.C63706q;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.silk.a.r.f */
/* compiled from: PG */
public final class C40641f implements C41711a {

    /* renamed from: a */
    public final C61512j f106650a;

    /* renamed from: b */
    private final C46128f f106651b;

    /* renamed from: c */
    private final AccountId f106652c;

    /* renamed from: d */
    private final C21370a f106653d;

    /* renamed from: e */
    private final Executor f106654e;

    public C40641f(C46128f fVar, AccountId accountId, C61512j jVar, C21370a aVar, Executor executor) {
        this.f106651b = fVar;
        this.f106652c = accountId;
        this.f106650a = jVar;
        this.f106653d = aVar;
        this.f106654e = executor;
    }

    /* renamed from: b */
    private static C58485gu m70403b(List list, C63704o oVar) {
        return (C58485gu) Collection.EL.stream(list).map(new C40640e(oVar)).collect(C58370cn.f155946a);
    }

    /* renamed from: a */
    public final C60870cx mo42576a(C56626b bVar) {
        C63701l lVar = (C63701l) C63706q.f172241d.createBuilder();
        lVar.copyOnWrite();
        C63706q qVar = (C63706q) lVar.instance;
        qVar.f172245c = 32;
        qVar.f172243a |= 2;
        C63703n nVar = (C63703n) C63704o.f172232c.createBuilder();
        C63699j jVar = (C63699j) C63700k.f172226e.createBuilder();
        jVar.copyOnWrite();
        C63700k kVar = (C63700k) jVar.instance;
        kVar.f172229b = 2;
        kVar.f172230c = 1;
        C63042fg i = C62953e.m95484i(this.f106653d.mo26870b());
        jVar.copyOnWrite();
        C63700k kVar2 = (C63700k) jVar.instance;
        i.getClass();
        kVar2.f172231d = i;
        kVar2.f172228a = 32 | kVar2.f172228a;
        nVar.copyOnWrite();
        C63704o oVar = (C63704o) nVar.instance;
        C63700k kVar3 = (C63700k) jVar.build();
        kVar3.getClass();
        oVar.f172235b = kVar3;
        oVar.f172234a = 1;
        C63703n nVar2 = (C63703n) C63704o.f172232c.createBuilder();
        C63042fg i2 = C62953e.m95484i(this.f106653d.mo26870b());
        nVar2.copyOnWrite();
        C63704o oVar2 = (C63704o) nVar2.instance;
        i2.getClass();
        oVar2.f172235b = i2;
        oVar2.f172234a = 2;
        lVar.mo59231a(m70403b(bVar.f151189a, (C63704o) nVar.build()));
        lVar.mo59231a(m70403b(bVar.f151190b, (C63704o) nVar2.build()));
        return C47633f.m84733g(C47633f.m84733g(this.f106651b.mo50215b(this.f106652c)).mo51515h(C40636a.f106644a, C60826bg.f164896a).mo51516i(new C40637b(this, lVar), this.f106654e)).mo51516i(new C40638c(bVar), C60826bg.f164896a);
    }
}
