package com.google.p5238v.p5239a.p5250f;

import p3186j$.util.Objects;

/* renamed from: com.google.v.a.f.z */
/* compiled from: PG */
final class C67619z {

    /* renamed from: a */
    private final Class f183564a;

    /* renamed from: b */
    private final Class f183565b;

    public C67619z(Class cls, Class cls2) {
        this.f183564a = cls;
        this.f183565b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67619z)) {
            return false;
        }
        C67619z zVar = (C67619z) obj;
        if (!zVar.f183564a.equals(this.f183564a) || !zVar.f183565b.equals(this.f183565b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f183564a, this.f183565b);
    }

    public final String toString() {
        String simpleName = this.f183564a.getSimpleName();
        String simpleName2 = this.f183565b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
