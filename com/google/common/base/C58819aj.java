package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.aj */
/* compiled from: PG */
public final class C58819aj implements Serializable, C58817ah {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Object f156610a;

    public C58819aj(Object obj) {
        this.f156610a = obj;
    }

    public final Object apply(Object obj) {
        return this.f156610a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58819aj) {
            return C58832aw.m90831a(this.f156610a, ((C58819aj) obj).f156610a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f156610a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + this.f156610a + ")";
    }
}
