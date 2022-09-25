package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bt */
/* compiled from: PG */
final class C122520bt implements C17597g {

    /* renamed from: a */
    private Runnable f339631a;

    /* renamed from: a */
    public final synchronized void mo20121a() {
        Runnable runnable = this.f339631a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final synchronized void mo20122b(Throwable th) {
        Runnable runnable = this.f339631a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
    }

    /* renamed from: d */
    public final synchronized void mo105656d(Runnable runnable) {
        this.f339631a = runnable;
    }
}
