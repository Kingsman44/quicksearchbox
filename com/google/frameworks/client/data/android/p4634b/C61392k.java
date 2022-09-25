package com.google.frameworks.client.data.android.p4634b;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.net.SocketAddress;
import java.util.Collections;
import p5488io.grpc.C70158av;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70340dk;
import p5488io.grpc.C70342dm;
import p5488io.grpc.C70343dn;
import p5488io.grpc.C70345dp;
import p5488io.grpc.C70766ff;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.b.k */
/* compiled from: PG */
public final class C61392k extends C70345dp {

    /* renamed from: a */
    public final C70766ff f166003a;

    /* renamed from: b */
    private final C61390i f166004b;

    /* renamed from: c */
    private volatile boolean f166005c;

    /* renamed from: d */
    private volatile C70342dm f166006d;

    public C61392k(C61390i iVar, C70766ff ffVar) {
        this.f166004b = iVar;
        this.f166003a = ffVar;
    }

    /* renamed from: a */
    public final String mo57969a() {
        return "no-known-authority";
    }

    /* renamed from: b */
    public final void mo57970b(SocketAddress socketAddress) {
        C58838bb.m90884s(this.f166006d != null, "onAddressUpdate calls are allowed only when listening");
        this.f166003a.mo62447d();
        if (socketAddress != null) {
            C70342dm dmVar = this.f166006d;
            Collections.emptyList();
            dmVar.mo62050b(new C70343dn(C58485gu.m89846n(new C70158av(Collections.singletonList(socketAddress), C70256c.f187254a)), C70256c.f187254a, (C70340dk) null));
            return;
        }
        this.f166006d.mo62049a(Status.f186908f.withDescription("No service address set"));
    }

    /* renamed from: c */
    public final void mo57971c() {
        this.f166003a.mo62447d();
        this.f166005c = true;
        this.f166004b.mo57967a(this);
        this.f166006d = null;
    }

    /* renamed from: d */
    public final void mo57972d(C70342dm dmVar) {
        SocketAddress socketAddress;
        C58838bb.m90884s(this.f166006d == null, "multiple calls to start are not allowed");
        this.f166003a.mo62447d();
        this.f166006d = dmVar;
        if (this.f166005c) {
            this.f166006d.mo62049a(Status.f186912j.withDescription("Resolver is shutdown"));
            return;
        }
        synchronized (this.f166004b) {
            C61390i iVar = this.f166004b;
            socketAddress = iVar.f166000b;
            iVar.f165999a.add(this);
        }
        mo57970b(socketAddress);
    }
}
