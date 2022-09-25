package com.bumptech.glide.load.p293a.p294a;

/* renamed from: com.bumptech.glide.load.a.a.j */
/* compiled from: PG */
final class C5648j implements C5653o {

    /* renamed from: a */
    int f17018a;

    /* renamed from: b */
    public Class f17019b;

    /* renamed from: c */
    private final C5649k f17020c;

    public C5648j(C5649k kVar) {
        this.f17020c = kVar;
    }

    /* renamed from: a */
    public final void mo12124a() {
        this.f17020c.mo12112c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5648j) {
            C5648j jVar = (C5648j) obj;
            if (this.f17018a == jVar.f17018a && this.f17019b == jVar.f17019b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17018a * 31;
        Class cls = this.f17019b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f17018a;
        String valueOf = String.valueOf(this.f17019b);
        return "Key{size=" + i + "array=" + valueOf + "}";
    }
}
