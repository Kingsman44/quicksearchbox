package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.j */
/* compiled from: PG */
final class C15254j extends C15252h {

    /* renamed from: a */
    private final int f45778a;

    /* renamed from: b */
    private final int f45779b;

    public C15254j(int i, int i2) {
        this.f45778a = i;
        this.f45779b = i2;
    }

    /* renamed from: a */
    public final int mo22134a() {
        return this.f45779b;
    }

    /* renamed from: b */
    public final int mo22135b() {
        return this.f45778a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15252h) {
            C15252h hVar = (C15252h) obj;
            return this.f45778a == hVar.mo22135b() && this.f45779b == hVar.mo22134a();
        }
    }

    public final int hashCode() {
        return ((this.f45778a ^ 1000003) * 1000003) ^ this.f45779b;
    }

    public final String toString() {
        int i = this.f45778a;
        int i2 = this.f45779b;
        return "IconDrawables{nonHighlighted=" + i + ", highlighted=" + i2 + "}";
    }
}
