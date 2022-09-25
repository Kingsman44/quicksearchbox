package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.b.ky */
/* compiled from: PG */
public final class C58597ky {
    /* renamed from: a */
    static int m90210a(int i) {
        C58371co.m89408c(i, "arraySize");
        return C60757n.m92748i(((long) i) + 5 + ((long) (i / 10)));
    }

    /* renamed from: d */
    public static ArrayList m90213d(int i) {
        C58371co.m89408c(i, "initialArraySize");
        return new ArrayList(i);
    }

    /* renamed from: e */
    public static ArrayList m90214e(int i) {
        return new ArrayList(m90210a(i));
    }

    /* renamed from: g */
    public static List m90216g(List list) {
        if (list instanceof C58485gu) {
            return ((C58485gu) list).mo55401lD();
        }
        if (list instanceof C58591ks) {
            return ((C58591ks) list).f156287a;
        }
        if (list instanceof RandomAccess) {
            return new C58589kq(list);
        }
        return new C58591ks(list);
    }

    /* renamed from: h */
    public static List m90217h(List list, C58817ah ahVar) {
        if (list instanceof RandomAccess) {
            return new C58593ku(list, ahVar);
        }
        return new C58595kw(list, ahVar);
    }

    /* renamed from: i */
    public static boolean m90218i(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list2 instanceof RandomAccess)) {
            return C58570jy.m90165q(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C58832aw.m90831a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @SafeVarargs
    /* renamed from: c */
    public static ArrayList m90212c(Object... objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList(m90210a(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: f */
    public static List m90215f(List list, int i) {
        list.getClass();
        C58838bb.m90868c(i > 0);
        if (list instanceof RandomAccess) {
            return new C58588kp(list, i);
        }
        return new C58587ko(list, i);
    }

    /* renamed from: b */
    public static ArrayList m90211b(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, it);
        return arrayList;
    }
}
