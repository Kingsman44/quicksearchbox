package com.google.apps.tiktok.coroutines;

/* renamed from: com.google.apps.tiktok.coroutines.g */
/* compiled from: PG */
final class C46654g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f121907a;

    /* renamed from: b */
    final /* synthetic */ C46658k f121908b;

    public C46654g(Runnable runnable, C46658k kVar) {
        this.f121907a = runnable;
        this.f121908b = kVar;
    }

    public final void run() {
        this.f121907a.run();
        Throwable th = (Throwable) this.f121908b.f121912a.get();
        this.f121908b.f121912a.remove();
        if (th != null) {
            throw th;
        }
    }
}
