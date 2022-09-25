package p3186j$.util;

import java.util.Map;

/* renamed from: j$.util.v */
final class C41330v implements Map.Entry {

    /* renamed from: a */
    final Object f108057a;

    /* renamed from: b */
    final Object f108058b;

    C41330v(Object obj, Object obj2) {
        this.f108057a = Objects.requireNonNull(obj);
        this.f108058b = Objects.requireNonNull(obj2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f108057a.equals(entry.getKey()) && this.f108058b.equals(entry.getValue());
    }

    public final Object getKey() {
        return this.f108057a;
    }

    public final Object getValue() {
        return this.f108058b;
    }

    public final int hashCode() {
        return this.f108057a.hashCode() ^ this.f108058b.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("not supported");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f108057a);
        String valueOf2 = String.valueOf(this.f108058b);
        return valueOf + "=" + valueOf2;
    }
}
