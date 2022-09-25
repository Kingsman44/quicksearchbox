package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.common.b.dk */
/* compiled from: PG */
public final class C58394dk extends C58710pc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator[] f155992a;

    public C58394dk(Iterable iterable) {
        this.f155992a = (Comparator[]) C58557jl.m90143x(iterable, new Comparator[0]);
    }

    public C58394dk(Comparator comparator, Comparator comparator2) {
        this.f155992a = new Comparator[]{comparator, comparator2};
    }

    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f155992a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58394dk) {
            return Arrays.equals(this.f155992a, ((C58394dk) obj).f155992a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f155992a);
    }

    public final String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f155992a) + ")";
    }
}
