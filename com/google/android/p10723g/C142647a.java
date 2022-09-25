package com.google.android.p10723g;

/* renamed from: com.google.android.g.a */
/* compiled from: PG */
public final class C142647a extends C142653c {

    /* renamed from: a */
    public final Integer f387082a;

    /* renamed from: b */
    public final Object f387083b;

    /* renamed from: c */
    public final int f387084c;

    public C142647a(Integer num, Object obj, int i) {
        this.f387082a = num;
        if (obj != null) {
            this.f387083b = obj;
            this.f387084c = i;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: a */
    public final Integer mo117426a() {
        return this.f387082a;
    }

    /* renamed from: b */
    public final Object mo117427b() {
        return this.f387083b;
    }

    /* renamed from: c */
    public final int mo117428c() {
        return this.f387084c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C142653c) {
            C142653c cVar = (C142653c) obj;
            Integer num = this.f387082a;
            if (num != null ? num.equals(cVar.mo117426a()) : cVar.mo117426a() == null) {
                return this.f387083b.equals(cVar.mo117427b()) && this.f387084c == cVar.mo117428c();
            }
        }
    }

    public final String toString() {
        Integer num = this.f387082a;
        String obj = this.f387083b.toString();
        String str = this.f387084c != 1 ? "VERY_LOW" : "DEFAULT";
        return "Event{code=" + num + ", payload=" + obj + ", priority=" + str + "}";
    }

    public final int hashCode() {
        int i;
        Integer num = this.f387082a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ this.f387083b.hashCode()) * 1000003) ^ this.f387084c;
    }
}
