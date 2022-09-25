package com.google.frameworks.client.data.android.p4634b;

import android.content.Context;
import com.google.common.p4526f.C59052c;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.C70896k;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70222b;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70235o;
import p5488io.grpc.binder.p5522a.C70204i;
import p5488io.grpc.p5525e.C70376as;
import p5488io.grpc.p5525e.C70377at;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70567hu;

/* renamed from: com.google.frameworks.client.data.android.b.e */
/* compiled from: PG */
final class C61386e implements C70377at {

    /* renamed from: a */
    private final Context f165978a;

    /* renamed from: b */
    private final C70567hu f165979b;

    /* renamed from: c */
    private final C70567hu f165980c;

    /* renamed from: d */
    private final C70235o f165981d;

    /* renamed from: e */
    private final C70229i f165982e;

    /* renamed from: f */
    private final Executor f165983f;

    /* renamed from: g */
    private final C70222b f165984g;

    /* renamed from: h */
    private ScheduledExecutorService f165985h;

    /* renamed from: i */
    private Executor f165986i;

    /* renamed from: j */
    private boolean f165987j;

    public C61386e(Context context, C70222b bVar, Executor executor, C70567hu huVar, C70567hu huVar2, C70235o oVar, C70229i iVar) {
        this.f165978a = context;
        this.f165984g = bVar;
        this.f165979b = huVar;
        this.f165980c = huVar2;
        this.f165981d = oVar;
        this.f165982e = iVar;
        this.f165985h = (ScheduledExecutorService) huVar.mo62162a();
        this.f165986i = (Executor) huVar2.mo62162a();
        this.f165983f = executor;
    }

    /* renamed from: a */
    public final C70387bc mo57960a(SocketAddress socketAddress, C70376as asVar, C70896k kVar) {
        if (this.f165987j) {
            throw new IllegalStateException("The transport factory is closed.");
        } else if (socketAddress instanceof C70175a) {
            ((C59052c) ((C59052c) C61387f.f165988a.mo56224b()).mo56372aa(54879)).mo56389s("Creating cross-process transport to %s", socketAddress);
            return new C70204i(this.f165978a, (C70175a) socketAddress, this.f165983f, this.f165979b, this.f165980c, this.f165981d, this.f165982e, asVar.f187580b);
        } else {
            throw new C70761fa(Status.f186908f.withDescription("Unrecognized address"), (C70334de) null, true);
        }
    }

    /* renamed from: b */
    public final ScheduledExecutorService mo57961b() {
        return this.f165985h;
    }

    public final void close() {
        this.f165987j = true;
        this.f165985h = (ScheduledExecutorService) this.f165979b.mo62163b(this.f165985h);
        this.f165986i = (Executor) this.f165980c.mo62163b(this.f165986i);
    }
}
