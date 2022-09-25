package com.google.android.apps.search.googleapp.p10338l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.C69702k;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.android.apps.search.googleapp.l.h */
/* compiled from: PG */
public final class C136414h implements Map, p3186j$.util.Map, C136417k, C136376a, C69640a {

    /* renamed from: a */
    public final Map f371383a;

    public C136414h(Map map) {
        C69664n.m101061g(map, "children");
        this.f371383a = map;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo112952a() {
        return this;
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
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        C69664n.m101061g(str, "key");
        return this.f371383a.containsKey(str);
    }

    public final /* bridge */ Set entrySet() {
        return this.f371383a.entrySet();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C136414h) && C69664n.m101066l(this.f371383a, ((C136414h) obj).f371383a);
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C69664n.m101061g(str, "key");
        return (C69702k) this.f371383a.get(str);
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final int hashCode() {
        return this.f371383a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f371383a.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.f371383a.keySet();
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
        return this.f371383a.size();
    }

    public final String toString() {
        java.util.Map map = this.f371383a;
        return "MapData(children=" + map + ")";
    }

    public final /* bridge */ Collection values() {
        return this.f371383a.values();
    }
}
