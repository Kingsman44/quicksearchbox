package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.bf */
/* compiled from: PG */
final class C58842bf implements Serializable, C58839bc {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f156638a;

    public C58842bf(Object obj) {
        this.f156638a = obj;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        return this.f156638a.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58842bf) {
            return this.f156638a.equals(((C58842bf) obj).f156638a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156638a.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + this.f156638a + ")";
    }
}
