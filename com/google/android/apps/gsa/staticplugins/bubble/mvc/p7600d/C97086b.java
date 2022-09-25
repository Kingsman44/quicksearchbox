package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.d.b */
/* compiled from: PG */
final class C97086b extends C97096k {

    /* renamed from: a */
    private final String f271281a;

    /* renamed from: b */
    private final String f271282b;

    /* renamed from: c */
    private final String f271283c;

    /* renamed from: d */
    private final int f271284d;

    public C97086b(String str, String str2, String str3, int i) {
        this.f271281a = str;
        this.f271282b = str2;
        this.f271283c = str3;
        this.f271284d = i;
    }

    /* renamed from: a */
    public final int mo90450a() {
        return this.f271284d;
    }

    /* renamed from: b */
    public final String mo90451b() {
        return this.f271283c;
    }

    /* renamed from: c */
    public final String mo90452c() {
        return this.f271282b;
    }

    /* renamed from: d */
    public final String mo90453d() {
        return this.f271281a;
    }

    /* renamed from: e */
    public final boolean mo90454e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97096k) {
            C97096k kVar = (C97096k) obj;
            return this.f271281a.equals(kVar.mo90453d()) && this.f271282b.equals(kVar.mo90452c()) && this.f271283c.equals(kVar.mo90451b()) && this.f271284d == kVar.mo90450a() && !kVar.mo90454e();
        }
    }

    public final int hashCode() {
        return ((((((((this.f271281a.hashCode() ^ 1000003) * 1000003) ^ this.f271282b.hashCode()) * 1000003) ^ this.f271283c.hashCode()) * 1000003) ^ this.f271284d) * 1000003) ^ 1237;
    }

    public final String toString() {
        String str = this.f271281a;
        String str2 = this.f271282b;
        String str3 = this.f271283c;
        int i = this.f271284d;
        return "BubbleNotification{singleBubbleTitle=" + str + ", multipleBubblesTitle=" + str2 + ", contextText=" + str3 + ", smallIcon=" + i + ", dismissBubbleAction=false}";
    }
}
