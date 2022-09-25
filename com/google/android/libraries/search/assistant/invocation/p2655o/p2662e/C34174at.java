package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.at */
/* compiled from: PG */
public final class C34174at implements Map, p3186j$.util.Map, C69640a {

    /* renamed from: a */
    public final Set f90969a;

    /* renamed from: b */
    private final Map f90970b;

    public C34174at(Map map, Set set) {
        C69664n.m101061g(set, "candidates");
        this.f90970b = map;
        this.f90969a = set;
    }

    /* renamed from: a */
    public final int mo39237a() {
        return this.f90970b.size();
    }

    /* renamed from: b */
    public final Set mo39238b() {
        return this.f90970b.entrySet();
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C34043bf)) {
            return false;
        }
        C34043bf bfVar = (C34043bf) obj;
        C69664n.m101061g(bfVar, "key");
        return this.f90970b.containsKey(bfVar);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C34175au)) {
            return false;
        }
        C34175au auVar = (C34175au) obj;
        C69664n.m101061g(auVar, "value");
        return this.f90970b.containsValue(auVar);
    }

    public final /* bridge */ Set entrySet() {
        return mo39238b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34174at)) {
            return false;
        }
        C34174at atVar = (C34174at) obj;
        return C69664n.m101066l(this.f90970b, atVar.f90970b) && C69664n.m101066l(this.f90969a, atVar.f90969a);
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C34043bf)) {
            return null;
        }
        C34043bf bfVar = (C34043bf) obj;
        C69664n.m101061g(bfVar, "key");
        return (C34175au) this.f90970b.get(bfVar);
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final int hashCode() {
        return (this.f90970b.hashCode() * 31) + this.f90969a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f90970b.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.f90970b.keySet();
    }

    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo39237a();
    }

    public final String toString() {
        java.util.Map map = this.f90970b;
        Set set = this.f90969a;
        return "InvocationSourceConnectionRouting(delegate=" + map + ", candidates=" + set + ")";
    }

    public final /* bridge */ Collection values() {
        return this.f90970b.values();
    }
}
