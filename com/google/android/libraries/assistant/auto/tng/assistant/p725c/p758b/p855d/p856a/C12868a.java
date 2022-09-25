package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.a.a */
/* compiled from: PG */
public final class C12868a extends C12869b {

    /* renamed from: a */
    private final C12877j f40133a;

    public C12868a(C12877j jVar) {
        this.f40133a = jVar;
    }

    /* renamed from: a */
    public final C12877j mo20817a() {
        return this.f40133a;
    }

    /* renamed from: b */
    public final int mo20818b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12874g) {
            C12874g gVar = (C12874g) obj;
            if (gVar.mo20818b() != 1 || !this.f40133a.equals(gVar.mo20817a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40133a.hashCode();
    }

    public final String toString() {
        String obj = this.f40133a.toString();
        return "ClientOpMetadata{ttsOutputClientOpMetadata=" + obj + "}";
    }
}
