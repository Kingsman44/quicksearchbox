package com.google.common.p4522b;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentMap;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.b.ew */
/* compiled from: PG */
public abstract class C58433ew extends C58439fb implements ConcurrentMap, p3186j$.util.concurrent.ConcurrentMap {
    protected C58433ew() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Map mo5942b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract ConcurrentMap mo55254c();

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        return mo55254c().putIfAbsent(obj, obj2);
    }

    public final boolean remove(Object obj, Object obj2) {
        return mo55254c().remove(obj, obj2);
    }

    public final Object replace(Object obj, Object obj2) {
        return mo55254c().replace(obj, obj2);
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return mo55254c().replace(obj, obj2, obj3);
    }
}
