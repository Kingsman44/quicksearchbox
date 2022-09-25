package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.b.jy */
/* compiled from: PG */
public final class C58570jy {
    /* renamed from: b */
    public static int m90150b(Iterator it, C58839bc bcVar) {
        C58838bb.m90866a(bcVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (bcVar.mo5941a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: g */
    public static Object m90155g(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: h */
    public static Object m90156h(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    /* renamed from: i */
    static Object m90157i(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0007  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90165q(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.C58832aw.m90831a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L_0x0025
            r3 = 1
            return r3
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58570jy.m90165q(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: u */
    public static C58801sm m90169u(Object[] objArr, int i) {
        C58838bb.m90882q(0, i, objArr.length);
        C58838bb.m90864E(0, i);
        if (i == 0) {
            return C58566ju.f156231a;
        }
        return new C58566ju(objArr, i);
    }

    /* renamed from: v */
    public static C58800sl m90170v(Iterator it, int i) {
        it.getClass();
        return new C58561jp(it, i);
    }

    /* renamed from: d */
    public static C58800sl m90152d(Iterator it, C58839bc bcVar) {
        it.getClass();
        bcVar.getClass();
        return new C58562jq(it, bcVar);
    }

    /* renamed from: k */
    public static Iterator m90159k(Iterable iterable) {
        iterable.getClass();
        return new C58559jn(iterable);
    }

    /* renamed from: l */
    public static Iterator m90160l(Iterator it, int i) {
        it.getClass();
        C58838bb.m90869d(i >= 0, "limit is negative");
        return new C58564js(i, it);
    }

    /* renamed from: m */
    public static Iterator m90161m(Iterator it, C58817ah ahVar) {
        ahVar.getClass();
        return new C58563jr(it, ahVar);
    }

    /* renamed from: e */
    public static C58800sl m90153e(Iterator it) {
        it.getClass();
        if (it instanceof C58800sl) {
            return (C58800sl) it;
        }
        return new C58558jm(it);
    }

    /* renamed from: j */
    public static Iterator m90158j(Iterator it, Iterator it2) {
        it.getClass();
        it2.getClass();
        return new C58567jv(new C58560jo(new Iterator[]{it, it2}));
    }

    /* renamed from: p */
    public static boolean m90164p(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m90149a(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        C58838bb.m90869d(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* renamed from: n */
    static void m90162n(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: o */
    public static boolean m90163o(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: r */
    public static boolean m90166r(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public static boolean m90167s(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: w */
    public static void m90171w(Iterator it, C58839bc bcVar) {
        bcVar.getClass();
        while (it.hasNext()) {
            if (bcVar.mo5941a(it.next())) {
                it.remove();
            }
        }
    }

    /* renamed from: t */
    public static Object m90168t(Iterator it, C58839bc bcVar) {
        it.getClass();
        bcVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (bcVar.mo5941a(next)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C58833ax m90151c(Iterator it, C58839bc bcVar) {
        it.getClass();
        bcVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (bcVar.mo5941a(next)) {
                return C58833ax.m90834k(next);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: f */
    public static Object m90154f(Iterator it, C58839bc bcVar) {
        it.getClass();
        bcVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (bcVar.mo5941a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }
}
