package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9215d;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121248l;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121249m;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121250n;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9179a.C121214b;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.d.b */
/* compiled from: PG */
public final class C121399b implements C121214b {

    /* renamed from: a */
    public final C60950i f337040a;

    /* renamed from: b */
    private final Executor f337041b;

    /* renamed from: c */
    private final C38469m f337042c;

    public C121399b(C60950i iVar, Executor executor, C38469m mVar) {
        this.f337040a = iVar;
        this.f337041b = executor;
        this.f337042c = mVar;
    }

    /* renamed from: e */
    public static void m200644e(Map map, String str, C121248l lVar) {
        Map.EL.putIfAbsent(map, str, C121250n.f336801b);
        C121249m mVar = (C121249m) ((C121250n) map.get(str)).toBuilder();
        mVar.copyOnWrite();
        C121250n nVar = (C121250n) mVar.instance;
        lVar.getClass();
        C62971cq cqVar = nVar.f336803a;
        if (!cqVar.mo58948c()) {
            nVar.f336803a = C62942bv.mutableCopy(cqVar);
        }
        nVar.f336803a.add(lVar);
        map.put(str, (C121250n) mVar.build());
    }

    /* renamed from: a */
    public final /* synthetic */ Duration mo105081a() {
        return Duration.ofDays(1);
    }

    /* renamed from: b */
    public final /* synthetic */ Duration mo105082b() {
        return Duration.ofHours(4);
    }

    /* renamed from: c */
    public final /* synthetic */ boolean mo105083c() {
        return true;
    }

    /* renamed from: d */
    public final C60870cx mo105084d() {
        C60870cx b = this.f337042c.mo41431b(C65753ak.APP_ACTIONS, (String) null, C63662ac.f172144a, C49301bt.f127423f);
        C121398a aVar = new C121398a(this);
        return C60922j.m93044g(b, C47810es.m84963c(aVar), this.f337041b);
    }
}
