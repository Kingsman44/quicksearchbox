package com.google.common.p4536h;

import java.util.Arrays;

/* renamed from: com.google.common.h.q */
/* compiled from: PG */
final class C59260q extends C59262s {
    public C59260q(Object obj, Object obj2) {
        super(obj, obj2);
    }

    /* renamed from: a */
    public final Object mo56723a() {
        return this.f157372a;
    }

    /* renamed from: b */
    public final Object mo56724b() {
        return this.f157373b;
    }

    /* renamed from: c */
    public final boolean mo56725c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59262s)) {
            return false;
        }
        C59262s sVar = (C59262s) obj;
        return sVar.mo56725c() && this.f157372a.equals(sVar.mo56723a()) && this.f157373b.equals(sVar.mo56724b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f157372a, this.f157373b});
    }

    public final String toString() {
        return "<" + this.f157372a + " -> " + this.f157373b + ">";
    }
}
