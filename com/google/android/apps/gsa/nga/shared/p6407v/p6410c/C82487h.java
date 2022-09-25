package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.h */
/* compiled from: PG */
public final class C82487h extends C82352c {

    /* renamed from: a */
    private final String f225388a = "AUDIO_BUFFER_OVERFLOW";

    /* renamed from: b */
    private final boolean f225389b;

    /* renamed from: c */
    private final String f225390c;

    /* renamed from: d */
    private final String f225391d;

    public C82487h(String str, boolean z, String str2, String str3) {
        this.f225389b = z;
        this.f225390c = str2;
        this.f225391d = str3;
    }

    /* renamed from: b */
    public final String mo75829b() {
        return this.f225390c;
    }

    /* renamed from: c */
    public final String mo75830c() {
        return this.f225391d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225388a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82352c) {
            C82352c cVar = (C82352c) obj;
            return this.f225388a.equals(cVar.mo75583d()) && this.f225389b == cVar.mo75831f() && this.f225390c.equals(cVar.mo75829b()) && this.f225391d.equals(cVar.mo75830c());
        }
    }

    /* renamed from: f */
    public final boolean mo75831f() {
        return this.f225389b;
    }

    public final int hashCode() {
        return ((((((this.f225388a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f225389b ? 1237 : 1231)) * 1000003) ^ this.f225390c.hashCode()) * 1000003) ^ this.f225391d.hashCode();
    }

    public final String toString() {
        String str = this.f225388a;
        boolean z = this.f225389b;
        String str2 = this.f225390c;
        String str3 = this.f225391d;
        return "AudioBufferOverflowEvent{token=" + str + ", onDeviceEnabled=" + z + ", sessionType=" + str2 + ", speechRecognizer=" + str3 + "}";
    }
}
