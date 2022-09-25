package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.b.hd */
/* compiled from: PG */
public abstract class C58495hd implements Map, Serializable, p3186j$.util.Map {

    /* renamed from: a */
    private transient C58528ij f156129a;

    /* renamed from: b */
    private transient C58528ij f156130b;

    /* renamed from: c */
    private transient C58471gg f156131c;

    /* renamed from: i */
    public static C58490gz m89895i() {
        return new C58490gz(4);
    }

    /* renamed from: j */
    public static C58490gz m89896j(int i) {
        C58371co.m89408c(i, "expectedSize");
        return new C58490gz(i);
    }

    /* renamed from: k */
    public static C58495hd m89897k(Iterable iterable) {
        C58490gz gzVar = new C58490gz(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        gzVar.mo55432k(iterable);
        return gzVar.mo55427f(true);
    }

    /* renamed from: l */
    public static C58495hd m89898l(Map map) {
        if ((map instanceof C58495hd) && !(map instanceof SortedMap)) {
            C58495hd hdVar = (C58495hd) map;
            if (!hdVar.mo55193c()) {
                return hdVar;
            }
        }
        return m89897k(map.entrySet());
    }

    /* renamed from: m */
    public static C58495hd m89899m() {
        return C58729pv.f156485a;
    }

    /* renamed from: n */
    public static C58495hd m89900n(Object obj, Object obj2) {
        C58371co.m89406a(obj, obj2);
        return C58729pv.m90559b(1, new Object[]{obj, obj2}, (C58490gz) null);
    }

    /* renamed from: o */
    public static C58495hd m89901o(Object obj, Object obj2, Object obj3, Object obj4) {
        C58371co.m89406a(obj, obj2);
        C58371co.m89406a(obj3, obj4);
        return C58729pv.m90559b(2, new Object[]{obj, obj2, obj3, obj4}, (C58490gz) null);
    }

    /* renamed from: p */
    public static C58495hd m89902p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C58371co.m89406a(obj, obj2);
        C58371co.m89406a(obj3, obj4);
        C58371co.m89406a(obj5, obj6);
        return C58729pv.m90559b(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, (C58490gz) null);
    }

    /* renamed from: q */
    public static C58495hd m89903q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        C58371co.m89406a(obj, obj2);
        C58371co.m89406a(obj3, obj4);
        C58371co.m89406a(obj5, obj6);
        C58371co.m89406a(obj7, obj8);
        return C58729pv.m90559b(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, (C58490gz) null);
    }

    /* renamed from: r */
    public static C58495hd m89904r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        C58371co.m89406a(obj, obj2);
        C58371co.m89406a(obj3, obj4);
        C58371co.m89406a(obj5, obj6);
        C58371co.m89406a(obj7, obj8);
        C58371co.m89406a(obj9, obj10);
        return C58729pv.m90559b(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, (C58490gz) null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: s */
    public static C58495hd m89905s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        C58371co.m89406a(obj, obj2);
        C58371co.m89406a(obj3, obj4);
        C58371co.m89406a(obj5, obj6);
        C58371co.m89406a(obj7, obj8);
        C58371co.m89406a(obj9, obj10);
        C58371co.m89406a(obj11, obj12);
        return C58729pv.m90559b(6, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12}, (C58490gz) null);
    }

    /* renamed from: t */
    public static C58495hd m89906t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        C58371co.m89406a(obj, obj2);
        C58371co.m89406a(obj3, obj4);
        C58371co.m89406a(obj5, obj6);
        C58371co.m89406a(obj7, obj8);
        C58371co.m89406a(obj9, obj10);
        C58371co.m89406a(obj11, obj12);
        C58371co.m89406a(obj13, obj14);
        return C58729pv.m90559b(7, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14}, (C58490gz) null);
    }

    /* renamed from: u */
    public static C58495hd m89907u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        C58371co.m89406a(obj, obj2);
        C58371co.m89406a(obj3, obj4);
        C58371co.m89406a(obj5, obj6);
        C58371co.m89406a(obj7, obj8);
        C58371co.m89406a(obj9, obj10);
        C58371co.m89406a(obj11, obj12);
        C58371co.m89406a(obj13, obj14);
        C58371co.m89406a(obj15, obj16);
        return C58729pv.m90559b(8, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16}, (C58490gz) null);
    }

    /* renamed from: c */
    public abstract boolean mo55193c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
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

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract C58528ij mo55194d();

    public boolean equals(Object obj) {
        return C58662ni.m90356o(this, obj);
    }

    /* renamed from: f */
    public abstract C58471gg mo55368f();

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    /* renamed from: g */
    public C58471gg values() {
        C58471gg ggVar = this.f156131c;
        if (ggVar != null) {
            return ggVar;
        }
        C58471gg f = mo55368f();
        this.f156131c = f;
        return f;
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return C58758qx.m90643a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: lB */
    public C58800sl mo55388lB() {
        return new C58488gx(entrySet().iterator());
    }

    /* renamed from: lE */
    public abstract C58528ij mo55439lE();

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
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

    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
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

    public final String toString() {
        return C58662ni.m90350i(this);
    }

    /* renamed from: v */
    public final C58528ij entrySet() {
        C58528ij ijVar = this.f156129a;
        if (ijVar != null) {
            return ijVar;
        }
        C58528ij lE = mo55439lE();
        this.f156129a = lE;
        return lE;
    }

    /* renamed from: w */
    public C58528ij keySet() {
        C58528ij ijVar = this.f156130b;
        if (ijVar != null) {
            return ijVar;
        }
        C58528ij d = mo55194d();
        this.f156130b = d;
        return d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58494hc(this);
    }
}
