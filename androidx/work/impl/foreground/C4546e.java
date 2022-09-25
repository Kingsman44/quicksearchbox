package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;

/* renamed from: androidx.work.impl.foreground.e */
/* compiled from: PG */
final class C4546e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f14371a;

    /* renamed from: b */
    final /* synthetic */ Notification f14372b;

    /* renamed from: c */
    final /* synthetic */ int f14373c;

    /* renamed from: d */
    final /* synthetic */ SystemForegroundService f14374d;

    public C4546e(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f14374d = systemForegroundService;
        this.f14371a = i;
        this.f14372b = notification;
        this.f14373c = i2;
    }

    public final void run() {
        if (Build.VERSION.SDK_INT >= 31) {
            C4550i.m12929a(this.f14374d, this.f14371a, this.f14372b, this.f14373c);
        } else {
            C4549h.m12928a(this.f14374d, this.f14371a, this.f14372b, this.f14373c);
        }
    }
}
