package com.google.android.libraries.lens.view.filters.p2097a;

/* renamed from: com.google.android.libraries.lens.view.filters.a.a */
/* compiled from: PG */
final class C25850a extends C25865ao {

    /* renamed from: a */
    public final String f70229a;

    /* renamed from: b */
    private final String f70230b;

    /* renamed from: c */
    private final String f70231c;

    /* renamed from: d */
    private final float f70232d;

    public C25850a(String str, String str2, String str3, float f) {
        if (str != null) {
            this.f70229a = str;
            if (str2 != null) {
                this.f70230b = str2;
                if (str3 != null) {
                    this.f70231c = str3;
                    this.f70232d = f;
                    return;
                }
                throw new NullPointerException("Null address");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null placeId");
    }

    /* renamed from: a */
    public final float mo31009a() {
        return this.f70232d;
    }

    /* renamed from: b */
    public final String mo31010b() {
        return this.f70231c;
    }

    /* renamed from: c */
    public final String mo31011c() {
        return this.f70230b;
    }

    /* renamed from: d */
    public final String mo31012d() {
        return this.f70229a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25865ao) {
            C25865ao aoVar = (C25865ao) obj;
            return this.f70229a.equals(aoVar.mo31012d()) && this.f70230b.equals(aoVar.mo31011c()) && this.f70231c.equals(aoVar.mo31010b()) && Float.floatToIntBits(this.f70232d) == Float.floatToIntBits(aoVar.mo31009a());
        }
    }

    public final int hashCode() {
        return ((((((this.f70229a.hashCode() ^ 1000003) * 1000003) ^ this.f70230b.hashCode()) * 1000003) ^ this.f70231c.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f70232d);
    }

    public final String toString() {
        String str = this.f70229a;
        String str2 = this.f70230b;
        String str3 = this.f70231c;
        float f = this.f70232d;
        return "Restaurant{placeId=" + str + ", name=" + str2 + ", address=" + str3 + ", distanceTo=" + f + "}";
    }
}
