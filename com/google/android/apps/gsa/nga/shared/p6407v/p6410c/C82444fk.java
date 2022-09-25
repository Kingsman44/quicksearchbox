package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fk */
/* compiled from: PG */
public final class C82444fk extends C82673nx {

    /* renamed from: a */
    private final String f225273a = "NGA_UI_SUGGESTION_INVOCATION_COLLECTION_TIMEOUT";

    /* renamed from: b */
    private final String f225274b;

    public C82444fk(String str, String str2) {
        this.f225274b = str2;
    }

    /* renamed from: b */
    public final String mo76251b() {
        return this.f225274b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225273a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82673nx) {
            C82673nx nxVar = (C82673nx) obj;
            return this.f225273a.equals(nxVar.mo75583d()) && this.f225274b.equals(nxVar.mo76251b());
        }
    }

    public final int hashCode() {
        return ((this.f225273a.hashCode() ^ 1000003) * 1000003) ^ this.f225274b.hashCode();
    }

    public final String toString() {
        String str = this.f225273a;
        String str2 = this.f225274b;
        return "NgaUiSuggestionInvocationCollectionTimeoutEvent{token=" + str + ", providerName=" + str2 + "}";
    }
}
