package com.google.frameworks.client.data.android.p4642i;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import p3186j$.util.Objects;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.i.e */
/* compiled from: PG */
public final class C61511e extends C70897l {

    /* renamed from: a */
    public final C70897l f166288a;

    /* renamed from: b */
    private final C47816ey f166289b = C47816ey.m84988b();

    public C61511e(C70897l lVar) {
        this.f166288a = lVar;
    }

    /* renamed from: e */
    private final void m94209e(Runnable runnable) {
        if (!C47831fm.m85027v()) {
            C47810es.m84976p(this.f166289b.f123841a, runnable).run();
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        m94209e(new C61510d(this, status, deVar));
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
        m94209e(new C61509c(this, deVar));
    }

    /* renamed from: d */
    public final void mo27486d() {
        C70897l lVar = this.f166288a;
        Objects.requireNonNull(lVar);
        m94209e(new C61507a(lVar));
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        m94209e(new C61508b(this, obj));
    }
}
