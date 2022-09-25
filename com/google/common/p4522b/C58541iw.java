package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: com.google.common.b.iw */
/* compiled from: PG */
public abstract class C58541iw extends C58542ix implements NavigableSet, C58762ra {

    /* renamed from: b */
    final transient Comparator f156195b;

    /* renamed from: d */
    transient C58541iw f156196d;

    public C58541iw(Comparator comparator) {
        this.f156195b = comparator;
    }

    /* renamed from: Q */
    public static C58539iu m90066Q() {
        return new C58539iu(C58701ou.f156429a);
    }

    /* renamed from: R */
    static C58541iw m90067R(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return m90070U(comparator);
        }
        C58704ox.m90451d(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new C58735qa(C58485gu.m89840h(objArr, i2), comparator);
    }

    /* renamed from: T */
    public static C58541iw m90069T(SortedSet sortedSet) {
        Comparator a = C58763rb.m90668a(sortedSet);
        C58485gu j = C58485gu.m89842j(sortedSet);
        if (j.isEmpty()) {
            return m90070U(a);
        }
        return new C58735qa(j, a);
    }

    /* renamed from: U */
    static C58735qa m90070U(Comparator comparator) {
        if (C58701ou.f156429a.equals(comparator)) {
            return C58735qa.f156506a;
        }
        return new C58735qa(C58485gu.m89845m(), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public Object ceiling(Object obj) {
        return C58557jl.m90130k(tailSet(obj, true), (Object) null);
    }

    public final Comparator comparator() {
        return this.f156195b;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return C58570jy.m90156h(headSet(obj, true).descendingIterator(), (Object) null);
    }

    public Object higher(Object obj) {
        return C58557jl.m90130k(tailSet(obj, false), (Object) null);
    }

    /* renamed from: j */
    public abstract C58541iw mo55159j();

    /* renamed from: k */
    public C58541iw headSet(Object obj) {
        return headSet(obj, false);
    }

    /* renamed from: lA */
    public abstract C58800sl iterator();

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return C58570jy.m90156h(headSet(obj, false).descendingIterator(), (Object) null);
    }

    /* renamed from: ly */
    public C58541iw descendingSet() {
        C58541iw iwVar = this.f156196d;
        if (iwVar != null) {
            return iwVar;
        }
        C58541iw j = mo55159j();
        this.f156196d = j;
        j.f156196d = this;
        return j;
    }

    /* renamed from: lz */
    public abstract C58800sl descendingIterator();

    /* renamed from: m */
    public abstract C58541iw mo55162m(Object obj, boolean z);

    /* renamed from: n */
    public C58541iw subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    /* renamed from: p */
    public abstract C58541iw mo55165p(Object obj, boolean z, Object obj2, boolean z2);

    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public C58541iw tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* renamed from: s */
    public abstract C58541iw mo55168s(Object obj, boolean z);

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58540iv(this.f156195b, toArray(C58471gg.f156097c));
    }

    /* renamed from: l */
    public C58541iw headSet(Object obj, boolean z) {
        obj.getClass();
        return mo55162m(obj, z);
    }

    /* renamed from: r */
    public C58541iw tailSet(Object obj, boolean z) {
        obj.getClass();
        return mo55168s(obj, z);
    }

    /* renamed from: o */
    public C58541iw subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C58838bb.m90868c(this.f156195b.compare(obj, obj2) <= 0);
        return mo55165p(obj, z, obj2, z2);
    }

    /* renamed from: S */
    public static C58541iw m90068S(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        if (C58763rb.m90669b(comparator, iterable) && (iterable instanceof C58541iw)) {
            C58541iw iwVar = (C58541iw) iterable;
            if (!iwVar.mo55032a()) {
                return iwVar;
            }
        }
        Object[] v = C58557jl.m90141v(iterable);
        return m90067R(comparator, v.length, v);
    }
}
