package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gt */
/* compiled from: PG */
public final class C82480gt extends C82710pg {

    /* renamed from: a */
    private final String f225368a = "NO_SPEECH_DETECTED";

    public C82480gt(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225368a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82710pg) {
            return this.f225368a.equals(((C82710pg) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f225368a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f225368a;
        return "NoSpeechDetectedEvent{token=" + str + "}";
    }
}
