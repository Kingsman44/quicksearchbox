package com.google.frameworks.client.data.android.server;

import android.app.Service;
import android.os.IBinder;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2393x;
import androidx.lifecycle.C2395z;
import com.google.android.libraries.p3340w.C43210b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70173bh;
import p5488io.grpc.C70701ef;
import p5488io.grpc.C70706ek;
import p5488io.grpc.C70911z;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70227g;
import p5488io.grpc.binder.C70228h;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70237q;
import p5488io.grpc.binder.LifecycleOnDestroyHelper$2;
import p5488io.grpc.p5525e.C70446dh;

/* renamed from: com.google.frameworks.client.data.android.server.h */
/* compiled from: PG */
public final class C61560h {

    /* renamed from: a */
    private static final C59071e f166380a = C59071e.m91332i("com.google.frameworks.client.data.android.server.h");

    /* renamed from: b */
    private final C2395z f166381b;

    /* renamed from: c */
    private final ScheduledExecutorService f166382c;

    /* renamed from: d */
    private final C70173bh f166383d;

    /* renamed from: e */
    private final C58833ax f166384e;

    /* renamed from: f */
    private final C70228h f166385f = new C70228h();

    public C61560h(Service service, ScheduledExecutorService scheduledExecutorService, C70173bh bhVar, C58833ax axVar) {
        C58838bb.m90869d(service instanceof C2395z, "A service hosting an Endpoint must be a LifecycleService");
        this.f166381b = (C2395z) service;
        this.f166382c = scheduledExecutorService;
        this.f166383d = bhVar;
        this.f166384e = axVar;
        ((C59052c) ((C59052c) f166380a.mo56224b()).mo56372aa(54890)).mo56389s("Created gRPC endpoint for service %s", service.getClass());
    }

    /* renamed from: a */
    public final IBinder mo58121a() {
        IBinder a = this.f166385f.mo61891a();
        a.getClass();
        return a;
    }

    /* renamed from: b */
    public final void mo58122b(C70237q qVar, C70229i iVar) {
        C43210b.m76196a();
        C2395z zVar = this.f166381b;
        C70227g gVar = new C70227g(C70175a.m102187b(zVar, zVar.getClass()), this.f166385f);
        C58838bb.m90866a(qVar, "securityPolicy");
        gVar.f187208c = qVar;
        C58838bb.m90866a(iVar, "inboundParcelablePolicy");
        gVar.f187209d = iVar;
        gVar.f187206a.mo62400c(this.f166382c);
        ScheduledExecutorService scheduledExecutorService = this.f166382c;
        C58838bb.m90866a(scheduledExecutorService, "scheduledExecutorService");
        gVar.f187207b = new C70446dh(scheduledExecutorService);
        gVar.f187206a.mo62401d(this.f166383d);
        gVar.f187206a.f188374f = new C70156at();
        gVar.f187206a.f188375g = C70911z.m103842a();
        if (this.f166384e.mo56113h()) {
            for (C70706ek e : (List) this.f166384e.mo56107c()) {
                gVar.f187206a.mo62402e(e);
            }
        }
        C70701ef a = gVar.f187206a.mo61738a();
        try {
            a.mo62396d();
            C2393x xVar = this.f166381b.f6618a.f6570a;
            if (xVar.f6612c == C2383n.DESTROYED) {
                a.mo62395b();
            } else {
                xVar.mo5790b(new LifecycleOnDestroyHelper$2(a));
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Failed to start Server for Endpoint Service ".concat(String.valueOf(String.valueOf(this.f166381b.getClass()))), e2);
        }
    }
}
