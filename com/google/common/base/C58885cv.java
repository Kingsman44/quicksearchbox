package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.common.base.cv */
/* compiled from: PG */
public final class C58885cv implements Serializable, C58881cr {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Object f156729a;

    public C58885cv(Object obj) {
        this.f156729a = obj;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        return this.f156729a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58885cv) {
            return C58832aw.m90831a(this.f156729a, ((C58885cv) obj).f156729a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f156729a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f156729a + ")";
    }
}
