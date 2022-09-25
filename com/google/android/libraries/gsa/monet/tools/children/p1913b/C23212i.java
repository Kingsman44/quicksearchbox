package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.i */
/* compiled from: PG */
final class C23212i implements Runnable {

    /* renamed from: a */
    private final C22945j f63635a;

    /* renamed from: b */
    private Runnable f63636b;

    public C23212i(Runnable runnable, C22945j jVar) {
        this.f63636b = runnable;
        this.f63635a = jVar;
    }

    public final void run() {
        Runnable runnable;
        if (!this.f63635a.mo28310C() && (runnable = this.f63636b) != null) {
            runnable.run();
            this.f63636b = null;
        }
    }
}
