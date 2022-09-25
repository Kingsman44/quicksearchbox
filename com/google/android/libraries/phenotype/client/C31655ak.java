package com.google.android.libraries.phenotype.client;

import com.google.common.p4522b.C58439fb;
import p3186j$.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.phenotype.client.ak */
/* compiled from: PG */
public final class C31655ak extends C58439fb implements Map {

    /* renamed from: a */
    public final java.util.Map f85157a;

    private C31655ak(java.util.Map map) {
        this.f85157a = map;
    }

    /* renamed from: c */
    public static C31655ak m58992c() {
        return new C31655ak(new ConcurrentHashMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final java.util.Map mo5942b() {
        return this.f85157a;
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f85157a;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        return ((ConcurrentHashMap) this.f85157a).putIfAbsent(obj, obj2);
    }

    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }
}
