package com.google.frameworks.client.data.android.p4640g;

import com.google.android.libraries.p3340w.C43210b;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61377as;
import com.google.frameworks.client.data.android.C61378at;
import com.google.frameworks.client.data.android.C61413f;
import java.util.concurrent.Executor;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70898m;

/* renamed from: com.google.frameworks.client.data.android.g.z */
/* compiled from: PG */
final class C61465z extends C70888j {

    /* renamed from: a */
    private final C46423aj f166171a;

    /* renamed from: b */
    private final String f166172b;

    /* renamed from: c */
    private final Executor f166173c;

    public C61465z(C61378at atVar, C61377as asVar, Executor executor) {
        C61413f fVar = (C61413f) asVar;
        this.f166172b = fVar.f166073b.getAuthority();
        this.f166173c = fVar.f166075d;
        this.f166171a = new C46423aj(new C61456q(atVar, asVar), executor);
    }

    /* renamed from: a */
    public final C70898m mo39510a(C70338di diVar, C70851i iVar) {
        C43210b.m76196a();
        Executor executor = iVar.f189017c;
        C60870cx b = this.f166171a.mo50395b();
        C61455p pVar = new C61455p(diVar, iVar);
        if (executor == null) {
            executor = this.f166173c;
        }
        return new C61464y(C60922j.m93044g(b, C47810es.m84963c(pVar), executor));
    }

    /* renamed from: b */
    public final String mo39511b() {
        return this.f166172b;
    }
}
