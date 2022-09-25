package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.l */
/* compiled from: PG */
final class C82595l extends C82511hx {

    /* renamed from: a */
    private final String f225472a;

    /* renamed from: b */
    private final String f225473b;

    public C82595l(String str, String str2) {
        this.f225472a = str;
        this.f225473b = str2;
    }

    /* renamed from: b */
    public final String mo76549b() {
        return this.f225473b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225472a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82511hx) {
            C82511hx hxVar = (C82511hx) obj;
            return this.f225472a.equals(hxVar.mo75583d()) && this.f225473b.equals(hxVar.mo76549b());
        }
    }

    public final int hashCode() {
        return ((this.f225472a.hashCode() ^ 1000003) * 1000003) ^ this.f225473b.hashCode();
    }

    public final String toString() {
        String str = this.f225472a;
        String str2 = this.f225473b;
        return "BistoDeviceActionStatusEvent{token=" + str + ", status=" + str2 + "}";
    }
}
