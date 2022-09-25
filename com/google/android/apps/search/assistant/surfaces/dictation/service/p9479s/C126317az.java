package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.az */
/* compiled from: PG */
public final class C126317az {

    /* renamed from: a */
    public final AtomicReference f347976a;

    /* renamed from: b */
    private final Runnable f347977b;

    /* renamed from: c */
    private final C60888db f347978c;

    /* renamed from: d */
    private final AtomicReference f347979d = new AtomicReference((Object) null);

    public C126317az(Duration duration, Runnable runnable, C60888db dbVar) {
        this.f347976a = new AtomicReference(duration);
        this.f347977b = runnable;
        this.f347978c = dbVar;
    }

    /* renamed from: a */
    public final void mo107528a() {
        Runnable runnable = this.f347977b;
        C60888db dbVar = this.f347978c;
        mo107529b(C126309ar.m206524c(new C126299ah(new C126301aj(runnable)), (Duration) this.f347976a.get(), dbVar));
    }

    /* renamed from: b */
    public final void mo107529b(C60870cx cxVar) {
        C60870cx cxVar2 = (C60870cx) this.f347979d.getAndSet(cxVar);
        if (cxVar2 != null) {
            cxVar2.cancel(false);
        }
    }
}
