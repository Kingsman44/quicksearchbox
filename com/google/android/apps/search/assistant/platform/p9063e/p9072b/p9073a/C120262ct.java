package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.libraries.p8956c.p8957a.C119257c;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ct */
/* compiled from: PG */
public final class C120262ct implements C17268f {

    /* renamed from: a */
    private final C17268f f334629a;

    /* renamed from: b */
    private final AtomicBoolean f334630b;

    public C120262ct(C17268f fVar, AtomicBoolean atomicBoolean) {
        this.f334629a = fVar;
        this.f334630b = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo23256a() {
        this.f334629a.mo23256a();
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        if (!(th instanceof C70761fa) || ((!C119257c.m197952a(th) && !C119257c.m197953b(th)) || this.f334630b.get())) {
            this.f334629a.mo23257b(th);
        }
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        this.f334629a.mo23258c(ciVar);
    }
}
