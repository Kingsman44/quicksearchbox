package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.s */
/* compiled from: PG */
public final class C82741s extends C82519ie {

    /* renamed from: a */
    private final String f225490a = "DID_QUERY_CLASSIFIER_INFERENCE_COUNT";

    public C82741s(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225490a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82519ie) {
            return this.f225490a.equals(((C82519ie) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f225490a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f225490a;
        return "DidQueryClassifierInferenceCount{token=" + str + "}";
    }
}
