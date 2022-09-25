package com.google.frameworks.client.data.android.server;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import java.net.SocketAddress;
import java.util.Collections;
import p5488io.grpc.C70158av;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70340dk;
import p5488io.grpc.C70342dm;
import p5488io.grpc.C70343dn;
import p5488io.grpc.C70345dp;
import p5488io.grpc.C70701ef;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.j */
/* compiled from: PG */
final class C61562j extends C70345dp {

    /* renamed from: a */
    final /* synthetic */ C61563k f166392a;

    /* renamed from: b */
    private volatile boolean f166393b;

    public C61562j(C61563k kVar) {
        this.f166392a = kVar;
    }

    /* renamed from: a */
    public final String mo57969a() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: c */
    public final void mo57971c() {
        this.f166393b = true;
    }

    /* renamed from: d */
    public final void mo57972d(C70342dm dmVar) {
        if (this.f166393b) {
            dmVar.mo62049a(Status.f186912j.withDescription("Resolver is shutdown"));
            return;
        }
        Collections.emptyList();
        dmVar.mo62050b(new C70343dn(C58485gu.m89846n(new C70158av(Collections.singletonList((SocketAddress) ((C70701ef) this.f166392a.f166394a.mo6453a()).mo62394a().get(0)), C70256c.f187254a)), C70256c.f187254a, (C70340dk) null));
    }
}
