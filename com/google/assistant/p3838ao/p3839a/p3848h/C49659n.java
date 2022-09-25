package com.google.assistant.p3838ao.p3839a.p3848h;

import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.h.n */
/* compiled from: PG */
public abstract class C49659n {
    /* renamed from: a */
    public abstract Optional mo53298a();

    /* renamed from: b */
    public abstract Optional mo53299b();

    /* renamed from: c */
    public final C49658m mo53319c() {
        C49650e eVar = new C49650e();
        Optional b = mo53299b();
        Objects.requireNonNull(eVar);
        b.ifPresent(new C49656k(eVar));
        Optional a = mo53298a();
        Objects.requireNonNull(eVar);
        a.ifPresent(new C49657l(eVar));
        return eVar;
    }
}
