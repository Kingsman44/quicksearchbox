package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.ae */
/* compiled from: PG */
public final class C58814ae implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C58815af f156606a;

    /* renamed from: b */
    private final Object f156607b;

    public C58814ae(C58815af afVar, Object obj) {
        this.f156606a = afVar;
        this.f156607b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C58814ae)) {
            return false;
        }
        C58814ae aeVar = (C58814ae) obj;
        if (this.f156606a.equals(aeVar.f156606a)) {
            return this.f156606a.mo56077d(this.f156607b, aeVar.f156607b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156606a.mo56076c(this.f156607b);
    }

    public final String toString() {
        return this.f156606a + ".wrap(" + this.f156607b + ")";
    }
}
