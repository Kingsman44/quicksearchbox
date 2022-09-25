package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a */
/* compiled from: PG */
public final class C95645a extends C95692p {

    /* renamed from: a */
    public final boolean f267691a;

    /* renamed from: b */
    public final boolean f267692b;

    public C95645a(boolean z, boolean z2) {
        this.f267691a = z;
        this.f267692b = z2;
    }

    /* renamed from: a */
    public final boolean mo89608a() {
        return this.f267691a;
    }

    /* renamed from: b */
    public final boolean mo89609b() {
        return this.f267692b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95692p) {
            C95692p pVar = (C95692p) obj;
            return this.f267691a == pVar.mo89608a() && this.f267692b == pVar.mo89609b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f267691a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f267692b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f267691a;
        boolean z2 = this.f267692b;
        return "NotificationPermissionSnapshot{canAccessNotifications=" + z + ", canReadPersonalResults=" + z2 + "}";
    }
}
