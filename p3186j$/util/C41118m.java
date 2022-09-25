package p3186j$.util;

import java.util.Set;

/* renamed from: j$.util.m */
final class C41118m extends C41113h {

    /* renamed from: a */
    private final Object f107693a;

    /* renamed from: b */
    private final Object f107694b;

    C41118m(Object obj, Object obj2) {
        this.f107693a = Objects.requireNonNull(obj);
        this.f107694b = Objects.requireNonNull(obj2);
    }

    public final boolean containsKey(Object obj) {
        return obj.equals(this.f107693a);
    }

    public final boolean containsValue(Object obj) {
        return obj.equals(this.f107694b);
    }

    public final Set entrySet() {
        return new C41123r(new C41330v(this.f107693a, this.f107694b));
    }

    public final Object get(Object obj) {
        if (obj.equals(this.f107693a)) {
            return this.f107694b;
        }
        return null;
    }

    public final int hashCode() {
        return this.f107693a.hashCode() ^ this.f107694b.hashCode();
    }
}
