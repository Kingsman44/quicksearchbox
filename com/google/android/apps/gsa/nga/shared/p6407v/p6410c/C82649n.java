package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.n */
/* compiled from: PG */
public final class C82649n extends C82513hz {

    /* renamed from: a */
    private final String f225476a = "BISTO_TRANSCRIPTION_STATUS";

    /* renamed from: b */
    private final String f225477b;

    public C82649n(String str, String str2) {
        this.f225477b = str2;
    }

    /* renamed from: b */
    public final String mo76551b() {
        return this.f225477b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225476a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82513hz) {
            C82513hz hzVar = (C82513hz) obj;
            return this.f225476a.equals(hzVar.mo75583d()) && this.f225477b.equals(hzVar.mo76551b());
        }
    }

    public final int hashCode() {
        return ((this.f225476a.hashCode() ^ 1000003) * 1000003) ^ this.f225477b.hashCode();
    }

    public final String toString() {
        String str = this.f225476a;
        String str2 = this.f225477b;
        return "BistoTranscriptionStatusEvent{token=" + str + ", status=" + str2 + "}";
    }
}
