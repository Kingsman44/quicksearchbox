package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123913k;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.v */
/* compiled from: PG */
public final class C123904v implements C123913k {

    /* renamed from: a */
    public static final C59071e f342237a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.featuredata.d.v");

    /* renamed from: b */
    public static final long f342238b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    public final C123883a f342239c;

    /* renamed from: d */
    public final C46128f f342240d;

    /* renamed from: e */
    public final Context f342241e;

    /* renamed from: f */
    public final Executor f342242f;

    /* renamed from: g */
    public final C123906x f342243g;

    /* renamed from: h */
    public final C21370a f342244h;

    /* renamed from: i */
    public final Executor f342245i;

    /* renamed from: j */
    public final Optional f342246j;

    /* renamed from: k */
    public final C123604t f342247k;

    /* renamed from: l */
    private final C46175b f342248l;

    public C123904v(C123883a aVar, C46175b bVar, C46128f fVar, Context context, Executor executor, Executor executor2, C123906x xVar, C21370a aVar2, Optional optional, C123604t tVar) {
        this.f342239c = aVar;
        this.f342248l = bVar;
        this.f342240d = fVar;
        this.f342241e = context;
        this.f342242f = executor;
        this.f342245i = executor2;
        this.f342243g = xVar;
        this.f342244h = aVar2;
        this.f342246j = optional;
        this.f342247k = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo106151a() {
        C60870cx d = this.f342248l.mo50247d();
        C123887e eVar = new C123887e(this);
        return C60922j.m93045h(d, C47810es.m84966f(eVar), this.f342242f);
    }

    /* renamed from: b */
    public final C60870cx mo106157b(List list, List list2) {
        return C47638k.m84750a(C58485gu.m89842j(list2)).mo51520a(new C123895m(this, list), this.f342245i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C60870cx mo106158c(String str, C123751br brVar, AccountId accountId, int i, C53306j jVar, List list) {
        return C123624c.m202992a(this.f342241e, accountId).f341550b.mo45938b(new C123901s(this, i, str, brVar, accountId, jVar, list));
    }

    /* renamed from: d */
    public final List mo106159d(List list, AccountId accountId, int i, C53306j jVar) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        C123623b a = C123624c.m202992a(this.f342241e, accountId);
        C60870cx o = C60856cj.m92906o((Iterable) Collection.EL.stream(list).map(new C123897o(this, a, jVar, i)).collect(Collectors.toCollection(C123898p.f342223a)));
        C123899q qVar = C123899q.f342224a;
        C60870cx h = C60922j.m93045h(o, C47810es.m84966f(qVar), this.f342242f);
        C60870cx a2 = a.mo106074a(C58495hd.m89900n(Integer.valueOf(i), list));
        C60856cj.m92911t(a2, C47810es.m84974n(new C123902t(list)), C60826bg.f164896a);
        arrayList.add(a2);
        C60856cj.m92911t(h, C47810es.m84974n(new C123903u(this, jVar, list)), C60826bg.f164896a);
        return arrayList;
    }
}
