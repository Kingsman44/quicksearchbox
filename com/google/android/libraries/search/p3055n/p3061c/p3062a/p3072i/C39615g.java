package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39385aa;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.c.a.i.g */
/* compiled from: PG */
public final class C39615g extends C39612d {

    /* renamed from: a */
    public static final C59071e f104285a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.i.g");

    /* renamed from: b */
    public final C39621m f104286b;

    /* renamed from: c */
    public final C39385aa f104287c;

    /* renamed from: d */
    private final Executor f104288d;

    public C39615g(C39621m mVar, Executor executor, C39385aa aaVar) {
        this.f104286b = mVar;
        this.f104287c = aaVar;
        this.f104288d = new C60904dr(executor);
    }

    /* renamed from: b */
    public final void mo41952b(C39618j jVar, C70862aj ajVar) {
        C39614f fVar = new C39614f(this, jVar, ajVar);
        C46459k.m82829b(C60856cj.m92905n(C47810es.m84965e(fVar), this.f104288d), "Handle notify failed!", new Object[0]);
    }
}
