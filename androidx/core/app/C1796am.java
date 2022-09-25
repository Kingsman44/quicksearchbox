package androidx.core.app;

import android.app.Notification;

/* renamed from: androidx.core.app.am */
/* compiled from: PG */
final class C1796am {

    /* renamed from: a */
    final String f5601a;

    /* renamed from: b */
    final int f5602b;

    /* renamed from: c */
    final String f5603c;

    /* renamed from: d */
    final Notification f5604d;

    public C1796am(String str, int i, String str2, Notification notification) {
        this.f5601a = str;
        this.f5602b = i;
        this.f5603c = str2;
        this.f5604d = notification;
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f5601a + ", id:" + this.f5602b + ", tag:" + this.f5603c + "]";
    }
}
