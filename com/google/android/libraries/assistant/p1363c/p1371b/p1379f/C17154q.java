package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.b.f.q */
/* compiled from: PG */
final class C17154q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f49858a;

    /* renamed from: b */
    final /* synthetic */ boolean f49859b;

    public C17154q(C70862aj ajVar, boolean z) {
        this.f49858a = ajVar;
        this.f49859b = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C17157t.f49864a.mo56226d()).mo56382g(th)).mo56372aa(42625)).mo56386p("Error in forwardFutureAndClose.");
        if (!this.f49859b || !(th instanceof Error)) {
            C17157t.m34307c(th, this.f49858a);
            return;
        }
        throw ((Error) th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f49858a.mo20123c(obj);
        this.f49858a.mo20121a();
    }
}
