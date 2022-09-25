package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a;

import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.a.c */
/* compiled from: PG */
public final class C12870c extends C12872e {

    /* renamed from: a */
    private final C57981b f40134a;

    public C12870c(C57981b bVar) {
        this.f40134a = bVar;
    }

    /* renamed from: a */
    public final C57981b mo20822a() {
        return this.f40134a;
    }

    /* renamed from: b */
    public final int mo20823b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12877j) {
            C12877j jVar = (C12877j) obj;
            if (jVar.mo20823b() != 1 || !this.f40134a.equals(jVar.mo20822a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40134a.hashCode();
    }

    public final String toString() {
        String obj = this.f40134a.toString();
        return "TtsOutputClientOpMetadata{ttsAudioChunkSource=" + obj + "}";
    }
}
