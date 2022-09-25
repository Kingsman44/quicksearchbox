package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.common.b.df */
/* compiled from: PG */
final class C58389df extends C58710pc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator f155987a;

    public C58389df(Comparator comparator) {
        comparator.getClass();
        this.f155987a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f155987a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58389df) {
            return this.f155987a.equals(((C58389df) obj).f155987a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f155987a.hashCode();
    }

    public final String toString() {
        return this.f155987a.toString();
    }
}
