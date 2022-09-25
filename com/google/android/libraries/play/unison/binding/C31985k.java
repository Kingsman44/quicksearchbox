package com.google.android.libraries.play.unison.binding;

import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.k */
/* compiled from: PG */
public final class C31985k extends LinkedHashMap implements Map {

    /* renamed from: a */
    final /* synthetic */ BindableStateStore f85984a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31985k(BindableStateStore bindableStateStore) {
        super(0, 0.75f, true);
        this.f85984a = bindableStateStore;
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final boolean containsValue(Object obj) {
        if (obj != null && !(obj instanceof Parcelable)) {
            return false;
        }
        return super.containsValue((Parcelable) obj);
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    public final boolean remove(Object obj, Object obj2) {
        if (obj2 != null && !(obj2 instanceof Parcelable)) {
            return false;
        }
        return Map.CC.$default$remove(this, obj, (Parcelable) obj2);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        C69664n.m101061g(entry, "eldest");
        return super.size() > this.f85984a.f85924a;
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

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }
}
