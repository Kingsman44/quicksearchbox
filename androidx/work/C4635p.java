package androidx.work;

import android.app.Notification;

/* renamed from: androidx.work.p */
/* compiled from: PG */
public final class C4635p {

    /* renamed from: a */
    public final int f14559a;

    /* renamed from: b */
    public final int f14560b;

    /* renamed from: c */
    public final Notification f14561c;

    public C4635p(int i, Notification notification, int i2) {
        this.f14559a = i;
        this.f14561c = notification;
        this.f14560b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4635p pVar = (C4635p) obj;
        if (this.f14559a == pVar.f14559a && this.f14560b == pVar.f14560b) {
            return this.f14561c.equals(pVar.f14561c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f14559a * 31) + this.f14560b) * 31) + this.f14561c.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f14559a + ", mForegroundServiceType=" + this.f14560b + ", mNotification=" + this.f14561c + '}';
    }
}
