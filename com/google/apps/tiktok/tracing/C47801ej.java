package com.google.apps.tiktok.tracing;

/* renamed from: com.google.apps.tiktok.tracing.ej */
/* compiled from: PG */
final class C47801ej implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C47572bw f123805a;

    /* renamed from: b */
    final /* synthetic */ Runnable f123806b;

    public C47801ej(C47572bw bwVar, Runnable runnable) {
        this.f123805a = bwVar;
        this.f123806b = runnable;
    }

    public final void run() {
        C47572bw h = C47831fm.m85013h(this.f123805a);
        try {
            this.f123806b.run();
            C47831fm.m85013h(h);
        } catch (Throwable th) {
            C47831fm.m85013h(h);
            throw th;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f123806b);
        return "propagating=[" + valueOf + "]";
    }
}
