package com.google.protobuf.p4746a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.protobuf.a.c */
/* compiled from: PG */
public final class C62884c implements Map, p3186j$.util.Map, C69640a {

    /* renamed from: a */
    private final Map f169784a;

    public C62884c(Map map) {
        C69664n.m101061g(map, "delegate");
        this.f169784a = map;
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

    public final boolean containsKey(Object obj) {
        return this.f169784a.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f169784a.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return new C62890i(this.f169784a.entrySet());
    }

    public final boolean equals(Object obj) {
        return C69664n.m101066l(this.f169784a, obj);
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final Object get(Object obj) {
        return this.f169784a.get(obj);
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final int hashCode() {
        return this.f169784a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f169784a.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return new C62892k(this.f169784a.keySet());
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
        return this.f169784a.size();
    }

    public final String toString() {
        return this.f169784a.toString();
    }

    public final /* bridge */ Collection values() {
        return new C62886e(this.f169784a.values());
    }
}
