package com.google.android.libraries.mdi.download.p2230c.p2234c;

/* renamed from: com.google.android.libraries.mdi.download.c.c.g */
/* compiled from: PG */
final class C28767g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C28768h f78202a;

    /* renamed from: b */
    private final Runnable f78203b;

    public C28767g(C28768h hVar, Runnable runnable) {
        this.f78202a = hVar;
        this.f78203b = runnable;
    }

    public final void run() {
        try {
            this.f78203b.run();
        } finally {
            this.f78202a.mo34379a();
        }
    }
}
