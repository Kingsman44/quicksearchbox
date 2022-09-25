package com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e;

/* renamed from: com.google.android.libraries.search.assistant.t.b.e.a */
/* compiled from: PG */
final class C36497a extends C36498b {

    /* renamed from: a */
    private final C36499c f95250a;

    /* renamed from: b */
    private final C36500d f95251b;

    public C36497a(C36499c cVar, C36500d dVar) {
        if (cVar != null) {
            this.f95250a = cVar;
            if (dVar != null) {
                this.f95251b = dVar;
                return;
            }
            throw new NullPointerException("Null result");
        }
        throw new NullPointerException("Null operation");
    }

    /* renamed from: a */
    public final C36499c mo40198a() {
        return this.f95250a;
    }

    /* renamed from: b */
    public final C36500d mo40199b() {
        return this.f95251b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36498b) {
            C36498b bVar = (C36498b) obj;
            return this.f95250a.equals(bVar.mo40198a()) && this.f95251b.equals(bVar.mo40199b());
        }
    }

    public final int hashCode() {
        return ((this.f95250a.hashCode() ^ 1000003) * 1000003) ^ this.f95251b.hashCode();
    }

    public final String toString() {
        String obj = this.f95250a.toString();
        String obj2 = this.f95251b.toString();
        return "Event{operation=" + obj + ", result=" + obj2 + "}";
    }
}
