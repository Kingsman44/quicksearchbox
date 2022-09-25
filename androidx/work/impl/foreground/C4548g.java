package androidx.work.impl.foreground;

/* renamed from: androidx.work.impl.foreground.g */
/* compiled from: PG */
final class C4548g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f14378a;

    /* renamed from: b */
    final /* synthetic */ SystemForegroundService f14379b;

    public C4548g(SystemForegroundService systemForegroundService, int i) {
        this.f14379b = systemForegroundService;
        this.f14378a = i;
    }

    public final void run() {
        this.f14379b.f14355d.cancel(this.f14378a);
    }
}
