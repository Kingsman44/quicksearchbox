package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.at */
/* compiled from: PG */
final class C82318at extends C82547jf {

    /* renamed from: a */
    private final String f224869a;

    /* renamed from: b */
    private final String f224870b;

    /* renamed from: c */
    private final String f224871c;

    /* renamed from: d */
    private final boolean f224872d;

    public C82318at(String str, String str2, String str3, boolean z) {
        this.f224869a = str;
        this.f224870b = str2;
        this.f224871c = str3;
        this.f224872d = z;
    }

    /* renamed from: b */
    public final String mo75678b() {
        return this.f224871c;
    }

    /* renamed from: c */
    public final String mo75679c() {
        return this.f224870b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224869a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82547jf) {
            C82547jf jfVar = (C82547jf) obj;
            return this.f224869a.equals(jfVar.mo75583d()) && this.f224870b.equals(jfVar.mo75679c()) && this.f224871c.equals(jfVar.mo75678b()) && !jfVar.mo75681f() && this.f224872d == jfVar.mo75682g();
        }
    }

    /* renamed from: f */
    public final boolean mo75681f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo75682g() {
        return this.f224872d;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f224869a.hashCode() ^ 1000003) * 1000003) ^ this.f224870b.hashCode()) * 1000003) ^ this.f224871c.hashCode()) * 1000003) ^ 1237) * 1000003;
        if (true == this.f224872d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f224869a;
        String str2 = this.f224870b;
        String str3 = this.f224871c;
        boolean z = this.f224872d;
        return "MicTimeoutEvent{token=" + str + ", speechRecognizer=" + str2 + ", sessionType=" + str3 + ", isContinuousMode=false, onDeviceEnabled=" + z + "}";
    }
}
