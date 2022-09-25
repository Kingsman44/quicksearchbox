package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.bi */
/* compiled from: PG */
final class C90817bi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C90818bj f253967a;

    /* renamed from: b */
    private final Runnable f253968b;

    public C90817bi(C90818bj bjVar, Runnable runnable) {
        this.f253967a = bjVar;
        this.f253968b = runnable;
    }

    public final void run() {
        try {
            this.f253968b.run();
        } finally {
            this.f253967a.mo85160a();
        }
    }
}
