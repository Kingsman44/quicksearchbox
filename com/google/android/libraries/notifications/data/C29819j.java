package com.google.android.libraries.notifications.data;

/* renamed from: com.google.android.libraries.notifications.data.j */
/* compiled from: PG */
public final class C29819j extends C29828s {

    /* renamed from: a */
    public final long f80835a;

    /* renamed from: b */
    public final String f80836b;

    /* renamed from: c */
    public final long f80837c;

    /* renamed from: d */
    public final long f80838d;

    /* renamed from: e */
    public final int f80839e;

    /* renamed from: f */
    public final int f80840f;

    /* renamed from: g */
    public final int f80841g;

    /* renamed from: h */
    public final int f80842h;

    public C29819j(long j, String str, long j2, int i, int i2, int i3, int i4, long j3) {
        this.f80835a = j;
        this.f80836b = str;
        this.f80837c = j2;
        this.f80839e = i;
        this.f80840f = i2;
        this.f80841g = i3;
        this.f80842h = i4;
        this.f80838d = j3;
    }

    /* renamed from: a */
    public final long mo35121a() {
        return this.f80835a;
    }

    /* renamed from: b */
    public final long mo35122b() {
        return this.f80837c;
    }

    /* renamed from: c */
    public final long mo35123c() {
        return this.f80838d;
    }

    /* renamed from: d */
    public final String mo35124d() {
        return this.f80836b;
    }

    /* renamed from: e */
    public final int mo35125e() {
        return this.f80841g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29828s) {
            C29828s sVar = (C29828s) obj;
            return this.f80835a == sVar.mo35121a() && this.f80836b.equals(sVar.mo35124d()) && this.f80837c == sVar.mo35122b() && this.f80839e == sVar.mo35128g() && this.f80840f == sVar.mo35127f() && this.f80841g == sVar.mo35125e() && this.f80842h == sVar.mo35129h() && this.f80838d == sVar.mo35123c();
        }
    }

    /* renamed from: f */
    public final int mo35127f() {
        return this.f80840f;
    }

    /* renamed from: g */
    public final int mo35128g() {
        return this.f80839e;
    }

    /* renamed from: h */
    public final int mo35129h() {
        return this.f80842h;
    }

    public final int hashCode() {
        long j = this.f80835a;
        int hashCode = this.f80836b.hashCode();
        long j2 = this.f80837c;
        int i = this.f80839e;
        int i2 = this.f80840f;
        int i3 = this.f80841g;
        int i4 = this.f80842h;
        long j3 = this.f80838d;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003);
    }

    public final String toString() {
        long j = this.f80835a;
        String str = this.f80836b;
        long j2 = this.f80837c;
        String num = Integer.toString(this.f80839e - 1);
        String num2 = Integer.toString(this.f80840f - 1);
        String num3 = Integer.toString(this.f80841g - 1);
        String num4 = Integer.toString(this.f80842h - 1);
        long j3 = this.f80838d;
        return "ChimeThreadState{id=" + j + ", threadId=" + str + ", lastUpdatedVersion=" + j2 + ", readState=" + num + ", deletionStatus=" + num2 + ", countBehavior=" + num3 + ", systemTrayBehavior=" + num4 + ", modifiedTimestamp=" + j3 + "}";
    }
}
