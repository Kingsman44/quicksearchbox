package p3186j$.util;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: j$.util.r */
final class C41123r extends C41114i implements Serializable {

    /* renamed from: a */
    final Object f107705a;

    /* renamed from: b */
    final Object f107706b;

    C41123r(Object obj) {
        this.f107705a = Objects.requireNonNull(obj);
        this.f107706b = null;
    }

    C41123r(Object obj, Object obj2) {
        if (!obj.equals(Objects.requireNonNull(obj2))) {
            this.f107705a = obj;
            this.f107706b = obj2;
            return;
        }
        throw new IllegalArgumentException("duplicate element: ".concat(String.valueOf(obj)));
    }

    public final boolean contains(Object obj) {
        return obj.equals(this.f107705a) || obj.equals(this.f107706b);
    }

    public final int hashCode() {
        int hashCode = this.f107705a.hashCode();
        Object obj = this.f107706b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final Iterator iterator() {
        return new C41122q(this);
    }

    public final int size() {
        return this.f107706b == null ? 1 : 2;
    }
}
