package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cl */
/* compiled from: PG */
public final class C82364cl extends C82593ky {

    /* renamed from: a */
    private final String f225003a = "NGA_GMAIL_SEARCH_INTENT_GENERATED_PREDICATE_COUNT";

    /* renamed from: b */
    private final String f225004b;

    public C82364cl(String str, String str2) {
        this.f225004b = str2;
    }

    /* renamed from: b */
    public final String mo75873b() {
        return this.f225004b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225003a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82593ky) {
            C82593ky kyVar = (C82593ky) obj;
            return this.f225003a.equals(kyVar.mo75583d()) && this.f225004b.equals(kyVar.mo75873b());
        }
    }

    public final int hashCode() {
        return ((this.f225003a.hashCode() ^ 1000003) * 1000003) ^ this.f225004b.hashCode();
    }

    public final String toString() {
        String str = this.f225003a;
        String str2 = this.f225004b;
        return "NgaGmailSearchIntentGeneratedPredicateCountEvent{token=" + str + ", predicate=" + str2 + "}";
    }
}
