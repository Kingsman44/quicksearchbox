package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.f */
/* compiled from: PG */
final class C95562f extends C95569m {

    /* renamed from: a */
    private final long f267447a;

    /* renamed from: b */
    private final long f267448b;

    /* renamed from: c */
    private final long f267449c;

    /* renamed from: d */
    private final C95568l f267450d;

    public C95562f(long j, long j2, long j3, C95568l lVar) {
        this.f267447a = j;
        this.f267448b = j2;
        this.f267449c = j3;
        this.f267450d = lVar;
    }

    /* renamed from: a */
    public final long mo89492a() {
        return this.f267448b;
    }

    /* renamed from: b */
    public final long mo89493b() {
        return this.f267447a;
    }

    /* renamed from: c */
    public final long mo89494c() {
        return this.f267449c;
    }

    /* renamed from: d */
    public final C95568l mo89495d() {
        return this.f267450d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95569m) {
            C95569m mVar = (C95569m) obj;
            return this.f267447a == mVar.mo89493b() && this.f267448b == mVar.mo89492a() && this.f267449c == mVar.mo89494c() && this.f267450d.equals(mVar.mo89495d());
        }
    }

    public final int hashCode() {
        long j = this.f267447a;
        long j2 = this.f267448b;
        long j3 = this.f267449c;
        return this.f267450d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        long j = this.f267447a;
        long j2 = this.f267448b;
        long j3 = this.f267449c;
        String obj = this.f267450d.toString();
        return "InstanceInfo{id=" + j + ", eventId=" + j2 + ", startTime=" + j3 + ", eventInfo=" + obj + "}";
    }
}
