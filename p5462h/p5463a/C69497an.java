package p5462h.p5463a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.an */
/* compiled from: PG */
public final class C69497an implements Map, Serializable, C69640a {

    /* renamed from: a */
    public static final C69497an f185919a = new C69497an();
    private static final long serialVersionUID = 8246714829545688274L;

    private C69497an() {
    }

    private final Object readResolve() {
        return f185919a;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C69664n.m101061g((Void) obj, "value");
        return false;
    }

    public final Set entrySet() {
        return C69498ao.f185920a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Set keySet() {
        return C69498ao.f185920a;
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    public final Collection values() {
        return C69496am.f185918a;
    }
}
