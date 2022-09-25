package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.$AutoValue_AnnounceableEvent  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AnnounceableEvent extends AnnounceableEvent {

    /* renamed from: a */
    public final long f267422a;

    /* renamed from: b */
    public final long f267423b;

    /* renamed from: c */
    public final String f267424c;

    /* renamed from: d */
    public final String f267425d;

    /* renamed from: e */
    public final String f267426e;

    /* renamed from: f */
    public final long f267427f;

    public C$AutoValue_AnnounceableEvent(long j, long j2, String str, String str2, String str3, long j3) {
        this.f267422a = j;
        this.f267423b = j2;
        if (str != null) {
            this.f267424c = str;
            if (str2 != null) {
                this.f267425d = str2;
                if (str3 != null) {
                    this.f267426e = str3;
                    this.f267427f = j3;
                    return;
                }
                throw new NullPointerException("Null location");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: a */
    public final long mo89448a() {
        return this.f267422a;
    }

    /* renamed from: b */
    public final long mo89449b() {
        return this.f267423b;
    }

    /* renamed from: c */
    public final long mo89450c() {
        return this.f267427f;
    }

    /* renamed from: d */
    public final String mo89451d() {
        return this.f267425d;
    }

    /* renamed from: e */
    public final String mo89452e() {
        return this.f267426e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnnounceableEvent) {
            AnnounceableEvent announceableEvent = (AnnounceableEvent) obj;
            return this.f267422a == announceableEvent.mo89448a() && this.f267423b == announceableEvent.mo89449b() && this.f267424c.equals(announceableEvent.mo89454f()) && this.f267425d.equals(announceableEvent.mo89451d()) && this.f267426e.equals(announceableEvent.mo89452e()) && this.f267427f == announceableEvent.mo89450c();
        }
    }

    /* renamed from: f */
    public final String mo89454f() {
        return this.f267424c;
    }

    public final int hashCode() {
        long j = this.f267422a;
        long j2 = this.f267423b;
        int hashCode = this.f267424c.hashCode();
        int hashCode2 = this.f267425d.hashCode();
        int hashCode3 = this.f267426e.hashCode();
        long j3 = this.f267427f;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003);
    }
}
