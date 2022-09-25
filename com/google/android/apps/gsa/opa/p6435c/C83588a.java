package com.google.android.apps.gsa.opa.p6435c;

/* renamed from: com.google.android.apps.gsa.opa.c.a */
/* compiled from: PG */
final class C83588a extends C83590b {

    /* renamed from: a */
    private final Integer f227893a;

    /* renamed from: b */
    private final Integer f227894b;

    public C83588a(Integer num, Integer num2) {
        this.f227893a = num;
        this.f227894b = num2;
    }

    /* renamed from: a */
    public final Integer mo76946a() {
        return this.f227894b;
    }

    /* renamed from: b */
    public final Integer mo76947b() {
        return this.f227893a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83590b) {
            C83590b bVar = (C83590b) obj;
            return this.f227893a.equals(bVar.mo76947b()) && this.f227894b.equals(bVar.mo76946a());
        }
    }

    public final int hashCode() {
        return ((this.f227893a.hashCode() ^ 1000003) * 1000003) ^ this.f227894b.hashCode();
    }

    public final String toString() {
        Integer num = this.f227893a;
        Integer num2 = this.f227894b;
        return "CallDurationBucket{startTimeMs=" + num + ", durationMs=" + num2 + "}";
    }
}
