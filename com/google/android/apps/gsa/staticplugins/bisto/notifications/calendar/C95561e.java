package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.e */
/* compiled from: PG */
final class C95561e extends C95568l {

    /* renamed from: a */
    private final long f267438a;

    /* renamed from: b */
    private final String f267439b;

    /* renamed from: c */
    private final String f267440c;

    /* renamed from: d */
    private final String f267441d;

    /* renamed from: e */
    private final int f267442e;

    /* renamed from: f */
    private final boolean f267443f;

    /* renamed from: g */
    private final boolean f267444g;

    /* renamed from: h */
    private final boolean f267445h;

    /* renamed from: i */
    private final boolean f267446i;

    public C95561e(long j, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f267438a = j;
        if (str != null) {
            this.f267439b = str;
            if (str2 != null) {
                this.f267440c = str2;
                if (str3 != null) {
                    this.f267441d = str3;
                    this.f267442e = i;
                    this.f267443f = z;
                    this.f267444g = z2;
                    this.f267445h = z3;
                    this.f267446i = z4;
                    return;
                }
                throw new NullPointerException("Null location");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: a */
    public final int mo89480a() {
        return this.f267442e;
    }

    /* renamed from: b */
    public final long mo89481b() {
        return this.f267438a;
    }

    /* renamed from: c */
    public final String mo89482c() {
        return this.f267440c;
    }

    /* renamed from: d */
    public final String mo89483d() {
        return this.f267441d;
    }

    /* renamed from: e */
    public final String mo89484e() {
        return this.f267439b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95568l) {
            C95568l lVar = (C95568l) obj;
            return this.f267438a == lVar.mo89481b() && this.f267439b.equals(lVar.mo89484e()) && this.f267440c.equals(lVar.mo89482c()) && this.f267441d.equals(lVar.mo89483d()) && this.f267442e == lVar.mo89480a() && this.f267443f == lVar.mo89488h() && this.f267444g == lVar.mo89486f() && this.f267445h == lVar.mo89487g() && this.f267446i == lVar.mo89490i();
        }
    }

    /* renamed from: f */
    public final boolean mo89486f() {
        return this.f267444g;
    }

    /* renamed from: g */
    public final boolean mo89487g() {
        return this.f267445h;
    }

    /* renamed from: h */
    public final boolean mo89488h() {
        return this.f267443f;
    }

    public final int hashCode() {
        long j = this.f267438a;
        int i = 1237;
        int hashCode = (((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f267439b.hashCode()) * 1000003) ^ this.f267440c.hashCode()) * 1000003) ^ this.f267441d.hashCode()) * 1000003) ^ this.f267442e) * 1000003) ^ (true != this.f267443f ? 1237 : 1231)) * 1000003) ^ (true != this.f267444g ? 1237 : 1231)) * 1000003) ^ (true != this.f267445h ? 1237 : 1231)) * 1000003;
        if (true == this.f267446i) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo89490i() {
        return this.f267446i;
    }

    public final String toString() {
        long j = this.f267438a;
        String str = this.f267439b;
        String str2 = this.f267440c;
        String str3 = this.f267441d;
        int i = this.f267442e;
        boolean z = this.f267443f;
        boolean z2 = this.f267444g;
        boolean z3 = this.f267445h;
        boolean z4 = this.f267446i;
        return "EventInfo{id=" + j + ", title=" + str + ", description=" + str2 + ", location=" + str3 + ", status=" + i + ", isOrganizer=" + z + ", isAllDay=" + z2 + ", isDeleted=" + z3 + ", isVisible=" + z4 + "}";
    }
}
