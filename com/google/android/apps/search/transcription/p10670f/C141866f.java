package com.google.android.apps.search.transcription.p10670f;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;

/* renamed from: com.google.android.apps.search.transcription.f.f */
/* compiled from: PG */
final class C141866f extends C141808b {

    /* renamed from: a */
    private final C39226b f384967a;

    /* renamed from: b */
    private final int f384968b;

    public C141866f(C39226b bVar, int i) {
        this.f384967a = bVar;
        this.f384968b = i;
    }

    /* renamed from: a */
    public final int mo116760a() {
        return this.f384968b;
    }

    /* renamed from: c */
    public final C39226b mo116761c() {
        return this.f384967a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C141808b) {
            C141808b bVar = (C141808b) obj;
            return this.f384967a.equals(bVar.mo116761c()) && this.f384968b == bVar.mo116760a();
        }
    }

    public final int hashCode() {
        return ((this.f384967a.hashCode() ^ 1000003) * 1000003) ^ this.f384968b;
    }

    public final String toString() {
        String num = Integer.toString(this.f384967a.getNumber());
        int i = this.f384968b;
        return "AttributionParams{attributionId=" + num + ", callingUidToBlame=" + i + "}";
    }
}
