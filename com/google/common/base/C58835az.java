package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.az */
/* compiled from: PG */
public final class C58835az implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;

    /* renamed from: a */
    public final Object f156631a;

    /* renamed from: b */
    public final Object f156632b;

    public C58835az(Object obj, Object obj2) {
        this.f156631a = obj;
        this.f156632b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58835az) {
            C58835az azVar = (C58835az) obj;
            if (!C58832aw.m90831a(this.f156631a, azVar.f156631a) || !C58832aw.m90831a(this.f156632b, azVar.f156632b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return "(" + this.f156631a + ", " + this.f156632b + ")";
    }

    public final int hashCode() {
        int i;
        Object obj = this.f156631a;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        Object obj2 = this.f156632b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return (i * 31) + i2;
    }
}
