package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.google.common.b.jz */
/* compiled from: PG */
public final class C58571jz extends C58710pc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator f156242a;

    public C58571jz(Comparator comparator) {
        this.f156242a = comparator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj2).iterator();
        for (Object compare : (Iterable) obj) {
            if (!it.hasNext()) {
                return 1;
            }
            int compare2 = this.f156242a.compare(compare, it.next());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return it.hasNext() ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58571jz) {
            return this.f156242a.equals(((C58571jz) obj).f156242a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156242a.hashCode() ^ 2075626741;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Comparator comparator = this.f156242a;
        sb.append(comparator);
        return comparator.toString().concat(".lexicographical()");
    }
}
