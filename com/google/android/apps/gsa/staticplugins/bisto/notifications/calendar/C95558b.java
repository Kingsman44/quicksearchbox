package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.b */
/* compiled from: PG */
final class C95558b extends C95565i {

    /* renamed from: a */
    private final long f267428a;

    /* renamed from: b */
    private final long f267429b;

    /* renamed from: c */
    private final long f267430c;

    /* renamed from: d */
    private final long f267431d;

    /* renamed from: e */
    private final int f267432e;

    /* renamed from: f */
    private final C95568l f267433f;

    public C95558b(long j, long j2, long j3, long j4, int i, C95568l lVar) {
        this.f267428a = j;
        this.f267429b = j2;
        this.f267430c = j3;
        this.f267431d = j4;
        this.f267432e = i;
        this.f267433f = lVar;
    }

    /* renamed from: a */
    public final int mo89461a() {
        return this.f267432e;
    }

    /* renamed from: b */
    public final long mo89462b() {
        return this.f267430c;
    }

    /* renamed from: c */
    public final long mo89463c() {
        return this.f267429b;
    }

    /* renamed from: d */
    public final long mo89464d() {
        return this.f267428a;
    }

    /* renamed from: e */
    public final long mo89465e() {
        return this.f267431d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95565i) {
            C95565i iVar = (C95565i) obj;
            return this.f267428a == iVar.mo89464d() && this.f267429b == iVar.mo89463c() && this.f267430c == iVar.mo89462b() && this.f267431d == iVar.mo89465e() && this.f267432e == iVar.mo89461a() && this.f267433f.equals(iVar.mo89467f());
        }
    }

    /* renamed from: f */
    public final C95568l mo89467f() {
        return this.f267433f;
    }

    public final int hashCode() {
        long j = this.f267428a;
        long j2 = this.f267429b;
        long j3 = this.f267430c;
        long j4 = this.f267431d;
        return this.f267433f.hashCode() ^ ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f267432e) * 1000003);
    }

    public final String toString() {
        long j = this.f267428a;
        long j2 = this.f267429b;
        long j3 = this.f267430c;
        long j4 = this.f267431d;
        int i = this.f267432e;
        String obj = this.f267433f.toString();
        return "AlertInfo{id=" + j + ", eventId=" + j2 + ", alarmTime=" + j3 + ", startTime=" + j4 + ", state=" + i + ", eventInfo=" + obj + "}";
    }
}
