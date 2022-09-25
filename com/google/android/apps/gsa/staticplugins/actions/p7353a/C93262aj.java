package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.aj */
/* compiled from: PG */
final class C93262aj {

    /* renamed from: a */
    private boolean f260037a = false;

    /* renamed from: b */
    private final ConcurrentLinkedQueue f260038b = new ConcurrentLinkedQueue();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87590a(Runnable runnable) {
        this.f260038b.add(runnable);
        if (this.f260037a) {
            mo87591b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo87591b() {
        this.f260037a = true;
        while (true) {
            Runnable runnable = (Runnable) this.f260038b.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }
}
