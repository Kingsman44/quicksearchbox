package com.google.common.base;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.common.base.bi */
/* compiled from: PG */
public final class C58845bi implements Serializable, C58839bc {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final List f156645a;

    public C58845bi(List list) {
        this.f156645a = list;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        for (int i = 0; i < this.f156645a.size(); i++) {
            if (((C58839bc) this.f156645a.get(i)).mo5941a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58845bi) {
            return this.f156645a.equals(((C58845bi) obj).f156645a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156645a.hashCode() + 87855567;
    }

    public final String toString() {
        return C58846bj.m90901c("or", this.f156645a);
    }
}
