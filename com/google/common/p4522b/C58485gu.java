package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.b.gu */
/* compiled from: PG */
public abstract class C58485gu extends C58471gg implements List, RandomAccess {

    /* renamed from: a */
    private static final C58801sm f156115a = new C58481gq(C58724pq.f156472a, 0);

    /* renamed from: A */
    public static C58485gu m89831A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        C58704ox.m90451d(objArr, 9);
        return m89840h(objArr, 9);
    }

    /* renamed from: B */
    public static C58485gu m89832B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10};
        C58704ox.m90451d(objArr, 10);
        return m89840h(objArr, 10);
    }

    /* renamed from: C */
    public static C58485gu m89833C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11};
        C58704ox.m90451d(objArr, 11);
        return m89840h(objArr, 11);
    }

    @SafeVarargs
    /* renamed from: D */
    public static C58485gu m89834D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object[] objArr2 = objArr;
        int length = objArr2.length;
        int i = length + 12;
        Object[] objArr3 = new Object[i];
        objArr3[0] = obj;
        objArr3[1] = obj2;
        objArr3[2] = obj3;
        objArr3[3] = obj4;
        objArr3[4] = obj5;
        objArr3[5] = obj6;
        objArr3[6] = obj7;
        objArr3[7] = obj8;
        objArr3[8] = obj9;
        objArr3[9] = obj10;
        objArr3[10] = obj11;
        objArr3[11] = obj12;
        System.arraycopy(objArr2, 0, objArr3, 12, length);
        C58704ox.m90451d(objArr3, i);
        return m89840h(objArr3, i);
    }

    /* renamed from: E */
    public static C58485gu m89835E(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) C58557jl.m90143x(iterable, new Comparable[0]);
        Object[] objArr = (Object[]) comparableArr;
        C58704ox.m90451d(objArr, objArr.length);
        Arrays.sort(comparableArr);
        return m89840h(comparableArr, comparableArr.length);
    }

    /* renamed from: e */
    public static C58480gp m89837e() {
        return new C58480gp(4);
    }

    /* renamed from: f */
    public static C58480gp m89838f(int i) {
        C58371co.m89408c(i, "expectedSize");
        return new C58480gp(i);
    }

    /* renamed from: g */
    static C58485gu m89839g(Object[] objArr) {
        return m89840h(objArr, objArr.length);
    }

    /* renamed from: h */
    static C58485gu m89840h(Object[] objArr, int i) {
        if (i == 0) {
            return C58724pq.f156472a;
        }
        return new C58724pq(objArr, i);
    }

    /* renamed from: j */
    public static C58485gu m89842j(Collection collection) {
        if (collection instanceof C58471gg) {
            C58485gu u = ((C58471gg) collection).mo55229u();
            if (!u.mo55032a()) {
                return u;
            }
            Object[] array = u.toArray(C58471gg.f156097c);
            return m89840h(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C58704ox.m90451d(array2, length);
        return m89840h(array2, length);
    }

    /* renamed from: k */
    public static C58485gu m89843k(Iterator it) {
        if (!it.hasNext()) {
            return C58724pq.f156472a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m89846n(next);
        }
        C58480gp gpVar = new C58480gp(4);
        gpVar.mo55395g(next);
        gpVar.mo55397i(it);
        return gpVar.mo55394f();
    }

    /* renamed from: l */
    public static C58485gu m89844l(Object[] objArr) {
        if (objArr.length == 0) {
            return C58724pq.f156472a;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        C58704ox.m90451d(objArr2, length);
        return m89840h(objArr2, length);
    }

    /* renamed from: m */
    public static C58485gu m89845m() {
        return C58724pq.f156472a;
    }

    /* renamed from: n */
    public static C58485gu m89846n(Object obj) {
        Object[] objArr = {obj};
        C58704ox.m90451d(objArr, 1);
        return m89840h(objArr, 1);
    }

    /* renamed from: o */
    public static C58485gu m89847o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C58704ox.m90451d(objArr, 2);
        return m89840h(objArr, 2);
    }

    /* renamed from: p */
    public static C58485gu m89848p(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        C58704ox.m90451d(objArr, 3);
        return m89840h(objArr, 3);
    }

    /* renamed from: q */
    public static C58485gu m89849q(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = {obj, obj2, obj3, obj4};
        C58704ox.m90451d(objArr, 4);
        return m89840h(objArr, 4);
    }

    /* renamed from: r */
    public static C58485gu m89850r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        C58704ox.m90451d(objArr, 5);
        return m89840h(objArr, 5);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: s */
    public static C58485gu m89851s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        C58704ox.m90451d(objArr, 6);
        return m89840h(objArr, 6);
    }

    /* renamed from: t */
    public static C58485gu m89852t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        C58704ox.m90451d(objArr, 7);
        return m89840h(objArr, 7);
    }

    /* renamed from: v */
    public static C58485gu m89853v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8};
        C58704ox.m90451d(objArr, 8);
        return m89840h(objArr, 8);
    }

    /* renamed from: G */
    public final C58801sm listIterator(int i) {
        C58838bb.m90864E(i, size());
        if (isEmpty()) {
            return f156115a;
        }
        return new C58481gq(this, i);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public C58485gu subList(int i, int i2) {
        C58838bb.m90882q(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C58724pq.f156472a;
        }
        return new C58484gt(this, i, i3);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        return C58597ky.m90218i(this, obj);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return listIterator(0);
    }

    /* renamed from: lD */
    public C58485gu mo55401lD() {
        return size() <= 1 ? this : new C58482gr(this);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: u */
    public final C58485gu mo55229u() {
        return this;
    }

    /* renamed from: w */
    public int mo55383w(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58483gs(toArray(C58471gg.f156097c));
    }

    /* renamed from: i */
    public static C58485gu m89841i(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return m89842j((Collection) iterable);
        }
        return m89843k(iterable.iterator());
    }

    /* renamed from: F */
    public static C58485gu m89836F(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] v = C58557jl.m90141v(iterable);
        int length = v.length;
        C58704ox.m90451d(v, length);
        Arrays.sort(v, comparator);
        return m89840h(v, length);
    }
}
