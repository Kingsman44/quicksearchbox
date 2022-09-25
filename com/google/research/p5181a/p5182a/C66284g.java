package com.google.research.p5181a.p5182a;

/* renamed from: com.google.research.a.a.g */
/* compiled from: PG */
public final class C66284g implements Comparable {

    /* renamed from: a */
    public final int f180262a;

    /* renamed from: b */
    public float f180263b;

    public C66284g(int i) {
        this.f180262a = i;
        this.f180263b = 1.0f;
    }

    public C66284g(int i, float f) {
        this.f180262a = i;
        this.f180263b = f;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new C66284g(this.f180262a, this.f180263b);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.f180263b, ((C66284g) obj).f180263b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C66284g)) {
            return false;
        }
        C66284g gVar = (C66284g) obj;
        if (this.f180262a == gVar.f180262a && this.f180263b == gVar.f180263b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f180262a * 31) + 17 + Float.floatToIntBits(this.f180263b);
    }

    public final String toString() {
        return this.f180262a + "=" + this.f180263b;
    }
}
