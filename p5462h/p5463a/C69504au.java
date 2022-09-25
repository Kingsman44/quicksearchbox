package p5462h.p5463a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.au */
/* compiled from: PG */
final class C69504au implements Map, C69640a {

    /* renamed from: a */
    public final Map f185926a;

    /* renamed from: b */
    public final C69626l f185927b;

    public C69504au(Map map, C69626l lVar) {
        C69664n.m101061g(map, "map");
        this.f185926a = map;
        this.f185927b = lVar;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return this.f185926a.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f185926a.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.f185926a.entrySet();
    }

    public final boolean equals(Object obj) {
        return this.f185926a.equals(obj);
    }

    public final Object get(Object obj) {
        return this.f185926a.get(obj);
    }

    public final int hashCode() {
        return this.f185926a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f185926a.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.f185926a.keySet();
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.f185926a.size();
    }

    public final String toString() {
        return this.f185926a.toString();
    }

    public final /* bridge */ Collection values() {
        return this.f185926a.values();
    }
}
