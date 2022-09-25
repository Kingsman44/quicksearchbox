package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.bg */
/* compiled from: PG */
public final class C58843bg implements Serializable, C58839bc {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58839bc f156639a;

    public C58843bg(C58839bc bcVar) {
        bcVar.getClass();
        this.f156639a = bcVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        return !this.f156639a.mo5941a(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58843bg) {
            return this.f156639a.equals(((C58843bg) obj).f156639a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156639a.hashCode() ^ -1;
    }

    public final String toString() {
        return "Predicates.not(" + this.f156639a + ")";
    }
}
