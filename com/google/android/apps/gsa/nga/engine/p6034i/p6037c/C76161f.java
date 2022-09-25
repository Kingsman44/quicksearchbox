package com.google.android.apps.gsa.nga.engine.p6034i.p6037c;

import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicInteger;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.i.c.f */
/* compiled from: PG */
public final class C76161f {

    /* renamed from: a */
    private final Object f211140a = new Object();

    /* renamed from: b */
    private C76160e f211141b = new C76160e(Optional.empty(), C76157b.f211134a);

    /* renamed from: d */
    private final void m122741d(C76160e eVar) {
        C76160e eVar2;
        synchronized (this.f211140a) {
            eVar2 = this.f211141b;
            this.f211141b = eVar;
        }
        eVar2.close();
    }

    /* renamed from: a */
    public final C76160e mo72104a() {
        C76160e eVar;
        synchronized (this.f211140a) {
            DesugarAtomicInteger.getAndUpdate(this.f211141b.f211138b, C76159d.f211136a);
            eVar = this.f211141b;
        }
        return eVar;
    }

    /* renamed from: b */
    public final void mo72105b() {
        m122741d(new C76160e(Optional.empty(), C76158c.f211135a));
    }

    /* renamed from: c */
    public final void mo72106c(Object obj, Consumer consumer) {
        m122741d(new C76160e(Optional.m71637of(obj), consumer));
    }
}
