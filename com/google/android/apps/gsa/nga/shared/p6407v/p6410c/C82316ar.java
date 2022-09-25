package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ar */
/* compiled from: PG */
final class C82316ar extends C82545jd {

    /* renamed from: a */
    private final String f224858a;

    /* renamed from: b */
    private final boolean f224859b;

    /* renamed from: c */
    private final String f224860c;

    /* renamed from: d */
    private final String f224861d;

    /* renamed from: e */
    private final String f224862e;

    /* renamed from: f */
    private final int f224863f;

    public C82316ar(String str, boolean z, String str2, String str3, String str4, int i) {
        this.f224858a = str;
        this.f224859b = z;
        this.f224860c = str2;
        this.f224861d = str3;
        this.f224862e = str4;
        this.f224863f = i;
    }

    /* renamed from: b */
    public final int mo75666b() {
        return this.f224863f;
    }

    /* renamed from: c */
    public final String mo75667c() {
        return this.f224860c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224858a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82545jd) {
            C82545jd jdVar = (C82545jd) obj;
            return this.f224858a.equals(jdVar.mo75583d()) && this.f224859b == jdVar.mo75673i() && this.f224860c.equals(jdVar.mo75667c()) && this.f224861d.equals(jdVar.mo75670g()) && this.f224862e.equals(jdVar.mo75669f()) && !jdVar.mo75671h() && this.f224863f == jdVar.mo75666b();
        }
    }

    /* renamed from: f */
    public final String mo75669f() {
        return this.f224862e;
    }

    /* renamed from: g */
    public final String mo75670g() {
        return this.f224861d;
    }

    /* renamed from: h */
    public final boolean mo75671h() {
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f224858a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f224859b ? 1237 : 1231)) * 1000003) ^ this.f224860c.hashCode()) * 1000003) ^ this.f224861d.hashCode()) * 1000003) ^ this.f224862e.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.f224863f;
    }

    /* renamed from: i */
    public final boolean mo75673i() {
        return this.f224859b;
    }

    public final String toString() {
        String str = this.f224858a;
        boolean z = this.f224859b;
        String str2 = this.f224860c;
        String str3 = this.f224861d;
        String str4 = this.f224862e;
        int i = this.f224863f;
        return "MicStatusEvent{token=" + str + ", onDeviceEnabled=" + z + ", action=" + str2 + ", status=" + str3 + ", sessionType=" + str4 + ", isContinuousMode=false, apiLevel=" + i + "}";
    }
}
