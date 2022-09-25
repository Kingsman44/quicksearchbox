package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.p */
/* compiled from: PG */
public final class C82703p extends C82516ib {

    /* renamed from: a */
    private final String f225479a = "DID_ACOUSTIC_FILTER_REJECT";

    /* renamed from: b */
    private final String f225480b;

    /* renamed from: c */
    private final String f225481c;

    public C82703p(String str, String str2, String str3) {
        this.f225480b = str2;
        this.f225481c = str3;
    }

    /* renamed from: b */
    public final String mo76552b() {
        return this.f225480b;
    }

    /* renamed from: c */
    public final String mo76553c() {
        return this.f225481c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225479a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82516ib) {
            C82516ib ibVar = (C82516ib) obj;
            return this.f225479a.equals(ibVar.mo75583d()) && this.f225480b.equals(ibVar.mo76552b()) && this.f225481c.equals(ibVar.mo76553c());
        }
    }

    public final int hashCode() {
        return ((((this.f225479a.hashCode() ^ 1000003) * 1000003) ^ this.f225480b.hashCode()) * 1000003) ^ this.f225481c.hashCode();
    }

    public final String toString() {
        String str = this.f225479a;
        String str2 = this.f225480b;
        String str3 = this.f225481c;
        return "DidAcousticFilterRejectEvent{token=" + str + ", languageCode=" + str2 + ", mode=" + str3 + "}";
    }
}
