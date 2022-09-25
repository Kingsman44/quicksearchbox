package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.p4575r.C60757n;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: com.google.common.b.jl */
/* compiled from: PG */
public final class C58557jl {
    /* renamed from: A */
    private static Object m90116A(List list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: B */
    private static Collection m90117B(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, it);
        return arrayList;
    }

    /* renamed from: C */
    private static void m90118C(List list, C58839bc bcVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (bcVar.mo5941a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    /* renamed from: D */
    private static void m90119D(List list, C58839bc bcVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!bcVar.mo5941a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (UnsupportedOperationException unused) {
                        m90118C(list, bcVar, i, i2);
                        return;
                    } catch (IllegalArgumentException unused2) {
                        m90118C(list, bcVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    /* renamed from: a */
    public static int m90120a(Iterable iterable, C58839bc bcVar) {
        return C58570jy.m90150b(iterable.iterator(), bcVar);
    }

    /* renamed from: b */
    public static int m90121b(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return C60757n.m92748i(j);
    }

    /* renamed from: c */
    public static C58833ax m90122c(Iterable iterable, C58839bc bcVar) {
        return C58570jy.m90151c(iterable.iterator(), bcVar);
    }

    /* renamed from: d */
    public static Iterable m90123d(Iterable iterable) {
        iterable.getClass();
        return new C58550je(iterable);
    }

    /* renamed from: i */
    public static Object m90128i(Iterable iterable, int i) {
        Iterator it = iterable.iterator();
        int a = C58570jy.m90149a(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i + ") must be less than the number of elements that remained (" + a + ")");
    }

    /* renamed from: k */
    public static Object m90130k(Iterable iterable, Object obj) {
        return C58570jy.m90156h(iterable.iterator(), obj);
    }

    /* renamed from: l */
    public static Object m90131l(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return C58570jy.m90155g(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m90116A(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: m */
    public static Object m90132m(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return m90116A((List) iterable);
            }
        }
        Iterator it = iterable.iterator();
        return it.hasNext() ? C58570jy.m90155g(it) : obj;
    }

    /* renamed from: n */
    public static Object m90133n(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: p */
    public static String m90135p(Iterable iterable) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (Object append : iterable) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(append);
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: q */
    public static boolean m90136q(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return C58570jy.m90163o(collection, iterable.iterator());
    }

    /* renamed from: r */
    public static boolean m90137r(Iterable iterable, C58839bc bcVar) {
        bcVar.getClass();
        for (Object a : iterable) {
            if (!bcVar.mo5941a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public static boolean m90138s(Iterable iterable, C58839bc bcVar) {
        return C58570jy.m90150b(iterable.iterator(), bcVar) != -1;
    }

    /* renamed from: t */
    public static boolean m90139t(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return C58374cr.m89412d((Collection) iterable, obj);
        }
        return C58570jy.m90164p(iterable.iterator(), obj);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90140u(java.lang.Iterable r2, java.lang.Iterable r3) {
        /*
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0014
            int r0 = r2.size()
            int r1 = r3.size()
            if (r0 == r1) goto L_0x0014
            r2 = 0
            return r2
        L_0x0014:
            java.util.Iterator r2 = r2.iterator()
            java.util.Iterator r3 = r3.iterator()
            boolean r2 = com.google.common.p4522b.C58570jy.m90165q(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58557jl.m90140u(java.lang.Iterable, java.lang.Iterable):boolean");
    }

    /* renamed from: v */
    static Object[] m90141v(Iterable iterable) {
        return m90117B(iterable).toArray();
    }

    /* renamed from: w */
    public static Object[] m90142w(Iterable iterable, Class cls) {
        return m90143x(iterable, (Object[]) Array.newInstance(cls, 0));
    }

    /* renamed from: x */
    static Object[] m90143x(Iterable iterable, Object[] objArr) {
        return m90117B(iterable).toArray(objArr);
    }

    /* renamed from: y */
    public static Object m90144y(Iterable iterable, C58839bc bcVar) {
        return C58570jy.m90168t(iterable.iterator(), bcVar);
    }

    /* renamed from: z */
    public static void m90145z(Iterable iterable, C58839bc bcVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            C58570jy.m90171w(iterable.iterator(), bcVar);
            return;
        }
        bcVar.getClass();
        m90119D((List) iterable, bcVar);
    }

    /* renamed from: e */
    public static Iterable m90124e(Iterable iterable, C58839bc bcVar) {
        iterable.getClass();
        bcVar.getClass();
        return new C58552jg(iterable, bcVar);
    }

    /* renamed from: f */
    public static Iterable m90125f(Iterable iterable, int i) {
        iterable.getClass();
        C58838bb.m90869d(i >= 0, "limit is negative");
        return new C58556jk(iterable, i);
    }

    /* renamed from: g */
    public static Iterable m90126g(Iterable iterable, int i) {
        iterable.getClass();
        C58838bb.m90869d(i >= 0, "number to skip cannot be negative");
        return new C58555jj(iterable, i);
    }

    /* renamed from: h */
    public static Iterable m90127h(Iterable iterable, C58817ah ahVar) {
        iterable.getClass();
        ahVar.getClass();
        return new C58553jh(iterable, ahVar);
    }

    /* renamed from: o */
    static Object m90134o(Iterable iterable, C58839bc bcVar) {
        bcVar.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (bcVar.mo5941a(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static Object m90129j(Iterable iterable, int i, Object obj) {
        iterable.getClass();
        if (i < 0) {
            throw new IndexOutOfBoundsException("position (" + i + ") must not be negative");
        } else if (iterable instanceof List) {
            List list = (List) iterable;
            return i < list.size() ? list.get(i) : obj;
        } else {
            Iterator it = iterable.iterator();
            C58570jy.m90149a(it, i);
            return C58570jy.m90156h(it, obj);
        }
    }
}
