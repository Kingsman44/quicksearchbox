package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.Service;

/* renamed from: androidx.work.impl.foreground.h */
/* compiled from: PG */
final class C4549h {
    /* renamed from: a */
    static void m12928a(Service service, int i, Notification notification, int i2) {
        service.startForeground(i, notification, i2);
    }
}
