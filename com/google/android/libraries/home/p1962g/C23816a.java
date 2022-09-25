package com.google.android.libraries.home.p1962g;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.android.libraries.home.g.a */
/* compiled from: PG */
public class C23816a implements Map, p3186j$.util.Map, C69640a {

    /* renamed from: a */
    private final /* synthetic */ Map f65233a;

    public C23816a(C69626l lVar, Object[] objArr) {
        C69664n.m101061g(objArr, "values");
        int b = C69505av.m100860b(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b < 16 ? 16 : b);
        for (Object obj : objArr) {
            linkedHashMap.put(lVar.mo5761a(obj), obj);
        }
        this.f65233a = linkedHashMap;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return this.f65233a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f65233a.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.f65233a.entrySet();
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public Object get(Object obj) {
        return this.f65233a.get(obj);
    }

    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final boolean isEmpty() {
        return this.f65233a.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.f65233a.keySet();
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.f65233a.size();
    }

    public final /* bridge */ Collection values() {
        return this.f65233a.values();
    }
}
