package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8745m;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.m.a */
/* compiled from: PG */
final class C116986a extends C116989d {

    /* renamed from: a */
    private final String f324774a;

    /* renamed from: b */
    private final String f324775b;

    public C116986a(String str, String str2) {
        this.f324774a = str;
        this.f324775b = str2;
    }

    /* renamed from: a */
    public final String mo103082a() {
        return this.f324775b;
    }

    /* renamed from: b */
    public final String mo103083b() {
        return this.f324774a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C116989d) {
            C116989d dVar = (C116989d) obj;
            return this.f324774a.equals(dVar.mo103083b()) && this.f324775b.equals(dVar.mo103082a());
        }
    }

    public final int hashCode() {
        return ((this.f324774a.hashCode() ^ 1000003) * 1000003) ^ this.f324775b.hashCode();
    }

    public final String toString() {
        String str = this.f324774a;
        String str2 = this.f324775b;
        return "SliceInfo{sliceUri=" + str + ", sliceIconUri=" + str2 + "}";
    }
}
