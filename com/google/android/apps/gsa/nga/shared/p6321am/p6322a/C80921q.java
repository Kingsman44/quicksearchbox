package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.q */
/* compiled from: PG */
public final /* synthetic */ class C80921q implements C80930z {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f221892a;

    /* renamed from: b */
    public final /* synthetic */ Executor f221893b;

    public /* synthetic */ C80921q(C58485gu guVar, Executor executor) {
        this.f221892a = guVar;
        this.f221893b = executor;
    }

    /* renamed from: a */
    public final Object mo74715a() {
        C58485gu guVar = this.f221892a;
        Executor executor = this.f221893b;
        return C60922j.m93044g(C60856cj.m92896e((Iterable) Collection.EL.stream(guVar).map(new C80927w(executor)).collect(C58370cn.f155946a)), C47810es.m84963c(C80928x.f221900a), executor);
    }
}
