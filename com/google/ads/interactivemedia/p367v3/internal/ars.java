package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ars */
/* compiled from: PG */
public abstract class ars implements Map, Serializable, p3186j$.util.Map {

    /* renamed from: a */
    private transient arx f21461a;

    /* renamed from: b */
    private transient arx f21462b;

    /* renamed from: c */
    private transient arj f21463c;

    /* renamed from: a */
    public static ars m19427a() {
        return asi.f21488a;
    }

    /* renamed from: b */
    public static ars m19428b(Object obj, Object obj2) {
        ary.m19459l(obj, obj2);
        return asi.m19496k(1, new Object[]{obj, obj2});
    }

    /* renamed from: c */
    public static arq m19429c() {
        return new arq();
    }

    /* renamed from: d */
    public static ars m19430d(Map map) {
        if ((map instanceof ars) && !(map instanceof SortedMap)) {
            ars ars = (ars) map;
            if (!ars.mo15325j()) {
                return ars;
            }
        }
        Set entrySet = map.entrySet();
        arq arq = new arq(entrySet instanceof Collection ? entrySet.size() : 4);
        arq.mo15312c(entrySet);
        return arq.mo15310a();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    public final arx entrySet() {
        arx arx = this.f21461a;
        if (arx != null) {
            return arx;
        }
        arx f = mo15318f();
        this.f21461a = f;
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return entrySet().equals(((java.util.Map) obj).entrySet());
    }

    /* renamed from: f */
    public abstract arx mo15318f();

    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    /* renamed from: g */
    public abstract arx mo15319g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public final arj values() {
        arj arj = this.f21463c;
        if (arj != null) {
            return arj;
        }
        arj i = mo15323i();
        this.f21463c = i;
        return i;
    }

    public final int hashCode() {
        return asn.m19514a(entrySet());
    }

    /* renamed from: i */
    public abstract arj mo15323i();

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public abstract boolean mo15325j();

    public final /* bridge */ /* synthetic */ Set keySet() {
        arx arx = this.f21462b;
        if (arx != null) {
            return arx;
        }
        arx g = mo15319g();
        this.f21462b = g;
        return g;
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        ary.m19461n(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new arr(this);
    }
}
