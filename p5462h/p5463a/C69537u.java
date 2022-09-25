package p5462h.p5463a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.u */
/* compiled from: PG */
class C69537u extends C69534r {
    /* renamed from: h */
    public static final int m100931h(Object[] objArr) {
        C69664n.m101061g(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: i */
    public static final Iterable m100932i(Object[] objArr) {
        C69664n.m101061g(objArr, "<this>");
        return objArr.length == 0 ? C69496am.f185918a : new C69535s(objArr);
    }

    /* renamed from: j */
    public static final Object m100933j(Object[] objArr) {
        C69664n.m101061g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: k */
    public static final Object m100934k(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* renamed from: l */
    public static final HashSet m100935l(Object[] objArr) {
        HashSet hashSet = new HashSet(C69505av.m100860b(objArr.length));
        C69531o.m100941r(objArr, hashSet);
        return hashSet;
    }

    /* renamed from: m */
    public static final List m100936m(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static final List m100937n(Object[] objArr) {
        C69664n.m101061g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C69496am.f185918a;
        }
        if (length != 1) {
            return C69531o.m100938o(objArr);
        }
        return C69540x.m100944b(objArr[0]);
    }

    /* renamed from: o */
    public static final List m100938o(Object[] objArr) {
        C69664n.m101061g(objArr, "<this>");
        C69664n.m101061g(objArr, "<this>");
        return new ArrayList(new C69528l(objArr, false));
    }

    /* renamed from: p */
    public static final Set m100939p(Object[] objArr) {
        C69664n.m101061g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C69498ao.f185920a;
        }
        if (length == 1) {
            return C69514bd.m100887a(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C69505av.m100860b(length));
        C69531o.m100941r(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: q */
    public static final boolean m100940q(Object[] objArr, Object obj) {
        int i;
        C69664n.m101061g(objArr, "<this>");
        C69664n.m101061g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (objArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
            return false;
        }
        int length2 = objArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            } else if (C69664n.m101066l(obj, objArr[i2])) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        return false;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final void m100941r(Object[] objArr, Collection collection) {
        C69664n.m101061g(objArr, "<this>");
        for (Object add : objArr) {
            collection.add(add);
        }
    }
}
