package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.att */
/* compiled from: PG */
final class att extends ate implements Runnable {

    /* renamed from: a */
    private final Runnable f21552a;

    public att(Runnable runnable) {
        aqd.m19282j(runnable);
        this.f21552a = runnable;
    }

    public final void run() {
        try {
            this.f21552a.run();
        } catch (Throwable th) {
            mo15401o(th);
            aqf.m19295a(th);
            throw new RuntimeException(th);
        }
    }
}
