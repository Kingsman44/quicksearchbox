package com.google.android.libraries.appactions.p11035a;

/* renamed from: com.google.android.libraries.appactions.a.ae */
/* compiled from: PG */
final class C147829ae extends C147840h {

    /* renamed from: a */
    private final String f398834a;

    /* renamed from: b */
    private final boolean f398835b;

    /* renamed from: c */
    private final boolean f398836c;

    /* renamed from: d */
    private final int f398837d;

    public C147829ae(String str, int i, boolean z, boolean z2) {
        if (str != null) {
            this.f398834a = str;
            this.f398837d = i;
            this.f398835b = z;
            this.f398836c = z2;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* renamed from: a */
    public final String mo124506a() {
        return this.f398834a;
    }

    /* renamed from: b */
    public final boolean mo124507b() {
        return this.f398835b;
    }

    /* renamed from: c */
    public final boolean mo124508c() {
        return this.f398836c;
    }

    /* renamed from: d */
    public final int mo124509d() {
        return this.f398837d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147840h) {
            C147840h hVar = (C147840h) obj;
            return this.f398834a.equals(hVar.mo124506a()) && this.f398837d == hVar.mo124509d() && this.f398835b == hVar.mo124507b() && this.f398836c == hVar.mo124508c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f398834a.hashCode() ^ 1000003) * 1000003) ^ this.f398837d) * 1000003) ^ (true != this.f398835b ? 1237 : 1231)) * 1000003;
        if (true == this.f398836c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f398834a;
        int i = this.f398837d;
        if (i != 1) {
            String num = Integer.toString(i - 2);
            boolean z = this.f398835b;
            boolean z2 = this.f398836c;
            return "AppActionsFulfillmentResult{url=" + str + ", fulfillmentMode=" + num + ", hasResolvedParams=" + z + ", isOverAppFulfillment=" + z2 + "}";
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
