package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.dt */
/* compiled from: PG */
final class C120292dt implements C17268f {

    /* renamed from: a */
    private final C120227bq f334687a;

    /* renamed from: b */
    private final AtomicBoolean f334688b;

    public C120292dt(AtomicBoolean atomicBoolean, C120227bq bqVar) {
        this.f334687a = bqVar;
        this.f334688b = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo23256a() {
        this.f334687a.mo104693b((Throwable) null);
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        this.f334687a.mo104693b(th);
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        if (this.f334688b.compareAndSet(false, true)) {
            this.f334687a.f334569a.mo19974a(C37176a.f96915bg);
        }
    }
}
