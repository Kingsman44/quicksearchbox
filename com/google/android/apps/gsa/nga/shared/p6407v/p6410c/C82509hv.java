package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hv */
/* compiled from: PG */
final class C82509hv extends C82739qi {

    /* renamed from: a */
    private final String f225462a;

    /* renamed from: b */
    private final String f225463b;

    public C82509hv(String str, String str2) {
        this.f225462a = str;
        this.f225463b = str2;
    }

    /* renamed from: b */
    public final String mo76544b() {
        return this.f225463b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225462a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82739qi) {
            C82739qi qiVar = (C82739qi) obj;
            return this.f225462a.equals(qiVar.mo75583d()) && this.f225463b.equals(qiVar.mo76544b());
        }
    }

    public final int hashCode() {
        return ((this.f225462a.hashCode() ^ 1000003) * 1000003) ^ this.f225463b.hashCode();
    }

    public final String toString() {
        String str = this.f225462a;
        String str2 = this.f225463b;
        return "WatchSuggestionQueryStatusEvent{token=" + str + ", status=" + str2 + "}";
    }
}
