package com.google.android.apps.gsa.staticplugins.p7686co;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a */
/* compiled from: PG */
final class C98044a extends C98486z {

    /* renamed from: a */
    private final C98484x f273771a;

    /* renamed from: b */
    private final long f273772b;

    /* renamed from: c */
    private final boolean f273773c;

    /* renamed from: d */
    private final long f273774d;

    /* renamed from: e */
    private final long f273775e;

    public C98044a(C98484x xVar, long j, boolean z, long j2, long j3) {
        if (xVar != null) {
            this.f273771a = xVar;
            this.f273772b = j;
            this.f273773c = z;
            this.f273774d = j2;
            this.f273775e = j3;
            return;
        }
        throw new NullPointerException("Null result");
    }

    /* renamed from: a */
    public final long mo90898a() {
        return this.f273774d;
    }

    /* renamed from: b */
    public final long mo90899b() {
        return this.f273775e;
    }

    /* renamed from: c */
    public final long mo90900c() {
        return this.f273772b;
    }

    /* renamed from: e */
    public final C98484x mo90901e() {
        return this.f273771a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98486z) {
            C98486z zVar = (C98486z) obj;
            return this.f273771a.equals(zVar.mo90901e()) && this.f273772b == zVar.mo90900c() && this.f273773c == zVar.mo90903f() && this.f273774d == zVar.mo90898a() && this.f273775e == zVar.mo90899b();
        }
    }

    /* renamed from: f */
    public final boolean mo90903f() {
        return this.f273773c;
    }

    public final int hashCode() {
        int hashCode = this.f273771a.hashCode();
        long j = this.f273772b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = true != this.f273773c ? 1237 : 1231;
        long j2 = this.f273774d;
        long j3 = this.f273775e;
        return ((((i ^ i2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        String obj = this.f273771a.toString();
        long j = this.f273772b;
        boolean z = this.f273773c;
        long j2 = this.f273774d;
        long j3 = this.f273775e;
        return "RefreshEvaluation{result=" + obj + ", timestamp=" + j + ", pushRequested=" + z + ", refreshAgeMinutes=" + j2 + ", sessionAgeMinutes=" + j3 + "}";
    }
}
