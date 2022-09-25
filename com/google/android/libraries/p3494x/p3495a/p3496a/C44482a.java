package com.google.android.libraries.p3494x.p3495a.p3496a;

/* renamed from: com.google.android.libraries.x.a.a.a */
/* compiled from: PG */
final class C44482a extends C44489h {

    /* renamed from: a */
    public final String f115632a;

    public C44482a(String str) {
        this.f115632a = str;
    }

    /* renamed from: a */
    public final int mo47364a() {
        return 0;
    }

    /* renamed from: b */
    public final String mo47365b() {
        return this.f115632a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C44489h) {
            C44489h hVar = (C44489h) obj;
            return this.f115632a.equals(hVar.mo47365b()) && hVar.mo47364a() == 0;
        }
    }

    public final int hashCode() {
        return (this.f115632a.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        String str = this.f115632a;
        return "TargetPackage{packageName=" + str + ", minVersion=0}";
    }
}
