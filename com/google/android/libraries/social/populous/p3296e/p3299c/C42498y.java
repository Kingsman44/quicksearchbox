package com.google.android.libraries.social.populous.p3296e.p3299c;

/* renamed from: com.google.android.libraries.social.populous.e.c.y */
/* compiled from: PG */
final class C42498y extends C42473ax {

    /* renamed from: a */
    public final long f111455a;

    /* renamed from: b */
    public final String f111456b;

    public C42498y(long j, String str) {
        this.f111455a = j;
        if (str != null) {
            this.f111456b = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: a */
    public final long mo45512a() {
        return this.f111455a;
    }

    /* renamed from: b */
    public final String mo45513b() {
        return this.f111456b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42473ax) {
            C42473ax axVar = (C42473ax) obj;
            return this.f111455a == axVar.mo45512a() && this.f111456b.equals(axVar.mo45513b());
        }
    }

    public final int hashCode() {
        long j = this.f111455a;
        return this.f111456b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f111455a;
        String str = this.f111456b;
        return "FeatureSideInput{currentTimeMillis=" + j + ", accountName=" + str + "}";
    }
}
