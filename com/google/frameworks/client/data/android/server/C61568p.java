package com.google.frameworks.client.data.android.server;

import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58847bk;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70173bh;
import p5488io.grpc.C70701ef;
import p5488io.grpc.C70706ek;
import p5488io.grpc.p5524d.C70299a;
import p5488io.grpc.p5524d.C70310g;
import p5488io.grpc.p5525e.C70446dh;

/* renamed from: com.google.frameworks.client.data.android.server.p */
/* compiled from: PG */
public final class C61568p implements C68220f {
    /* renamed from: a */
    public static C70701ef m94335a(ScheduledExecutorService scheduledExecutorService, C70173bh bhVar, C58833ax axVar) {
        C70310g gVar = new C70310g(new C70299a());
        gVar.f187433a.mo62400c(scheduledExecutorService);
        C58838bb.m90866a(scheduledExecutorService, "scheduledExecutorService");
        gVar.f187435c = new C70446dh(scheduledExecutorService);
        gVar.f187433a.mo62401d(bhVar);
        for (C70706ek e : (List) ((C58847bk) axVar).f156646a) {
            gVar.f187433a.mo62402e(e);
        }
        C70701ef a = gVar.f187433a.mo61738a();
        try {
            a.mo62396d();
            C68225k.m98532d(a);
            return a;
        } catch (IOException e2) {
            throw new IllegalStateException("Failed to start in-process server!", e2);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
