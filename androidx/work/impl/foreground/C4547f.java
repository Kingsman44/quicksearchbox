package androidx.work.impl.foreground;

import android.app.Notification;

/* renamed from: androidx.work.impl.foreground.f */
/* compiled from: PG */
final class C4547f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f14375a;

    /* renamed from: b */
    final /* synthetic */ Notification f14376b;

    /* renamed from: c */
    final /* synthetic */ SystemForegroundService f14377c;

    public C4547f(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f14377c = systemForegroundService;
        this.f14375a = i;
        this.f14376b = notification;
    }

    public final void run() {
        this.f14377c.f14355d.notify(this.f14375a, this.f14376b);
    }
}
