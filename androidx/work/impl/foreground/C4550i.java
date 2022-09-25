package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.C4380ad;

/* renamed from: androidx.work.impl.foreground.i */
/* compiled from: PG */
final class C4550i {
    /* renamed from: a */
    static void m12929a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            C4380ad.m12560h().mo9315g(SystemForegroundService.f14353b, "Unable to start foreground service", e);
        }
    }
}
