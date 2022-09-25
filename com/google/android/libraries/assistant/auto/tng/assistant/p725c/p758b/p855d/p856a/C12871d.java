package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.a.d */
/* compiled from: PG */
public final class C12871d extends C12872e {

    /* renamed from: a */
    private final C12878k f40135a;

    public C12871d(C12878k kVar) {
        this.f40135a = kVar;
    }

    /* renamed from: b */
    public final int mo20823b() {
        return 2;
    }

    /* renamed from: c */
    public final C12878k mo20827c() {
        return this.f40135a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12877j) {
            C12877j jVar = (C12877j) obj;
            if (jVar.mo20823b() != 2 || !this.f40135a.equals(jVar.mo20827c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1000001;
    }

    public final String toString() {
        return "TtsOutputClientOpMetadata{ttsSynthesisMetadata=TtsSynthesisMetadata{synthesisMode=OFFLINE}}";
    }
}
