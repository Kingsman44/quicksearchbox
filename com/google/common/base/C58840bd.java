package com.google.common.base;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.common.base.bd */
/* compiled from: PG */
final class C58840bd implements Serializable, C58839bc {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final List f156635a;

    public C58840bd(List list) {
        this.f156635a = list;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        for (int i = 0; i < this.f156635a.size(); i++) {
            if (!((C58839bc) this.f156635a.get(i)).mo5941a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58840bd) {
            return this.f156635a.equals(((C58840bd) obj).f156635a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156635a.hashCode() + 306654252;
    }

    public final String toString() {
        return C58846bj.m90901c("and", this.f156635a);
    }
}
