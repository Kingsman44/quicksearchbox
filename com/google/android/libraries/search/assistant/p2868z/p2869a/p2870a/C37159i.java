package com.google.android.libraries.search.assistant.p2868z.p2869a.p2870a;

import androidx.p104d.p105a.C2164c;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.z.a.a.i */
/* compiled from: PG */
final class C37159i implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ Function f96756a;

    /* renamed from: b */
    final /* synthetic */ C2164c f96757b;

    /* renamed from: c */
    private final AtomicBoolean f96758c = new AtomicBoolean(false);

    public C37159i(Function function, C2164c cVar) {
        this.f96756a = function;
        this.f96757b = cVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f96758c.set(true);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f96757b.mo5439d(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C66611ci ciVar = (C66611ci) obj;
        if (this.f96758c.compareAndSet(false, true)) {
            C2164c cVar = this.f96757b;
            Objects.requireNonNull(cVar);
            ((Optional) this.f96756a.apply(ciVar)).ifPresentOrElse(new C37157g(cVar), new C37158h(this.f96757b));
        }
    }
}
