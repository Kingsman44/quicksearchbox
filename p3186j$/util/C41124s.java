package p3186j$.util;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;

/* renamed from: j$.util.s */
final class C41124s extends C41114i implements Serializable {

    /* renamed from: c */
    static Set f107707c = new C41124s(new Object[0]);

    /* renamed from: a */
    final Object[] f107708a;

    /* renamed from: b */
    final int f107709b;

    static {
        if (f107707c == null) {
        }
    }

    C41124s(Object... objArr) {
        this.f107709b = objArr.length;
        this.f107708a = new Object[(objArr.length * 2)];
        int i = 0;
        while (i < objArr.length) {
            Object obj = objArr[i];
            int a = m71736a(obj);
            if (a < 0) {
                this.f107708a[-(a + 1)] = obj;
                i++;
            } else {
                throw new IllegalArgumentException("duplicate element: ".concat(String.valueOf(obj)));
            }
        }
    }

    /* renamed from: a */
    private int m71736a(Object obj) {
        int hashCode = obj.hashCode();
        Object[] objArr = this.f107708a;
        int d = C40947a.m71100d(hashCode, objArr.length);
        while (true) {
            Object obj2 = objArr[d];
            if (obj2 == null) {
                return (-d) - 1;
            }
            if (obj.equals(obj2)) {
                return d;
            }
            d++;
            if (d == objArr.length) {
                d = 0;
            }
        }
    }

    public final boolean contains(Object obj) {
        Objects.requireNonNull(obj);
        return this.f107709b > 0 && m71736a(obj) >= 0;
    }

    public final int hashCode() {
        int i = 0;
        for (Object obj : this.f107708a) {
            if (obj != null) {
                i = obj.hashCode() + i;
            }
        }
        return i;
    }

    public final Iterator iterator() {
        return new C41120o(this);
    }

    public final int size() {
        return this.f107709b;
    }
}
