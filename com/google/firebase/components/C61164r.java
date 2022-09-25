package com.google.firebase.components;

/* renamed from: com.google.firebase.components.r */
/* compiled from: PG */
final class C61164r {

    /* renamed from: a */
    public final boolean f165503a;

    /* renamed from: b */
    private final Class f165504b;

    public C61164r(Class cls, boolean z) {
        this.f165504b = cls;
        this.f165503a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C61164r) {
            C61164r rVar = (C61164r) obj;
            if (!rVar.f165504b.equals(this.f165504b) || rVar.f165503a != this.f165503a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f165504b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f165503a).hashCode();
    }
}
