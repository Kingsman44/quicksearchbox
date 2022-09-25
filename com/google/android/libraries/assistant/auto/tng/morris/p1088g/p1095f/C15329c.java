package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.c */
/* compiled from: PG */
final class C15329c extends C15334h {

    /* renamed from: a */
    private final int f46008a;

    /* renamed from: b */
    private final int f46009b;

    public C15329c(int i, int i2) {
        this.f46008a = i;
        this.f46009b = i2;
    }

    /* renamed from: a */
    public final int mo22192a() {
        return this.f46008a;
    }

    /* renamed from: b */
    public final int mo22193b() {
        return this.f46009b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15334h) {
            C15334h hVar = (C15334h) obj;
            return this.f46008a == hVar.mo22192a() && this.f46009b == hVar.mo22193b();
        }
    }

    public final int hashCode() {
        return ((this.f46008a ^ 1000003) * 1000003) ^ this.f46009b;
    }

    public final String toString() {
        int i = this.f46008a;
        int i2 = this.f46009b;
        return "IconDrawables{highlighted=" + i + ", nonHighlighted=" + i2 + "}";
    }
}
