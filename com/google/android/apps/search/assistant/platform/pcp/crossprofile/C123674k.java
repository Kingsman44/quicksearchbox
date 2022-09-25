package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124090bp;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124091bq;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.k */
/* compiled from: PG */
public final class C123674k implements C123669f {

    /* renamed from: a */
    public final Context f341644a;

    /* renamed from: b */
    private final C123604t f341645b;

    /* renamed from: c */
    private final C46175b f341646c;

    /* renamed from: d */
    private final Executor f341647d;

    /* renamed from: e */
    private final C124091bq f341648e;

    public C123674k(C123604t tVar, Context context, C46175b bVar, Executor executor, C124091bq bqVar) {
        this.f341645b = tVar;
        this.f341644a = context;
        this.f341646c = bVar;
        this.f341647d = executor;
        this.f341648e = bqVar;
    }

    /* renamed from: a */
    public final C60870cx mo106093a(int i, Set set, boolean z, C123755bv bvVar, C123777f fVar, boolean z2) {
        C60870cx e = this.f341646c.mo50248e();
        C123670g gVar = new C123670g(this, i, set, z, bvVar, fVar, z2);
        return C60922j.m93045h(e, C47810es.m84966f(gVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo106094b(Optional optional, int i, int i2, String str, long j) {
        C60870cx cxVar;
        C124091bq bqVar = this.f341648e;
        C53306j a = C53306j.m86809a(i);
        if (optional.isPresent()) {
            C123623b a2 = C123624c.m202992a(bqVar.f342735c, (AccountId) optional.get());
            cxVar = a2.f341552d.mo106067k(a2.f341550b, a, i2, str, j);
        } else {
            C123615ah b = C123624c.m202993b(bqVar.f342735c);
            cxVar = b.f341542c.mo106067k(b.f341541b, a, i2, str, j);
        }
        C60870cx cxVar2 = cxVar;
        C124090bp bpVar = new C124090bp(bqVar, optional, str, i2, a);
        return C60922j.m93045h(cxVar2, C47810es.m84966f(bpVar), bqVar.f342733a);
    }

    /* renamed from: c */
    public final C60870cx mo106095c(List list) {
        return this.f341645b.mo106055b(C58485gu.m89842j((List) Collection.EL.stream(list).map(C123671h.f341640a).collect(Collectors.toCollection(C123672i.f341641a))), 1, (Instant) null);
    }

    /* renamed from: d */
    public final C60870cx mo106096d(List list) {
        C60870cx e = this.f341646c.mo50248e();
        C123673j jVar = new C123673j(this, list);
        return C60922j.m93045h(e, C47810es.m84966f(jVar), this.f341647d);
    }
}
