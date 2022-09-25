package com.google.frameworks.client.data.android.server;

import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58847bk;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70346dq;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5524d.C70307d;

/* renamed from: com.google.frameworks.client.data.android.server.n */
/* compiled from: PG */
public final class C61566n implements C68220f {
    /* renamed from: a */
    public static C70888j m94331a(C70346dq dqVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, C58833ax axVar) {
        C70307d dVar = new C70307d();
        dVar.f187424c = true;
        dVar.f187422a.mo62293h(dqVar);
        C58838bb.m90866a(scheduledExecutorService, "scheduledExecutorService");
        dVar.f187423b = scheduledExecutorService;
        dVar.f187422a.mo62290e(scheduledExecutorService);
        dVar.f187422a.mo62294i(scheduledExecutorService2);
        for (C70899n nVar : (List) ((C58847bk) axVar).f156646a) {
            dVar.f187422a.mo62292g(Arrays.asList(new C70899n[]{nVar}));
        }
        C70286co c = dVar.f187422a.mo57963c();
        C68225k.m98532d(c);
        return c;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
