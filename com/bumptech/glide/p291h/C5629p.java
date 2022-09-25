package com.bumptech.glide.p291h;

/* renamed from: com.bumptech.glide.h.p */
/* compiled from: PG */
public final class C5629p {

    /* renamed from: a */
    private Class f16970a;

    /* renamed from: b */
    private Class f16971b;

    /* renamed from: c */
    private Class f16972c;

    public C5629p() {
    }

    public C5629p(Class cls, Class cls2, Class cls3) {
        mo12088a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public final void mo12088a(Class cls, Class cls2, Class cls3) {
        this.f16970a = cls;
        this.f16971b = cls2;
        this.f16972c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5629p pVar = (C5629p) obj;
        return this.f16970a.equals(pVar.f16970a) && this.f16971b.equals(pVar.f16971b) && C5632s.m14619l(this.f16972c, pVar.f16972c);
    }

    public final int hashCode() {
        int hashCode = ((this.f16970a.hashCode() * 31) + this.f16971b.hashCode()) * 31;
        Class cls = this.f16972c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16970a);
        String valueOf2 = String.valueOf(this.f16971b);
        return "MultiClassKey{first=" + valueOf + ", second=" + valueOf2 + "}";
    }
}
