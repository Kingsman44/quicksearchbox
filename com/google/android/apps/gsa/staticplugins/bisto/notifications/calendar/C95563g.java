package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.g */
/* compiled from: PG */
final class C95563g extends C95570n {

    /* renamed from: a */
    private final int f267451a;

    /* renamed from: b */
    private final int f267452b;

    public C95563g(int i, int i2) {
        this.f267451a = i;
        this.f267452b = i2;
    }

    /* renamed from: a */
    public final int mo89499a() {
        return this.f267452b;
    }

    /* renamed from: b */
    public final int mo89500b() {
        return this.f267451a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95570n) {
            C95570n nVar = (C95570n) obj;
            return this.f267451a == nVar.mo89500b() && this.f267452b == nVar.mo89499a();
        }
    }

    public final int hashCode() {
        return ((this.f267451a ^ 1000003) * 1000003) ^ this.f267452b;
    }

    public final String toString() {
        int i = this.f267451a;
        int i2 = this.f267452b;
        return "ReminderInfo{minutes=" + i + ", method=" + i2 + "}";
    }
}
