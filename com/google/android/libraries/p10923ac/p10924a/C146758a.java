package com.google.android.libraries.p10923ac.p10924a;

/* renamed from: com.google.android.libraries.ac.a.a */
/* compiled from: PG */
public final class C146758a extends C146763f {

    /* renamed from: a */
    private final Object f396282a;

    /* renamed from: b */
    private final C146766i f396283b;

    public C146758a(Object obj, C146766i iVar) {
        this.f396282a = obj;
        this.f396283b = iVar;
    }

    /* renamed from: a */
    public final C146766i mo123591a() {
        return this.f396283b;
    }

    /* renamed from: b */
    public final Object mo123592b() {
        return this.f396282a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146763f) {
            C146763f fVar = (C146763f) obj;
            return this.f396282a.equals(fVar.mo123592b()) && this.f396283b.equals(fVar.mo123591a());
        }
    }

    public final int hashCode() {
        return ((this.f396282a.hashCode() ^ 1000003) * 1000003) ^ this.f396283b.hashCode();
    }

    public final String toString() {
        String obj = this.f396282a.toString();
        String obj2 = this.f396283b.toString();
        return "MdhReadResult{value=" + obj + ", syncStatus=" + obj2 + "}";
    }
}
