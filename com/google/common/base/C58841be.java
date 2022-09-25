package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.be */
/* compiled from: PG */
public final class C58841be implements Serializable, C58839bc {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58839bc f156636a;

    /* renamed from: b */
    final C58817ah f156637b;

    public C58841be(C58839bc bcVar, C58817ah ahVar) {
        this.f156636a = bcVar;
        ahVar.getClass();
        this.f156637b = ahVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        return this.f156636a.mo5941a(this.f156637b.apply(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58841be) {
            C58841be beVar = (C58841be) obj;
            if (!this.f156637b.equals(beVar.f156637b) || !this.f156636a.equals(beVar.f156636a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f156637b.hashCode() ^ this.f156636a.hashCode();
    }

    public final String toString() {
        return this.f156636a + "(" + this.f156637b + ")";
    }
}
